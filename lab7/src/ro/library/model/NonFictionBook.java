package ro.library.model;

public class NonFictionBook extends Book {

  public double computeScore() {
    return numberOfPages * 0.03;
  }
}
