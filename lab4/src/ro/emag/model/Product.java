package ro.emag.model;

public class Product {

  private int id;
  private String name;
  private double price;
  private int quantity;

  public Product(int id, int quantity) {
    this.id = id;
    this.quantity = quantity;
  }

  public Product(
    int id,
    String name,
    double price,
    int quantity
  ) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
