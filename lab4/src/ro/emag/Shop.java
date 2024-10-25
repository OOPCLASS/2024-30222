package ro.emag;

import java.time.LocalDateTime;
import ro.emag.model.Client;
import ro.emag.model.Order;
import ro.emag.model.OrderProduct;
import ro.emag.model.Product;

public class Shop {

  private static int nextEntityId = 1;
  private Client[] clients; // register of clients
  private int clientsIndex = 0;
  private Product[] products; // stock of products
  private int productsIndex = 0;
  private Order[] orders; // history of all orders
  private int ordersIndex = 0;

  public Shop() {
    clients = new Client[0];
    products = new Product[0];
    orders = new Order[0];
  }

  public void addClient(Client client) {
    // resize the array if it's full
    if (clientsIndex == clients.length) {
      Client[] newClients = new Client[clients.length + 1];
      System.arraycopy(clients, 0, newClients, 0, clients.length);
      clients = newClients;
    }
    clients[clientsIndex++] = client;
  }

  public void addProduct(Product product) {
    // resize the array if it's full
    if (productsIndex == products.length) {
      Product[] newProducts = new Product[products.length + 1];
      System.arraycopy(products, 0, newProducts, 0, products.length);
      products = newProducts;
    }
    products[productsIndex++] = product;
  }

  public String addOrder(Order order) {
    // check if the client exists
    // if not, add it
    if (!clientExists(order.getClient())) {
      addClient(order.getClient());
    }
    // check if the products exist
    // if not, return missing products
    String message = checkOutOfStockProducts(order);
    if (message != null) {
      return message;
    }
    // resize the array if it's full
    addOrderToHistory(order);
    // update the stock of products
    updateStockOfProducts(order);
    return "Order placed successfully!";
  }

  private String checkOutOfStockProducts(Order order) {
    Product[] outOfStockProducts = getOutOfStockProducts(order.getProducts());
    if (outOfStockProducts != null) {
      // format the message nicely
      StringBuilder message = new StringBuilder();
      message.append("The following products are out of stock: ");
      for (Product product : outOfStockProducts) {
        message.append(product.getName()).append(" - available stock: ").append(product.getQuantity()).append("\n");
      }
      return message.toString();
    }
    return null;
  }

  private Product[] getOutOfStockProducts(OrderProduct[] productsToOrder) {
    Product[] outOfStockProducts = null;
    for (OrderProduct productToOrder : productsToOrder) {
      for (Product product : products) {
        if (product.getId() == productToOrder.getProductId() && product.getQuantity() < productToOrder.getQuantity()) {
          if (outOfStockProducts == null) {
            outOfStockProducts = new Product[1];
            outOfStockProducts[0] = product;
          } else {
            Product[] newOutOfStockProducts = new Product[outOfStockProducts.length + 1];
            System.arraycopy(outOfStockProducts, 0, newOutOfStockProducts, 0, outOfStockProducts.length);
            newOutOfStockProducts[outOfStockProducts.length] = product;
            outOfStockProducts = newOutOfStockProducts;
          }
        }
      }
    }
    return outOfStockProducts;
  }

  private void addOrderToHistory(Order order) {
    if (ordersIndex == orders.length) {
      Order[] newOrders = new Order[orders.length + 1];
      System.arraycopy(orders, 0, newOrders, 0, orders.length);
      orders = newOrders;
    }
    order.setDate(LocalDateTime.now());
    orders[ordersIndex++] = order;
  }

  private void updateStockOfProducts(Order order) {
    for (OrderProduct productToOrder : order.getProducts()) {
      for (Product product : products) {
        if (product.getId() == productToOrder.getProductId()) {
          product.setQuantity(product.getQuantity() - productToOrder.getQuantity());
        }
      }
    }
  }

  private boolean clientExists(Client client) {
    for (int i = 0; i < clientsIndex; i++) {
      if (clients[i].getId() == client.getId()) {
        return true;
      }
    }
    return false;
  }

  public static int getNextEntityId() {
    return nextEntityId++;
  }

  public void printShopStatus() {
    System.out.println("\n\nShop status:");
    System.out.println("Clients: " + clientsIndex);
    if (clientsIndex == 0) {
      System.out.println("\tNo clients found!");
    } else {
      for (Client client : clients) {
        if (client != null) {
          System.out.println("\t" + client.getName() + " - placed " + client.getNumberOfPlacedOrders() + " orders");
        }
      }
    }
    System.out.println("Products: " + productsIndex);
    if (productsIndex == 0) {
      System.out.println("\tNo products found!");
    } else {
      for (Product product : products) {
        if (product != null) {
          System.out.println("\t" + product.getName() + " - " + product.getQuantity());
        }
      }
    }
    System.out.println("Orders: " + ordersIndex);
    if (ordersIndex == 0) {
      System.out.println("\tNo orders found!");
    } else {
      for (Order order : orders) {
        if (order != null) {
          System.out.println("\t" + order.getClient().getName() + " - " + order.getTotal());
        }
      }
    }
  }
}
