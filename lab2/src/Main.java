import java.util.Scanner;

public class Main {

  /**
   * Here are 10 problem examples that can help your
   * students get used to Java syntax while practicing
   * basic control structures, loops, conditionals, and
   * functions:
   *
   * ### 1. **Sum of Numbers**
   *    Write a program that takes an integer `n` from
   *    the user and calculates the sum of all integers
   *    from 1 to `n` using both a `for` loop and a `while`
   *    loop. Compare the outputs.
   *
   * ### 2. **Even or Odd**
   *    Write a program that takes an integer input
   *    and determines if the number is even or odd
   *    using an `if-else` statement. Extend the program
   *    to use a `switch` statement for the same logic.
   *
   * ### 3. **Simple Calculator**
   *    Write a simple calculator program that takes
   *    two integers and an operator (`+`, `-`, `*`, `/`)
   *    as input and performs the corresponding operation
   *    using a `switch` statement.
   *
   * ### 4. **Factorial Calculation**
   *    Write a function to calculate the factorial of a
   *    number using recursion. Call this function from
   *    the `main` method and display the result.
   *
   * ### 5. **Prime Number Check**
   *    Write a program that checks if a number is prime.
   *    Use a `for` loop to test divisibility and an `if`
   *    statement to output whether the number is prime or
   *    not.
   *
   * ### 6. **Multiplication Table**
   *    Write a program that generates and prints the
   *    multiplication table (up to 10) for a number
   *    input by the user using a `for` loop.
   *
   * ### 7. **Fibonacci Sequence**
   *    Write a program that generates the first `n`
   *    numbers of the Fibonacci sequence. Use both `for`
   *    and `while` loops to generate the sequence and
   *    compare them.
   *
   * ### 8. **Sum of Digits**
   *    Write a program that takes an integer input and
   *    calculates the sum of its digits using a `while`
   *    loop. For example, if the input is 123, the sum
   *    should be 1 + 2 + 3 = 6.
   *
   * ### 9. **Greatest of Three Numbers**
   *    Write a function that takes three integers as
   *    arguments and returns the greatest number. Use
   *    an `if-else` ladder in the function.
   *
   * ### 10. **Leap Year Check**
   *    Write a program to check if a given year is
   *    a leap year. Use a `switch` statement to handle
   *    different cases based on divisibility rules
   *    (divisible by 4, 100, and 400).
   *
   * These exercises should help your students gain
   * familiarity with basic Java control structures and
   * writing simple functions.
   * @param args
   */
  public static void main(String[] args) {
    int value = 5;
    System.out.println(add(10, value));
    Scanner scanner = new Scanner(System.in);
    // read one char
    char c = scanner.next().charAt(0);
    System.out.println("You entered: " + c);
    // read a string
    String s = scanner.next();
    System.out.println("You entered: " + s);
  }

  // add 2 numbers
  public static int add(int a, int b) {
    int r = a + b;
    b += 1;
    return r;
  }
}