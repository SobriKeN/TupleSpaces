package pt.ulisboa.tecnico.tuplespaces.server;

import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import pt.ulisboa.tecnico.tuplespaces.replicaXuLiskov.contract.TupleSpacesReplicaXuLiskov.*;
import pt.ulisboa.tecnico.tuplespaces.replicaXuLiskov.contract.TupleSpacesReplicaGrpc;
import pt.ulisboa.tecnico.tuplespaces.server.domain.ServerState;
import java.util.List;

import static io.grpc.Status.INVALID_ARGUMENT;

public class ServerImpl extends TupleSpacesReplicaGrpc.TupleSpacesReplicaImplBase{
    private ServerState state;

    public ServerImpl(ServerState state) {
        this.state = state;
    }

    @Override
    public void put(PutRequest request,
                    StreamObserver<PutResponse> responseObserver){
        String tuple = request.getNewTuple();

        try{
            this.state.put(tuple);

            PutResponse response = PutResponse.newBuilder().build();
            // Send a single response through the stream.
            responseObserver.onNext(response);
            // Notify the client that the operation has been completed.
            responseObserver.onCompleted();
        } catch (RuntimeException e) {
            responseObserver.onError(INVALID_ARGUMENT.withDescription(e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void read(ReadRequest request, StreamObserver<ReadResponse> responseObserver){
        String searchPattern = request.getSearchPattern();

        try {
            String tuple = this.state.read(searchPattern);

            ReadResponse response = ReadResponse.newBuilder().setResult(tuple).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (RuntimeException e) {
            responseObserver.onError(INVALID_ARGUMENT.withDescription(e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void takePhase1(TakePhase1Request request, StreamObserver<TakePhase1Response> responseObserver){
        String searchPattern = request.getSearchPattern();
        Integer clientId = request.getClientId();

        try {
            List<String> tuples = this.state.takePhase1(searchPattern, clientId);

            TakePhase1Response response = TakePhase1Response.newBuilder().addAllReservedTuples(tuples).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (RuntimeException e) {
            responseObserver.onError(INVALID_ARGUMENT.withDescription(e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void takePhase1Release(TakePhase1ReleaseRequest request, StreamObserver<TakePhase1ReleaseResponse> responseObserver){
        Integer clientId = request.getClientId();

        try {
            this.state.takePhase1Release(clientId);

            TakePhase1ReleaseResponse response = TakePhase1ReleaseResponse.newBuilder().build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (RuntimeException e) {
            responseObserver.onError(INVALID_ARGUMENT.withDescription(e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void takePhase2(TakePhase2Request request, StreamObserver<TakePhase2Response> responseObserver){
        String pattern = request.getTuple();
        Integer clientId = request.getClientId();

        try {
            this.state.takePhase2(pattern, clientId);

            TakePhase2Response response = TakePhase2Response.newBuilder().build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (RuntimeException e) {
            responseObserver.onError(INVALID_ARGUMENT.withDescription(e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void getTupleSpacesState(getTupleSpacesStateRequest request, StreamObserver<getTupleSpacesStateResponse> responseObserver){
        try {
            List<String> tuples = this.state.getTupleSpacesState();

            getTupleSpacesStateResponse response = getTupleSpacesStateResponse.newBuilder().addAllTuple(tuples).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (RuntimeException e) {
            responseObserver.onError(INVALID_ARGUMENT.withDescription(e.getMessage()).asRuntimeException());
        }
    }
}
