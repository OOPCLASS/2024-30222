package ro.emag.model;

public class Client {

  private int id;
  private String name;
  private String email;
  private String phone;
  private String address;
  private Order[] ordersHistory;

  public Client(
    int id,
    String name,
    String email,
    String phone,
    String address
  ) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.address = address;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getPhone() {
    return phone;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Order[] getOrdersHistory() {
    return ordersHistory;
  }

  public void addOrder(Order order) {
    if (ordersHistory == null) {
      ordersHistory = new Order[1];
      ordersHistory[0] = order;
    } else {
      Order[] newOrdersHistory = new Order[ordersHistory.length + 1];
      System.arraycopy(ordersHistory, 0, newOrdersHistory, 0, ordersHistory.length);
      // SAU
      // for (int i = 0; i < ordersHistory.length; i++) {
      //    newOrdersHistory[i] = ordersHistory[i];
      // }
      newOrdersHistory[ordersHistory.length] = order;
      ordersHistory = newOrdersHistory;
    }
  }

  public String getNumberOfPlacedOrders() {
    return ordersHistory == null ? "0" : String.valueOf(ordersHistory.length);
  }
}
