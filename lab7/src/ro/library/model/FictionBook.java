package ro.library.model;

public class FictionBook extends Book implements Comparable, UltraComparable {


  public FictionBook(String ISBN, int numberOfPages, Author author) {
    super(ISBN, numberOfPages, author);
  }

  @Override
  public double computeScore() {
    return this.numberOfPages * 0.02;
  }

  @Override
  public int compareTo(Object object) {
    return 0;
  }
}
