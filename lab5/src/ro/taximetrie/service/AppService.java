package ro.taximetrie.service;


public class AppService<T> {
  public T save(T driver) {
    // save the driver in the DB
    return driver;
  }

  public void delete(T driver) {
    // delete the driver from the DB
  }
}
