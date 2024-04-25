package pt.ulisboa.tecnico.tuplespaces.server.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ServerState {

  private List<TupleHolder> tuples;

  public ServerState() {
    this.tuples = new ArrayList<TupleHolder>();
  }

  public TupleHolder getTupleHolderByString(String pattern) {
    for (TupleHolder t : tuples) {
      if (t.getTuple().equals(pattern)) {
        return t;
      }
    }
    return null;
  }

  public synchronized void releaseLocks(Integer id){
    for(TupleHolder t: tuples){
      if(t.getClientId().equals(id)){
        t.setClientId(0);
      }
    }
  }

  public int numberOfDiffTuples(List<TupleHolder> tuples){
    List<String> strings = new ArrayList<>();

    for (TupleHolder t: tuples){
      strings.add(t.getTuple());
    }

    HashSet<String> uniqueElements = new HashSet<>(strings);
    return uniqueElements.size();
  }

  public synchronized void put(String tuple) {
    tuples.add(new TupleHolder(tuple));
    notifyAll();
  }

  private synchronized List<TupleHolder> getMatchingTuple(String pattern) {
    List<TupleHolder> matchingTuples = new ArrayList<>();

    for (TupleHolder tuple : this.tuples) {
      if (tuple.getTuple().matches(pattern)) {
        matchingTuples.add(tuple);
      }
    }
    if(matchingTuples.isEmpty()){
      return null;
    }
    return matchingTuples;
  }

  
  public synchronized String read(String pattern) {
    List<TupleHolder> tuple = getMatchingTuple(pattern);

    while (tuple == null) {
      try {
        wait(); // wait until it finds a match
      } catch (InterruptedException e) {
        throw new RuntimeException("Interrupted while waiting for a matching tuple", e);
      }
      tuple = getMatchingTuple(pattern);
    }
    return tuple.get(0).getTuple();
  }

  public synchronized List<String> takePhase1(String pattern, Integer id){
    List<TupleHolder> allTuples = getMatchingTuple(pattern);
    List<String> finalTuples = new ArrayList<>();

    while (allTuples == null) {
      try {
        wait(); // wait until it finds a match
      } catch (InterruptedException e) {
        throw new RuntimeException("Interrupted while waiting for a matching tuple", e);
      }
      allTuples = getMatchingTuple(pattern);
    }

    int count = numberOfDiffTuples(allTuples);

    for(TupleHolder t : allTuples){
      if(t.getClientId() == 0 && !finalTuples.contains(t.getTuple())){
        finalTuples.add(t.getTuple());
        t.setClientId(id);
      }
    }

    if(!finalTuples.isEmpty() && finalTuples.size() < count){
      finalTuples.clear();
    }

    return finalTuples;
  }

  public synchronized void takePhase1Release(Integer id){
    releaseLocks(id);
  }

  public synchronized void takePhase2(String pattern, Integer id){
    TupleHolder tuple = getTupleHolderByString(pattern);
    tuples.remove(tuple);
    releaseLocks(id);
  }

  public synchronized List<String> getTupleSpacesState() {
    ArrayList<String> patterns = new ArrayList<>();

    for(TupleHolder t: this.tuples){
      patterns.add(t.getTuple());
    }
    return patterns;
  }
}
