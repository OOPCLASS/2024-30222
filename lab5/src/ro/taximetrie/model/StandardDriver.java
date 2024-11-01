package ro.taximetrie.model;

public class StandardDriver extends Driver {

  public StandardDriver() {
    this("Standard Driver");
  }

  public StandardDriver(String name) {
    super(name);
  }

  public boolean equals(Object obj) {
    return false;
  }
}
