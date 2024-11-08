package ro.hotel.model;

// class A is a B
// Client extends Person - ok
// Client extends Hotel - not ok
// Dog extends Animal - ok
// Room extends Hotel -
public class Client extends Person {

  // overloading - supraincarcare
  // overriding - suprascriere
  // inheritance - mostenire
  public Client() {
  }

  public Client(String name) {

  }

  public int getClient() {
    return 1;
  }

  public String getName() {
    return "Client: " + name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
