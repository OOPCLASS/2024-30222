package ro.library.model;

public abstract class ScienceBook extends Book {

  @Override
  public double computeScore() {
    return 0;
  }

  public abstract void getSomething();
}
