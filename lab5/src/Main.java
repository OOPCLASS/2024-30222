import ro.taximetrie.model.Driver;
import ro.taximetrie.model.PremiumDriver;
import ro.taximetrie.model.StandardDriver;

public class Main {

  public static void main(String[] args) {
    StandardDriver standardDriver = new StandardDriver();
    standardDriver.setName("Amalia");

    StandardDriver standardDriver2 = new StandardDriver();
    standardDriver2.setName("Amalia");

    System.out.println(standardDriver.equals(standardDriver2));


    PremiumDriver premiumDriver = new PremiumDriver();
    premiumDriver.setName("George");
    premiumDriver.setPersonalPhoneNumber("0722222222");

    System.out.println(standardDriver instanceof StandardDriver);
    System.out.println(standardDriver instanceof Driver);
    System.out.println(standardDriver instanceof Object);

    Driver[] drivers = new Driver[2];
    drivers[0] = standardDriver;
    drivers[1] = premiumDriver;
    for (Driver driver : drivers) {
//      if (driver instanceof PremiumDriver) {
//        System.out.println(((PremiumDriver) driver).getPersonalPhoneNumber());
//      }
      System.out.println(driver.getDescription());
    }
  }
}