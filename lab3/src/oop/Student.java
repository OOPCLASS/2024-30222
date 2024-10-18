package oop;

public class Student {

    private static int count = 0;
    private String name;
    private String email;
    private int age;

    public Student() {
      name = "John Doe";
      email = "my@email.ro";
      age = 20;
    }

  public void setName(String name) {
    this.name = name;
  }


    public String getName() {
      return name + " " + count;
    }

    public static void incrementCount() {
      count++;
    }
}
