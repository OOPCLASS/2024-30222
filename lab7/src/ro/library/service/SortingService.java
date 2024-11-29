package ro.library.service;

import ro.library.model.Comparable;

public class SortingService {

  public void sort(Comparable[] objects) {
    // TODO implement a sorting algorithm
    int n = objects.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (objects[j].compareTo(objects[j + 1]) > 0) {
          // Swap objects[j] and objects[j + 1]
          Comparable temp = objects[j];
          objects[j] = objects[j + 1];
          objects[j + 1] = temp;
        }
      }
    }
  }
}
