public class MyStringList {

  private String[] values;

  public MyStringList() {
    values = new String[0];
  }

  public void add(String value) {
    String[] newValues = new String[values.length + 1];
    for (int i = 0; i < values.length; i++) {
      newValues[i] = values[i];
    }
    newValues[values.length] = value;
    values = newValues;
  }

  public String get(int index) {
    return values[index];
  }
}
