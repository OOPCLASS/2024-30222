public class Person {

  private String name;
  private int age;

  @Override
  public int hashCode() {
    // hashing function for name and age
    int hash = 0;
    if (name != null) {
      for (char c : name.toCharArray()) {
        hash += c;
      }
    }
    if (age > 0) {
      hash += age;
    }
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (this == obj) {
      return true;
    }
    if (this.getClass() != obj.getClass()) {
      return false;
    }
    Person other = (Person) obj;
    return this.name.equals(other.name);
  }
}
