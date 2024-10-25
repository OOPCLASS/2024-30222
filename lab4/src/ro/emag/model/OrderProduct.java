package ro.emag.model;

public class OrderProduct {

  private int productId;
  private double price;
  private int quantity;

  public OrderProduct(int productId, double price, int quantity) {
    this.productId = productId;
    this.price = price;
    this.quantity = quantity;
  }

  public int getProductId() {
    return productId;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }
}
