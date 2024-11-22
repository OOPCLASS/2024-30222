package ro.library.model;

import java.io.Serializable;

public class FictionBook extends Book implements Comparable, UltraComparable {


  @Override
  public double computeScore() {
    return this.numberOfPages * 0.02;
  }

  @Override
  public int compareTo(Object object) {
    return 0;
  }
}
