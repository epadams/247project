import java.util.Scanner;
import java.util.UUID;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * The maindriver runs the Flight System and The User Interface
 */
public class MainDriver {
  private FSystem fsystem;
  Scanner keyboard = new Scanner(System.in);

  public MainDriver() {
    fsystem = new FSystem();
  }

  /**
   * Runs the Flight System
   */
  public void run() {
    // DEBUGGING
    // fsystem.getCurrentUser();
    // System.out.println(fsystem.getUsers().printAllUsers());
    // System.out.println(fsystem.getFlights().searchFlights("Flight1").getSeats().get(0).toString());
    boolean run = true;
    while (run) {
      displayLoginMenu();
    }
    keyboard.close();
  }

  /**
   * Displays the Login Menu
   */
  public void displayLoginMenu() {
    System.out.println("******** Welcome ********\n1: Login\n2: Create Account"
        + "\n3: Continue as guest\n4: Quit");
    switch (keyboard.nextInt()) {
      case 1:
        login();
        break;
      case 2:
        displayCreateAccount();
        break;
      case 3:
        displayGuestMenu();
        break;
      case 4:
        System.exit(0);
        break;
      default:
        System.out.println("Invalid input");
        break;
    }
  }

  /**
   * Displays the Main Menu for a registered User
   */
  public void displayMenu() {
    boolean logout = false;
    while (!logout) {
      System.out.println("******** Main Menu ********\n1: Search Flights\n2: Search Hotels"
          + "\n3: Register for Flight\n4: Register for Hotel"
          + "\n5: View Booked Flight\n6: View Booked Hotels"
          + "\n7: View Account Information\n8: Generate Itinerary\n9: Logout");
      switch (keyboard.nextInt()) {
        case 1:
          displaySearchFlights();
          break;
        case 2:
          displaySearchHotels();
          break;
        case 3:
          registerFlight();
          break;
        case 4:
          registerHotel();
          break;
        case 5:
          System.out.println(displayBookedFlights());
          break;
        case 6:
          System.out.println(displayBookedHotels());
          break;
        case 7:
          displayAccountInformationMenu();
          break;
        case 8:
          createItinerary();
          break;
        case 9:
          logout = fsystem.logout();
        default:
          System.out.println("Invalid input");
          break;
      }
    }
  }

  /**
   * Displays the main menu for a guest
   */
  public void displayGuestMenu() {
    keyboard.nextLine();
    System.out.println("******** Guest Menu ********\n1: Search Flights"
        + "\n2: Search Hotels\n3: Return To Login");
    switch (keyboard.nextInt()) {
      case 1:
        displaySearchFlights();
        break;
      case 2:
        displaySearchHotels();
        break;
      case 3:
        return;
      default:
        System.out.println("Invalid input");
        break;
    }
  }

  /**
   * Displays the create account menu
   */
  public void displayCreateAccount() {
    keyboard.nextLine();
    System.out.println("******** Create Account ********\nPlease Enter Your Username");
    String usrnm = keyboard.nextLine();
    System.out.println("\nPlease Enter Your Password");
    String pass = keyboard.nextLine();
    System.out.println("\nPlease Enter Your Email");
    String email = keyboard.nextLine();
    System.out.println("\nPlease Enter Your Age");
    int age = keyboard.nextInt();
    keyboard.nextLine();
    fsystem.createAccount(usrnm, pass, email, age);

    /*
     * System.out.
     * println("Would you like to set your preferences now?\n'yes' or 'no'");
     * String prefres = keyboard.nextLine();
     * if (prefres.toLowerCase().equals("yes")) {
     * displayPreferenceSelection();
     * } else {
     * System.out.
     * println("You can set your preferences later in 'Account information'");
     * }
     */
  }

  /**
   * Displays and records information for a user login
   */
  public void login() {
    keyboard.nextLine();
    System.out.println("******** Login ********\nPlease Enter Your Username");
    String username = keyboard.nextLine();
    System.out.println("\nPlease Enter Your Password");
    String password = keyboard.nextLine();
    switch (fsystem.login(username, password)) {
      case 1:
        System.out.println("Invalid username or not found");
        break;
      case 2:
        System.out.println("Invalid password or not found");
        break;
      case 3:
        System.out.println("Successfully logged in");
        displayMenu();
        break;
      default:
        System.out.println("Unknown error occured");
        break;
    }
  }

  /**
   * Displays the search flights menu
   */
  public void displaySearchFlights() {
    keyboard.nextLine();
    System.out.println("******** Search Flights ********\n1: Search all Flights"
        + "\n2: Search Based on Departure\n3: Search Based on Destination"
        + " \n4: Search Based on Departure and Destination");
    switch (keyboard.nextInt()) {
      case 1:
        displaySearchAllFlights();
        break;
      case 2:
        displaySearchFlightsDep();
        break;
      case 3:
        displaySearchFlightsDest();
        break;
      case 4:
        displaySearchFlightsDepAndDest();
        break;
      default:
        System.out.println("Invalid input");
        break;
    }
  }

