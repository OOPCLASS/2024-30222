package oop;

import java.time.LocalDateTime;

public class Person {

  private String name;
  protected LocalDateTime birthday = LocalDateTime.now();
  public int age;
  String id;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
