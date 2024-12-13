public class MyList<U extends String> {

  private U[] values;

  public MyList(U[] values) {
    this.values = values;
  }


  public void add(U value) {
    U[] newValues = (U[]) new Object[values.length + 1];
    for (int i = 0; i < values.length; i++) {
      newValues[i] = values[i];
    }
    newValues[values.length] = value;
    values = newValues;
  }

  public U get(int index) {
    return values[index];
  }
}
