package pt.ulisboa.tecnico.tuplespaces.client;

import java.util.ArrayList;
import java.util.Objects;

public class ResponseCollector<T> {
    ArrayList<T> collectedResponses;

    public ResponseCollector() {
        collectedResponses = new ArrayList<>();
    }

    synchronized public void addString(T t) {
        collectedResponses.add(t);
        notifyAll();
    }

    synchronized public ArrayList<T> getStrings() {
        return new ArrayList<>(collectedResponses);
    }

    synchronized public void waitUntilAllReceived(int n) throws InterruptedException {
        while (collectedResponses.size() < n)
            wait();
    }
}
