package pt.ulisboa.tecnico.tuplespaces.server.domain;

public class TupleHolder{
  private String tuple;
  private Integer clientId;

  public TupleHolder(String tuple){
    this.tuple = tuple;
    this.clientId = 0;
  }

  public String getTuple() {
    return tuple;
  }

  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }
}
