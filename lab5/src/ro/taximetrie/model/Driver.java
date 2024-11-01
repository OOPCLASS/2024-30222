package ro.taximetrie.model;

public class Driver {

  private static final double DEFAULT_DRIVER_RATING = 5.0;
  private String name;
  private String avatarUrl;
  private Vehicle vehicle;
  private double rating;

  public Driver() {
    this.rating = DEFAULT_DRIVER_RATING;
  }

  public Driver(String name) {
    this.name = name;
    this.rating = DEFAULT_DRIVER_RATING;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  public String getDescription() {
    return "Driver: " + name + " - " + rating + " stars.";
  }
}
