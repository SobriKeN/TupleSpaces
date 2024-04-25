package pt.ulisboa.tecnico.tuplespaces.client;

import io.grpc.stub.StreamObserver;
import pt.ulisboa.tecnico.tuplespaces.client.ResponseCollector;

import java.util.ArrayList;


public class ClientObserver<T> implements StreamObserver<T> {
    ResponseCollector<T> collector;

    public ClientObserver (ResponseCollector<T> c) {
        collector = c;
    }

    @Override
    public void onNext(T t) {
        collector.addString(t);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Received error: " + throwable);
    }

    @Override
    public void onCompleted() {
    }
}
