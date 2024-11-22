import ro.library.model.Book;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");
    Book[] books = new Book[10];

    Book book1 = new Book() {
      @Override
      public double computeScore() {
        return 1;
      }
    };
  }
}