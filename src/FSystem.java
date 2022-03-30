import java.util.UUID;
import java.util.ArrayList;

/**
 * A class that manages the flights, hotels, and users 
 */
public class FSystem {
  private Users users;
  private User currentUser;
  private Flights flights;
  private Hotels hotels;
/**
 * sets currentUser to null and users,flights,hotels to an instance of each 
 */
  public FSystem() {
    currentUser = null;
    users = Users.getInstance();
    flights = Flights.getInstance(); 
    hotels = Hotels.getInstance();
  }
/**
 * creates a new user account and adds it to User 
 * @param username
 * @param password
 * @param email
 * @param age
 */
  public void createAccount(String username, String password, String email, int age) {
    users.addUser(username, password, email, age);
  }
/**
 * method used for user login 
 * @param username
 * @param password
 * @return 1,2 or 3
 */
  public int login(String username, String password) {
    if (!users.haveUser(username)) return 1;
    if (!users.getUser(username).getPassword().equals(password)) return 2;
    currentUser = users.getUser(username);
    return 3;
  }

  /**
   * logs the user out of their account 
   * @return true 
   */
  public boolean logout() {
    users.saveUsers();
    return true;
  }

  /**
   * Gets the current user  
   * @return currentUser 
   */
  public User getCurrentUser() {
    return currentUser;
  }

  /**
   * gets the username for the current user  
   * @return this.user
   */
  public Users getUsers() {
    return this.users;
  }

  /**
   * get the flight for the user 
   * @return this.flight 
   */
  public Flights getFlights() {
    return this.flights;
  }

  /**
   * get the hotel of the user 
   * @return this.hotels
   */
  public Hotels getHotels() {
    return this.hotels;
  }

  /**
   * checks if a specific seat has been booked or not and books the seat if it is vacant 
   * @param id
   * @param row
   * @param aisle
   * @return "Your seat has been booked" or "your seat is taken"
   */
  public String registerFlight(UUID id, int row, char aisle) {
    if (flights.searchFlightID(id).searchSeats(row, aisle).getVacancy()) {
      flights.searchFlightID(id).registerSeat(row, aisle);
      if (this.getCurrentUser().getBookedSeatIDs().contains(flights.searchFlightID(id).searchSeats(row, aisle).getUUID()))
        return "This seat is already booked";
      this.getCurrentUser().addBookedSeat(flights.searchFlightID(id)
          .searchSeats(row, aisle).getUUID());
      System.out.println(flights.searchFlightID(id).searchSeats(row, aisle).toString());
      return "Your seat has been booked";
    } else {
      return "This seat is already booked";
    }
  }

  public String registerHotel(UUID id, int roomNumber, ArrayList<String> bookedDates) {
    for (String date : bookedDates) {
      hotels.searchHotelID(id).getRoomByNum(roomNumber).addBookedDate(date);
    }
    this.getCurrentUser().addBookedRoom(hotels.searchHotelID(id).getRoomByNum(roomNumber).getUUID());
    return "Your dates have been booked";
  }
}
