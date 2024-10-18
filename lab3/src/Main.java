// package not required

import oop.Student;
import oop.lab.third.Desk;
import oop.lab.third.fourth.Desk1;

/**
 *
 */
public class Main {

  Student student;
  //

  public static void main(String[] args) {

    Main oop = new Main();
    System.out.println(oop.sum(2, 3));

    Student alexandru = new Student();
    Student marcel = new Student();

    alexandru.setName("alexandru");
    marcel.setName("marcel");

    Student.incrementCount();

    String alexandruName = alexandru.getName();

    Student.incrementCount();

    String marcelName = marcel.getName();

    System.out.println(alexandruName);
    System.out.println(marcelName);
  }

  public int sum(int x, int y) {
    return x + y;
  }

  protected static int addExact2(int x, int y) {
    return x + y;
  }
}