  /**
   * Displays the menu to register for a flight
   */
  public void registerFlight() {
    keyboard.nextLine();
    System.out.println("******** Register for Flight ********"
        + "\nPlease enter the UUID of the flight you want to register for:");
    UUID id = UUID.fromString(keyboard.nextLine());
    System.out.println(fsystem.getFlights().searchFlightID(id).printSeatMap());
    System.out.println("How many tickets would you like:");
    int numTickets = keyboard.nextInt();
    if (numTickets == 0) {
      System.out.println("Sorry, that is not a valid number");
      return;
    }
    keyboard.nextLine();
    System.out.println("Please choose the location of your seat(s)"
        + "\nPlease enter the number of the row, followed by the letter of the aisle");
    for (int i = 0; i < numTickets; i++) {
      int row = Integer.parseInt(keyboard.nextLine());
      char aisle = keyboard.nextLine().charAt(0);
      fsystem.registerFlight(id, row, aisle);
    }
  }

  /**
   * Displays the menu to register for a Hotel
   */
  public void registerHotel() {
    keyboard.nextLine();
    System.out.println("******** Register for Hotel ********"
        + "\nPlease enter the UUID of the hotel you want to register for:");
    UUID id = UUID.fromString(keyboard.nextLine());
    System.out.println(fsystem.getHotels().searchHotelID(id).printRooms());
    System.out.println("Please enter the number of the hotel room you wish to book");
    int roomNumber = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("Please enter the number of days you wish to stay:");
    int numDays = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("Please enter dates you wish to book"
        + "\nPlease enter in a MM/DD/YYYY format:");
    ArrayList<String> dates = new ArrayList<String>();
    for (int i = 0; i < numDays; i++) {
      String entry = keyboard.nextLine();
      if (fsystem.getHotels().searchHotelID(id).getRoomByNum(roomNumber).getBookedDates().contains(entry)) {
        System.out.println("That date is already booked, sorry");
      } else {
        dates.add(entry);
      }
      System.out.println(fsystem.registerHotel(id, roomNumber, dates));
    }
  }

  /**
   * Displays the menu to search for Hotels
   */
  public void displaySearchHotels() {
    keyboard.nextLine();
    System.out.println("******** Search Hotels ********\n1: Search all Hotels"
        + "\n2: Search hotels on location\n3: Go Back");
    switch (keyboard.nextInt()) {
      case 1:
        displaySearchAllHotels();
        break;
      case 2:
        displaySearchHotelsDest();
        break;
      case 3:
        break;
      default:
        System.out.println("Invalid input");
        break;
    }
  }

  /**
   * Displays the account information for a registered user
   */
  public void displayAccountInformationMenu() {
    keyboard.nextLine();
    System.out.println("******** Account Information ********\n1: Change Login info"
        + "\n2: See/Change Preferences\n3: Add Passport Information\n4: View Passport Info");
    switch (keyboard.nextInt()) {
      case 1:
        displayChangeLoginInfo();
        break;
      case 2:
        // displayPreferenceSelection();
        break;
      case 3:
        displayAddPassportInfo();
        break;
      case 4:
        displayPassportInfo();
        break;
      default:
        System.out.println("Invalid input");
        break;
    }
  }

  /**
   * Displays Flight Preference selection for a registered user
   */
  /*
   * public void displayPreferenceSelection() {
   * keyboard.nextLine();
   * System.out.println(
   * "******** Setting Your Preferences ********\n----- Flight Type -----\nEnter: 'One Way' 'Layover' or 'Round Trip'"
   * );
   * String flightPref = keyboard.nextLine();
   * System.out.
   * println("----- Airline -----\nEnter: 'Delta' 'American' 'United' or 'Spirit'"
   * );
   * String airlinePref = keyboard.nextLine();
   * System.out.
   * println("----- Baggage Number -----\nEnter: Number of Luggage Bags (As a Number)"
   * );
   * int baggageCountPref = keyboard.nextInt();
   * keyboard.nextLine();
   * System.out.
   * println("----- Medical Accomidation Seating -----\nEnter: 'Yes' or 'No'");
   * String medicalAccomPref = keyboard.nextLine();
   * System.out
   * .println("----- Enter Pet Weight in Pounds -----\nEnter: Your Pets Weight in pounds (If no pet enter '0')"
   * );
   * int petWeightpref = keyboard.nextInt();
   * keyboard.nextLine();
   * System.out.
   * println("----- Seat Type -----\nEnter: 'Business' 'Economy' or 'First Class'"
   * );
   * String seatTypePref = keyboard.nextLine();
   * System.out.
   * println("----- Seat Location -----\nEnter: 'Aisle' 'Middle' or 'Window'");
   * String seatLocationPref = keyboard.nextLine();
   * System.out.
   * println("----- Airport Origin Code -----\nEnter: Airport Origin Code");
   * String airportOriginCodePref = keyboard.nextLine();
   * 
   * // TODO Store these preferences
   * }
   */
  /**
   * Displays Hotel preference selection for a registered user
   */

