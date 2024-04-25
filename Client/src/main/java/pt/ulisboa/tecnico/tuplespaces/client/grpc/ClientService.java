package pt.ulisboa.tecnico.tuplespaces.client.grpc;

import com.google.protobuf.ProtocolStringList;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import pt.ulisboa.tecnico.tuplespaces.replicaXuLiskov.contract.TupleSpacesReplicaXuLiskov.*;
import pt.ulisboa.tecnico.tuplespaces.replicaXuLiskov.contract.TupleSpacesReplicaGrpc;
import pt.ulisboa.tecnico.tuplespaces.client.util.OrderedDelayer;
import pt.ulisboa.tecnico.tuplespaces.client.ClientObserver;
import pt.ulisboa.tecnico.tuplespaces.client.ResponseCollector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ClientService {
    int id;
    OrderedDelayer delayer;
    ManagedChannel[] channels;
    TupleSpacesReplicaGrpc.TupleSpacesReplicaStub[] stubs;
    public ClientService(int numServers, String[] servers, int clientId) {
        id = clientId;
        channels = new ManagedChannel[numServers];
        stubs = new TupleSpacesReplicaGrpc.TupleSpacesReplicaStub[numServers];

        for (int i = 0; i < numServers; i++) {
            channels[i] = ManagedChannelBuilder.forTarget(servers[i]).usePlaintext().build();
            stubs[i] = TupleSpacesReplicaGrpc.newStub(channels[i]);
        }

        delayer = new OrderedDelayer(numServers);
    }

    public void releaseLock(Integer clientId) {
        Iterator<Integer> iterator = delayer.iterator();
        ResponseCollector<TakePhase1ReleaseResponse> c = new ResponseCollector<>();
        TakePhase1ReleaseRequest request = TakePhase1ReleaseRequest.newBuilder().setClientId(clientId).build();

        Thread thread = new Thread(() -> {
            while(iterator.hasNext()){
                Integer id = iterator.next();
                stubs[id].takePhase1Release(request, new ClientObserver<>(c));
            }});

        thread.start();

        try {
            c.waitUntilAllReceived(stubs.length);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String put(String tuple) {
        Iterator<Integer> iterator = delayer.iterator();
        ResponseCollector<PutResponse> c = new ResponseCollector<>();
        PutRequest request = PutRequest.newBuilder().setNewTuple(tuple).build();

        Thread thread = new Thread(() -> {
            while(iterator.hasNext()){
                Integer id = iterator.next();
                stubs[id].put(request, new ClientObserver<>(c));
            }});

        thread.start();

        try {
            c.waitUntilAllReceived(stubs.length);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "OK\n";
    }

    public String read(String tuple){
        Iterator<Integer> iterator = delayer.iterator();
        ResponseCollector<ReadResponse> c = new ResponseCollector<>();
        ReadRequest request = ReadRequest.newBuilder().setSearchPattern(tuple).build();

        Thread thread = new Thread(() -> {
            while(iterator.hasNext()){
            Integer id = iterator.next();
            stubs[id].read(request, new ClientObserver<>(c));
        }});

        thread.start();

        try {
            c.waitUntilAllReceived(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        ArrayList<ReadResponse> response = c.getStrings();

        return "OK\n" + response.get(0).getResult() + "\n";
    }

    public List<String> getTupleSpacesState(int index){
        ResponseCollector<getTupleSpacesStateResponse> c = new ResponseCollector<>();
        getTupleSpacesStateRequest request = getTupleSpacesStateRequest.newBuilder().build();
        stubs[index].getTupleSpacesState(request, new ClientObserver<>(c));

        try {
            c.waitUntilAllReceived(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        ArrayList<getTupleSpacesStateResponse> response = c.getStrings();

        return response.get(0).getTupleList();
    }

    /* This method allows the command processor to set the request delay assigned to a given server */
    public void setDelay(int id, int delay) {
        delayer.setDelay(id, delay);
    }

    public void shutdown(){
        for (ManagedChannel ch : channels)
            ch.shutdown();
    }


    public String take(String tuple) {
        // Phase 1: Reserve the tuple
        Iterator<Integer> iterator = delayer.iterator();
        ArrayList<Integer> order = new ArrayList<>();
        ResponseCollector<TakePhase1Response> c1 = new ResponseCollector<>();
        TakePhase1Request request1 = TakePhase1Request.newBuilder()
                .setSearchPattern(tuple)
                .setClientId(id)
                .build();

        Thread thread1 = new Thread(() -> {
            while(iterator.hasNext()){
                Integer id = iterator.next();
                order.add(id);
                stubs[id].takePhase1(request1, new ClientObserver<>(c1));
            }});

        thread1.start();

        try {
            c1.waitUntilAllReceived(stubs.length);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<TakePhase1Response> responses = c1.getStrings();
        int rejectedCount = 0, acceptedCount = 0;

        // Check if reservation is successful (accepted by majority)
        for (TakePhase1Response t : responses){
            if (t.getReservedTuplesList().isEmpty()){
                rejectedCount++;
            }
            else {
                acceptedCount++;
            }
        }

        List<String> intersection = new ArrayList<>();


        if(acceptedCount > rejectedCount){
            if(rejectedCount == 1){
                for (int i = 0; i < responses.size(); i++){
                    if(responses.get(i).getReservedTuplesList().isEmpty()){
                        boolean hasResponse = false;
                        while(!hasResponse){
                            stubs[order.get(i)].takePhase1(request1, new ClientObserver<>(c1));

                            try {
                                c1.waitUntilAllReceived(1);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }

                            List<TakePhase1Response> response = c1.getStrings();

                            if(!response.get(0).getReservedTuplesList().isEmpty()){
                                responses.set(i, response.get(0));
                                acceptedCount++;
                                rejectedCount--;
                                order.clear();
                                hasResponse = true;
                            }

                            try {
                                Thread.sleep(new Random().nextInt(2001));
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        break;
                    }
                }
            }

            if (rejectedCount == 0){
                intersection = new ArrayList<>(responses.get(0).getReservedTuplesList());
                for (int i = 1; i < responses.size(); i++) {
                    intersection.retainAll(responses.get(i).getReservedTuplesList());
                }
            }
        }

        if (rejectedCount > acceptedCount || intersection.isEmpty()){
            releaseLock(id);
            try {
                Thread.sleep(new Random().nextInt(2001) + 2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return take(tuple); // release and retry
        }

        int randomIndex = new Random().nextInt(intersection.size());
        String particularTuple = intersection.get(randomIndex);

        // Phase 2
        Iterator<Integer> iterator2 = delayer.iterator();
        ResponseCollector<TakePhase2Response> c2 = new ResponseCollector<>();
        TakePhase2Request request2 = TakePhase2Request.newBuilder().setClientId(id).setTuple(particularTuple).build();

        Thread thread2 = new Thread(() -> {
            while(iterator2.hasNext()){
                Integer id = iterator2.next();
                stubs[id].takePhase2(request2, new ClientObserver<>(c2));
            }});

        thread2.start();

        try {
            c2.waitUntilAllReceived(stubs.length);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Isto resolveu o problema que tive na aula de terça, não sei se é suposto ter
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "OK\n" + particularTuple + "\n";
    }
}
