package oop;

import java.time.LocalDateTime;

public class Register {

  private Person[] persons = new Person[10];

  public Register() {
    persons[0] = new Person("Alex");
    persons[0].birthday = LocalDateTime.now();
  }
}
