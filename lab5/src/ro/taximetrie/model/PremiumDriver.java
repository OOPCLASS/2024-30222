package ro.taximetrie.model;

public class PremiumDriver extends Driver {

  private String personalPhoneNumber;

  public String getPersonalPhoneNumber() {
    return personalPhoneNumber;
  }

  public void setPersonalPhoneNumber(String personalPhoneNumber) {
    this.personalPhoneNumber = personalPhoneNumber;
  }

  public String getDescription() {
    String description = super.getDescription();
    return description + " - " + personalPhoneNumber;
  }
}
