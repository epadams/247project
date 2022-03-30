import java.util.ArrayList;
import java.util.UUID;

/**
 * this class is hold information about the individual user
 * 
 */
public class User {
  private UUID id;
  private String username;
  private String password;
  private String email;
  private String firstName;
  private String lastName;
  private int age;
  private String address;
  private boolean frequentFlyer;
  private ArrayList<Passport> passports;
  // Use UUID so you don't hold copy of object
  private ArrayList<UUID> bookedSeats;
  private ArrayList<UUID> bookedRooms;
  private ArrayList<Flight> flightHistory;
  private ArrayList<String> refunds;

  /**
   * public constructor of user object
   */
  public User() {
      
  }

  /**
   * constructs an object instance of user
   * @param id the UUID for the user
   * @param username the username the user goes by
   * @param password the password to login for the user
   * @param email the user's email
   * @param age the user's age
   */
  public User(UUID id, String username, String password, String email, int age) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.email = email;
    this.age = age;
    this.firstName = "";
    this.lastName = "";
    this.address = "";
    this.frequentFlyer = false;
    this.passports = new ArrayList<Passport>();
    this.bookedSeats = new ArrayList<UUID>();
    this.bookedRooms = new ArrayList<UUID>();
  }

  /**
   * constructs an object instance ofuser
   * @param id the UUID of the user
   * @param username the user's username
   * @param password the user's password for the account
   * @param email the user's email
   * @param firstName the user's first name
   * @param lastName the user's last name
   * @param age the user's age
   * @param address the user's address
   * @param frequentFlyer true if user is frequent flyer, false if not
   */
  public User(UUID id, String username, String password, String email,
      String firstName, String lastName, int age, String address,
      boolean frequentFlyer) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.address = address;
    this.frequentFlyer = frequentFlyer;
    this.passports = new ArrayList<Passport>();
    this.bookedSeats = new ArrayList<UUID>();
    this.bookedRooms = new ArrayList<UUID>();
  }

  /**
   * constructs object instance of user
   * @param id the user's UUID
   * @param username the user's username for the account
   * @param password the user's password for the account
   * @param email the user's email
   * @param firstName the user's first name
   * @param lastName the user's last name
   * @param age the user's age
   * @param address the user's address
   * @param frequentFlyer true if user is a frequent flyer, false if not
   * @param passports the passports of those going on flights
   * @param bookedSeats the seats in the flight the user booked
   * @param bookedRooms the rooms in hotel the user booked
   */
  public User(UUID id, String username, String password, String email, String firstName,
      String lastName, int age, String address, boolean frequentFlyer,
      ArrayList<Passport> passports, ArrayList<UUID> bookedSeats,
      ArrayList<UUID> bookedRooms) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.address = address;
    this.frequentFlyer = frequentFlyer;
    this.passports = passports;
    this.bookedSeats = bookedSeats;
    this.bookedRooms = bookedRooms;
  }

  /**
   * set the username  of the user to the value we need
   * @param username the username we want to add to the user
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * set the password of the user to the value we need
   * @param password the password we need to set to the user
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * set the email of the user to the one we need
   * @param email the email we want to set to the user
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * set the first name of the user to the one we want
   * @param firstName the first name we want to set to the user
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * set the last name of the user to the one we want
   * @param lastName the last name we want to set to the user
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * set the age of the user to the one we want
   * @param age the age we want to set to the user
   */
  public void setAge(int age) {
    this.age = age;
  }

  /**
   * set the address of the user to the one we want
   * @param address the address we want to set to the user
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * adds a passport that the user wants to book a flight seat for
   * @param passport the passport the user wants to books a flight seat for
   */
  // TODO check if a passport currently exists to avoid duplication
  public void addPassport(Passport passport) {
    this.passports.add(passport);
  }

  /**
   * get the user's username
   * @return the user's username
   */
  public String getUserName() {
    return this.username;
  }

  /**
   * get the user's account's password
   * @return the user's password
   */
  public String getPassword() {
    return this.password;
  }

  /**
   * get the user's email
   * @return the user's email
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * get the user's first name
   * @return the user's first name
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * get the user's last name
   * @return the user's last name
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * get the user's age
   * @return the user's age
   */
  public int getAge() {
    return this.age;
  }

  /**
   * get the user's address
   * @return the user's address
   */
  public String getAddress() {
    return this.address;
  }

  /**
   * get the passports the user wants to book flight seats for
   * @return the passports the user wants to book flight seats for
   */
  public ArrayList<Passport> getPassports() {
    return this.passports;
  }

  /**
   * gets the frequent flyer status of the user
   * @return the true or false valu of if the frequent flyer or not
   */
  public boolean getFreqFlyerStatus() {
    return this.frequentFlyer;
  }

  /**
   * prints the user's previous booked flights history
   * @return the list of previously booked flights
   */
  public ArrayList<Flight> printFlightHistory() {
    return this.flightHistory;
  }

  /**
   * get user's refunds
   * @return the user's refunds
   */
  public ArrayList<String> getRefunds() {
    return this.refunds;
  }

  /**
   * prints the Flight Ticket
   * @return Flight ticket
   */
  public String printFlightTicket() {
    return "";
  }

  /**
   * gets user's booked seats
   * @return UUID list of booked seats
   */
  public ArrayList<UUID> getBookedSeatIDs() {
    return this.bookedSeats;
  }

  /**
   * gets the user's booked hotel rooms
   * @return UUID list of booked hotel rooms
   */
  public ArrayList<UUID> getBookedRoomIDs() {
    return this.bookedRooms;
  }

  /**
   * adds seats to booked seats for the user
   * @param id the UUID of the seat we want to add to the booked seats
   */
  public void addBookedSeat(UUID id) {
    if (this.bookedSeats.contains(id)) return;
    this.bookedSeats.add(id);
  }

  /**
   * adds rooms to booked rooms for the user
   * @param id the UUID of the room we want to add to the booked seats
   */
  public void addBookedRoom(UUID id) {
    if (this.bookedRooms.contains(id)) return;
    this.bookedRooms.add(id);
  }

  /**
   * interprets data into a String value
   * @return the string with all the User's data
   */
  public String toString() {
    return "ID: " + this.id + "\nUsername: " + this.username + "\nPassword: "
        + this.password + "\nFirst Name: " + this.firstName + "\nLast Name: "
        + this.lastName + "\nAge: " + this.age + "\nAddress: "
        + this.address + "\nFrequent Flyer: " + this.frequentFlyer + "\nSeat ids: "
        + this.bookedSeats.toString() + "\nRoom ids: " + this.bookedRooms.toString();
  }

  /**
   * gets the UUID that represents the User
   * @return the user's UUID
   */
  public UUID getId() {
    return this.id;
  }
}
