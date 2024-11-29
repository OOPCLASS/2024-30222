import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// create at least 2 exceptions
// UsernameNotFoundException - checked exception
// InvalidPasswordException - unchecked exception

/**
 * implement a login form which has a username and password (String fields)
 * if the username is not found in the database (array of User), throw UsernameNotFoundException
 * if the password is invalid, throw InvalidPasswordException
 *
 * Read username & password from the console
 */
public class Main {

  public static void main(String[] args) {
    System.out.println("Please enter your age!");
    // read from cmd line until enter is pressed
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    System.out.println("You entered: " + input);

    try {
      readAndPrintFromFile("input.txt");
    } catch (FileNotFoundException e) {
      System.out.println("File not found!");
    }

    long age = 0;
    try {
      System.out.println("Trying to parse input to long...");
      age = Long.parseLong(input);
      System.out.println(getNumber());
    } catch (NumberFormatException | NullPointerException e) {

    } catch (Throwable emi) {
      System.out.println("Invalid input, please enter a number!");
    }
    System.out.println("Age as long: " + age);
  }

  private static void readAndPrintFromFile(String inputFilename) throws FileNotFoundException {
    Scanner secondScanner = new Scanner(new File(inputFilename));
    String secondInput = secondScanner.nextLine();
    System.out.println("File contains: " + secondInput);
  }

  private static long getNumber() {
    try {
      return 1;
    } finally {
      System.out.println("Finally block executed!");
      return 2;
    }
  }
}