  /*
   * public void displayHotelPreferenceSelection() {
   * keyboard.nextLine();
   * System.out.
   * println("----- Number of Beds -----\nEnter: Number of Beds (As a Number)");
   * int bedCountPref = keyboard.nextInt();
   * keyboard.nextLine();
   * System.out.println("----- Bed Type -----\nEnter: 'Twin' 'Queen' or 'King'");
   * String bedTypePref = keyboard.nextLine();
   * System.out.println("----- Smoking Accomidation -----\nEnter: 'Yes' or 'No'");
   * String smokingAccomPref = keyboard.nextLine();
   * System.out.println("----- Pet Friendly -----\nEnter: 'Yes' or 'No'");
   * String petAccomPref = keyboard.nextLine();
   * System.out.
   * println("----- Check-In Date -----\nEnter: a date in MM/DD/YYYY format");
   * String checkInDate = keyboard.nextLine();
   * System.out.
   * println("----- Check-out Date -----\nEnter: a date in MM/DD/YYYY format");
   * String checkoutDate = keyboard.nextLine();
   * 
   * // TODO store these preferences
   * }
   */
  /**
   * Displays a menu of all flights in the system
   */
  public void displaySearchAllFlights() {
    keyboard.nextLine();
    System.out.println("----- Search All Flights -----");
    System.out.println(fsystem.getFlights().toString());
  }

  /**
   * Displays flights based on departure location
   */
  public void displaySearchFlightsDep() {
    keyboard.nextLine();
    System.out.println("----- Search Flights based on Departure -----");
    System.out.println("Enter airport code of departure location: ");
    System.out.println(fsystem.getFlights().searchDeparture(keyboard.nextLine()).toString());
  }

  /**
   * Displays flights based on destination location
   */
  public void displaySearchFlightsDest() {
    keyboard.nextLine();
    System.out.println("----- Search Flights based on Destination -----");
    System.out.println("Enter airport code of destination location: ");
    System.out.println(fsystem.getFlights().searchDestination(keyboard.nextLine()).toString());
  }

  /**
   * Search flights based on both departure and Destination
   */
  public void displaySearchFlightsDepAndDest() {
    keyboard.nextLine();
    System.out.println("----- Search Flights based on Departure and Destination -----");
    System.out.println("Enter airport code of departure location: ");
    String departure = keyboard.nextLine();
    System.out.println("Enter airport code of destination location: ");
    String destination = keyboard.nextLine();
    System.out.println(fsystem.getFlights()
        .searchDepartureAndDestination(departure, destination).toString());
  }

  /**
   * displays a menu of all hotels in the system
   */
  public void displaySearchAllHotels() {
    keyboard.nextLine();
    System.out.println("----- Search All Hotels -----");
    System.out.println(fsystem.getHotels().toString());
  }

  /**
   * Search hotels based on their location "destination"
   */
  public void displaySearchHotelsDest() {
    keyboard.nextLine();
    System.out.println("----- Search Hotels with Destination -----"
        + "\nPlease enter the destination of the hotel");
    // TODO display
    System.out.println(fsystem.getHotels().searchHotelLocation(keyboard.nextLine()).toString());
  }

  /**
   * Displays all flights a user has booked
   */
  
  public String displayBookedFlights() {
    keyboard.nextLine();
    String ret = "";
    ArrayList<UUID> bookedFlights = fsystem.getCurrentUser().getBookedSeatIDs();
    for (int i = 0; i < bookedFlights.size(); i++) {
      // TODO change this to be printing seats and store the uuid of seats, not the booked flights 
      ret += (fsystem.getFlights().searchFlightID(bookedFlights.get(i)).toString());
      ret += "\n";
      // fsystem.getFlights().searchFlightID(bookedFlights.get(i)).getSeatByUUID(id)
    }
    return ret;
  }
  

  /**
   * displays all hotels a User has booked
   */
  public String displayBookedHotels() {
    keyboard.nextLine();
    String ret = "";
    ArrayList<UUID> bookedRooms = fsystem.getCurrentUser().getBookedRoomIDs();
    for (int i = 0; i < bookedRooms.size(); i++) {
      ret += (fsystem.getHotels().searchRooms(bookedRooms.get(i)).toString());
      ret += "\n";
    }
    return ret;
  }

