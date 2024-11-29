package ro.library.model;

import java.util.Comparator;
import java.util.Objects;

public abstract class Book implements Comparable {

  private String ISBN;
  protected int numberOfPages;
  public Author author = new Author("");
  
  public Book() {
    
  }

  public Book(
    String ISBN, 
    int numberOfPages, 
    Author author
  ) {
    this.ISBN = ISBN;
    this.numberOfPages = numberOfPages;
    this.author = author;
  }
  
  // display details method
  public void displayDetails() {
    String details = String.format(
      "ISBN: %s \nnumberOfPages: %d\nauthorName: %s\nscore: %f",
      this.ISBN,
      this.numberOfPages,
      this.author != null ? this.author.getName(): "-",
      this.computeScore()
    );
    System.out.println(details);
  }

  public Author getAuthor() {
    return this.author;
  }

  public abstract double computeScore();

  private Author[] computeSomething(int numberOfPages) {
    return null;
  }

  @Override
  public int compareTo(Object object) {
    if (object instanceof Book) {
      Book book = (Book) object;
      if (this.getAuthor() == null) {
        if (book.getAuthor() == null) {
          return 0;
        }
        return -1;
      } else {
        if (book.getAuthor() == null) {
          return 1;
        }
        String thisAuthorName = this.getAuthor().getName();
        String bookAuthorName = book.getAuthor().getName();
        return thisAuthorName != null ? thisAuthorName.compareTo(bookAuthorName): -1;
      }
    }
    // should not get here as long as we're not
    // comparing book objects with other type instances
    return 0;
  }
}
