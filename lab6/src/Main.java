import ro.hotel.model.Client;
import ro.hotel.model.Person;

/*
Hotel Reservation Management System

This system manages room availability, client reservations, and billing information.
It uses concepts such as packages, classes, objects, encapsulation, constructors, inheritance,
method overriding, and method overloading.

Package Structure and Classes:

1. Package `model.room` - Defines room types available in the hotel.
   - Class `Room` - Base class for all rooms. Attributes include room number, price per night,
     and availability. Methods for displaying room details and checking availability.
   - Derived Classes:
     - `StandardRoom` - Extends `Room` and adds specific details like bed type (single/double).
     - `LuxuryRoom` - Extends `Room` and includes extra amenities (jacuzzi, panoramic view).
       Overrides display method to include these amenities.
   - Overriding:
     - Overrides the `displayDetails()` method in each derived room class to provide specific
       details related to room type.

2. Package `model.reservation` - Hosts reservation-related classes.
   - Class `Reservation` - Manages reservations for rooms. Contains check-in and check-out dates,
     the reserved room, and methods to calculate the stay duration.
   - Overloaded Methods:
     - Method `reserveRoom()` is overloaded to allow reservation creation either by client ID or
       by name and phone number.
   - Constructors:
     - Constructors initialize reservation details, including room and client information.

3. Package `model.client` - Contains client-related classes.
   - Class `Client` - Represents a client’s information (name, address, phone number) and includes
     methods for displaying client details.
   - Constructors:
     - Overloaded constructors allow client creation with or without contact details.

4. Package `service` - Hosts service classes to manage hotel operations.
   - Class `ReservationService` - Manages room reservations, including methods to check room
     availability and calculate the bill for a reservation.
   - Class `ClientService` - Manages client information, with methods to add or update client data.

Core Concepts Implemented:

1. Encapsulation:
   - Each class encapsulates its data, providing `get` and `set` methods for accessing or modifying
     attributes as needed, while sensitive fields are private.

2. Inheritance:
   - `Room` is the base class extended by `StandardRoom` and `LuxuryRoom`, creating a hierarchy of
     room types with shared functionality.

3. Overriding:
   - The `displayDetails()` method is overridden in each derived room class to include specific
     room features like amenities or bed type.

4. Overloading:
   - The `reserveRoom()` method in `Reservation` is overloaded to provide multiple ways to reserve
     a room based on different parameters.

5. Constructors:
   - Constructors initialize data in each class, and overloaded constructors in classes like `Client`
     and `Reservation` allow for flexible object creation.

6. Package Structure:
   - Classes are organized into packages (`model.room`, `model.reservation`, `model.client`,
     `service`) to logically separate functionality and improve code maintainability.

Class and Method Summary:

- model.room
  - `Room`: `displayDetails()`, `isAvailable()`
  - `StandardRoom`: Inherits `Room`, overrides `displayDetails()`
  - `LuxuryRoom`: Inherits `Room`, overrides `displayDetails()`, `getAmenities()`

- model.reservation
  - `Reservation`: `reserveRoom(Client client)`, `reserveRoom(int clientId)`,
  `calculateStayDuration()` - startDate, endDate
  `calculateStayDuration(Reservation reservation)` - could be static

- model.client
  - `Client`: `getName()`, `getContactInfo()`

- service
  - `ReservationService`: `checkAvailability(Room room)`, `calculateBill(Reservation reservation)`
  - `ClientService`: `addClient(Client client)`, `updateClientInfo(int clientId)`

This structure provides a comprehensive framework for managing hotel reservations and can be easily expanded
with additional room types or new reservation management methods.
*/
public class Main {

  private static Client[] clients = new Client[10];
 // {null, object, null, null ...}
  public static void main(String[] args) {
    clients[1] = new Client();
    clients[1].setName("John Doe");
    System.out.println(clients[1].getName());

    Person person = new Client();
    System.out.println(person instanceof Object);
    System.out.println(person instanceof Client);
    System.out.println(person instanceof Person);
  }
}