  /**
   * Displays all flights a user has previously booked
   */
  /*
  public void displayFlightHistory() {
    keyboard.nextLine();
    System.out.println("DISPLAY FLIGHT HISTORY HERE");
  }
  */

  /**
   * Displays a menu where the user can change their login information
   */
  public void displayChangeLoginInfo() {
    keyboard.nextLine();
    System.out.println("----- Username/Password/Email Change -----");
    System.out.println("\n----- Username -----\nEnter: A new username or 'NEXT' to skip'");
    String newUsername = keyboard.nextLine();
    System.out.println("\n----- Password -----\nEnter: A new Password or 'NEXT' to skip'");
    String newPassword = keyboard.nextLine();
    System.out.println("\n----- Email -----\nEnter: A new Email or 'NEXT' to skip'");
    String newEmail = keyboard.nextLine();

    // TODO check these new choices are not 'NEXT' and if so update them.
  }

  /**
   * Displays a menu to fill out passport information
   */
  public void displayAddPassportInfo() {
    keyboard.nextLine();
    System.out.println("----- Adding Passport Information -----");
    System.out.println("\n----- First Name -----\nEnter: Your First Name");
    String firstName = keyboard.nextLine();
    System.out.println("\n----- Last Name -----\nEnter: Your Last Name");
    String lastName = keyboard.nextLine();
    System.out.println("\n----- Passport Number -----\nEnter: Your Passport Number (as a number)");
    int passportNum = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("----- Date of Birth -----\nEnter: Your birth date in MM/DD/YYYY format");
    String dateOfBirth = keyboard.nextLine();
    System.out.println("----- Place of Birth -----\nEnter: Your place of birth");
    String placeOfBirth = keyboard.nextLine();
    System.out.println("----- Issue Date -----\nEnter: The date your passport was issued in MM/DD/YYYY format");
    String issueDate = keyboard.nextLine();
    System.out.println("----- Expiration Date -----\nEnter: The date your passport will expire in MM/DD/YYYY format");
    String expirationDate = keyboard.nextLine();
    System.out.println("----- Sex -----\nEnter: The Sex on your Passport 'M' or 'F'");
    char sex = keyboard.nextLine().charAt(0);
    fsystem.getCurrentUser().addPassport(new Passport(UUID.randomUUID(), firstName,
        lastName, passportNum, dateOfBirth, placeOfBirth, issueDate, expirationDate,
        sex));
  }

  /**
   * Displays Passport information
   */
  public void displayPassportInfo() {
    for (Passport passport : fsystem.getCurrentUser().getPassports()) {
      System.out.println(passport.toString());
    }
  }

  /**
   * Writes All Currently Booked Flights and Hotels To a "beautifully formatted text
   * file"
   */
  
  public void createItinerary() {
    keyboard.nextLine();
    File myObj = new File("Itinerary.txt");
    try {
      FileWriter myWriter = new FileWriter(myObj);
      myWriter.write("------- Flights -------\n");
      myWriter.write(displayBookedFlights());
      // TODO fix
      // myWriter.write("\n------- Hotels -------\n");
      // myWriter.write(displayBookedHotels());
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  

  /**
   * Search flights based off flight preferences
   */
  /*
   * public void displaySearchFlightsPref() {
   * keyboard.nextLine();
   * System.out.println("----- Search Flights Based off Preferences -----");
   * // TODO display
   * }
   */
  /**
   * search hotels based off hotel preferences
   */
  /*
   * public void displaySearchHotelPref() {
   * keyboard.nextLine();
   * System.out.println("----- Search Hotels Based off Preferences -----");
   * // TODO display 3ish Hotels, based off preferences
   * }
   */
  /**
   * displays hotel booking history
   */
  /*
   * public void displayBookingHistory() {
   * keyboard.nextLine();
   * System.out.println("----- Display Booking History -----");
   * // TODO display booking history
   * }
   */
  /**
   * Displays thank you message after a sucsessfully booked flight
   */

  /*
   * public void displayThankYouMessage() {
   * keyboard.nextLine();
   * System.out.println("----- Thank you for booking with us! -----\nWhat else"
   * + "can we do for you?\n1: View Booked Flight(s)\n2: Search More Flights"
   * + "\n3: Search Hotels\n4: Return to Menu");
   * switch (keyboard.nextInt()) {
   * // View Booked Flight
   * case 1:
   * displayBookedFlights();
   * break;
   * // Search Flights
   * case 2:
   * displaySearchFlights();
   * break;
   * // Search Hotels
   * case 3:
   * displaySearchHotels();
   * break;
   * // Display the Menu
   * case 4:
   * displayMenu();
   * break;
   * }
   * }
   */
  /**
   * Runs the Flight System
   * 
   * @param args
   */

  public static void main(String[] args) {
    MainDriver mainDriver = new MainDriver();
    mainDriver.run();
  }
}
