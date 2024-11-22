package ro.library.model;

public abstract class Book implements Comparable {

  private String ISBN;
  protected int numberOfPages;
  public Author author = new Author();
  
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

  public abstract double computeScore();

  private Author[] computeSomething(int numberOfPages) {
    return null;
  }

  @Override
  public int compareTo(Object object) {
    // TODO implementation for comparing 2 Book instances
    // this.getAuthor().getName() si object.getAuthor().getName()
    return 0;
  }
}
