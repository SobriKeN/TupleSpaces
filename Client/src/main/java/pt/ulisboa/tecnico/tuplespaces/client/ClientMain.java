package pt.ulisboa.tecnico.tuplespaces.client;

import static io.grpc.Status.INVALID_ARGUMENT;
import static java.lang.System.exit;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import pt.ulisboa.tecnico.nameserver.contract.NameServerGrpc;
import pt.ulisboa.tecnico.nameserver.contract.NameServerOuterClass.*;
import pt.ulisboa.tecnico.tuplespaces.replicaXuLiskov.contract.TupleSpacesReplicaXuLiskov;
import pt.ulisboa.tecnico.tuplespaces.client.grpc.ClientService;

import java.util.List;


public class ClientMain {
    static final int numServers = 3;
    public static void main(String[] args) {

        // get the host and the port
        final String host = "localhost";
        final int port = 5001;
        final String service = "TupleSpaces";
        final int id = Integer.parseInt(args[0]);

        String target = host + ":" + port;

        final ManagedChannel channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();
        final NameServerGrpc.NameServerBlockingStub stub = NameServerGrpc.newBlockingStub(channel);

        LookupRequest request = LookupRequest.newBuilder().setServiceName(service).setQualifier("").build();
        String[] servers = stub.lookup(request).getServersList().toArray(new String[0]);
        if(servers.length == 0) {
            channel.shutdown();
            exit(0);
        }

        CommandProcessor parser = new CommandProcessor(new ClientService(ClientMain.numServers, servers, id));
        parser.parseInput();

        // A Channel should be shutdown before stopping the process
        channel.shutdown();
        parser.getClientService().shutdown();
    }
}
