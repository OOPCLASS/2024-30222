package ro.emag;

import ro.emag.model.Client;
import ro.emag.model.Order;
import ro.emag.model.OrderProduct;
import ro.emag.model.Product;

public class ShopTest {

  public static void main(String[] args) {
    // create a shop
    Shop shop = new Shop();
    shop.printShopStatus();
    // create a client
    Client client = new Client(
      Shop.getNextEntityId(),
      "John Doe",
      "john.doe@gmail.com",
      "0722222222",
      "str. Observatorului, nr. 34"
    );
    // add the client to the shop
    shop.addClient(client);

    // create some products
    Product[] products = getProducts();
    // add the products to the shop
    for (Product product : products) {
      shop.addProduct(product);
    }
    // TODO: create a method to add multiple products at once "addAll(Product[] products)"

    shop.printShopStatus();

    // create an order
    OrderProduct laptop = new OrderProduct(products[0].getId(), products[0].getPrice(), 1);
    OrderProduct smartphone = new OrderProduct(products[1].getId(), products[1].getPrice(), 1);
    Order order = new Order(
      Shop.getNextEntityId(),
      client,
      new OrderProduct[] {laptop, smartphone}
    );
    // add the order to the shop
    String message = shop.addOrder(order);
    if ("Order placed successfully!".equals(message)) {
      client.addOrder(order);
    }
    System.out.println();
    System.out.println(message);

    shop.printShopStatus();
  }

  private static Product[] getProducts() {
    Product[] products = new Product[3];
    products[0] = new Product(
      Shop.getNextEntityId(),
      "Laptop",
      2500,
      10
    );
    products[1] = new Product(
      Shop.getNextEntityId(),
      "Smartphone",
      1500,
      20
    );
    products[2] = new Product(
      Shop.getNextEntityId(),
      "Tableta",
      1000,
      15
    );
    return products;
  }
}
