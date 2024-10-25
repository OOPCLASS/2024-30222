package ro.emag.model;

import java.time.LocalDateTime;

public class Order {

  private int id;
  private Client client;
  private OrderProduct[] products;
  private LocalDateTime date;

  public Order(int id, Client client, OrderProduct[] products) {
    this.id = id;
    this.client = client;
    this.products = products;
  }

  public int getId() {
    return id;
  }

  public Client getClient() {
    return client;
  }

  public OrderProduct[] getProducts() {
    return products;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public void setProducts(OrderProduct[] products) {
    this.products = products;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public double getTotal() {
    double total = 0;
    for (OrderProduct product : products) {
      total += product.getPrice();
    }
    return total;
  }
}
