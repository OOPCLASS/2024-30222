public class MyPersonList {
  private Person[] values;

  public MyPersonList() {
    values = new Person[0];
  }

  public void add(Person value) {
    Person[] newValues = new Person[values.length + 1];
    for (int i = 0; i < values.length; i++) {
      newValues[i] = values[i];
    }
    newValues[values.length] = value;
    values = newValues;
  }

  public Person get(int index) {
    return values[index];
  }
}
