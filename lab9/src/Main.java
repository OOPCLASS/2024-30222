import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Problem Statement:
 *
 * Online Store Management System
 *
 * Implement a system that allows users to add products to a shopping cart,
 * calculate the total order value, and place orders. Users may encounter
 * exceptions such as adding a product that is out of stock or providing an
 * insufficient payment amount.
 *
 * Requirements:
 * 1. Products:
 *    - Each product has a name, a unique product ID, a quantity in stock, and a price.
 *    - Users can add products to their shopping cart.
 *
 * 2. Shopping Cart:
 *    - The cart contains a collection of products (use a generic collection such as
 *      ArrayList or HashMap).
 *    - Verify if the product is available before adding it to the cart.
 *
 * 3. Orders:
 *    - Users can place orders by calculating the total value of the cart.
 *    - If the payment is insufficient, an exception should be thrown.
 *
 * 4. Exceptions:
 *    - OutOfStockException: Thrown when the user tries to add a product
 *      that is out of stock.
 *    - InvalidPaymentException: Thrown when the payment amount is less
 *      than the total order value.
 *
 * 5. Generic Classes:
 *    - Use generic classes to manage the shopping cart and orders, allowing
 *      for reusable and flexible code.
 *
 * Key Functionality:
 * - Products should be managed in a collection (e.g., HashMap for inventory).
 * - Shopping cart should be implemented using a generic class, storing the items
 *   added by the user.
 * - Orders should calculate the total value of the cart and validate the payment.
 * - Exception handling should cover out-of-stock errors and invalid payment scenarios.
 *
 * Example Workflow:
 * - Add products to the store inventory.
 * - Users add products to their shopping cart (verify stock availability).
 * - Calculate the total value of the cart.
 * - Attempt to place an order (validate payment and throw exceptions if necessary).
 */

public class Main {

  public static void main(String[] args) {
    MyStringList list = new MyStringList();
    MyList<String> list2 = new MyList<>(new String[]{"abc", "def"});

    ArrayList<String> list3 = new ArrayList<>();
    List<String> list4 = new LinkedList<>();

    Map<String, Person> myMap = new HashMap<>();


    list4.add("abc");
    if (list4.contains("abc")) {
      System.out.println("Found");
    }

    list3.add("abc");
    list3.add("def");
    if (list3.contains("def")) {

    }

    Map<Person, String> myMap = new HashMap<>();
    myMap.put(new Person(), "Alex");
  }

  // give an example of a generic method
  public static <T> void print(T[] values) {
    for (T value : values) {
      System.out.println(value);
    }
  }
}