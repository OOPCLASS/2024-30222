import ro.library.model.Author;
import ro.library.model.Book;
import ro.library.model.FictionBook;
import ro.library.service.SortingService;

public class Main {

  public static void main(String[] args) {
    Book[] books = new Book[3];
    Author firstAuthor = new Author("3");
    Author secondAuthor = new Author("2");
    Author thirdAuthor = new Author("1");
    books[0] = new FictionBook("Book 3", 300, thirdAuthor);
    books[1] = new FictionBook("Book 2", 200, secondAuthor);
    books[2] = new FictionBook("Book 1", 100, firstAuthor);

    SortingService service = new SortingService();
    for (Book book : books) {
      System.out.println(book.getAuthor().getName());
    }
    service.sort(books);
    for (Book book : books) {
      System.out.println(book.getAuthor().getName());
    }
  }
}