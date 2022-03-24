import java.util.Scanner;

public class MainDriver {
  private FSystem fsystem;
  Scanner keyboard = new Scanner(System.in);

  public MainDriver() {
    fsystem = new FSystem();
  }

  // TODO break this up into multiple methods
  public void run() {
    // DEBUGGING
    // System.out.println(fsystem.getFlights().printAllFlights());
    // fsystem.getCurrentUser();
    // fsystem.createAccount("testUser2", "a2df", "test2@email.com", 20);
    // System.out.println(fsystem.getUsers().printAllUsers());
    boolean run = true;
    while (run) {
      displayLoginMenu();
    }
    keyboard.close();
  }

  public void displayLoginMenu() {
    System.out.println("******** Welcome ********\n1: Login\n2: Create Account"
        + "\n3: Continue as guest\n4: QUIT");
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
    }
  }

  public void displayMenu() {
    boolean logout = false;
    while (!logout) {
      System.out.println("******** Main Menu ********\n1: Search Flights\n2: Search Hotels\n3: View Booked Flights"
          + "\n4: View Booked Hotels\n5: View Account Information\n6: Logout");
      switch (keyboard.nextInt()) {
        // Search Flights
        case 1:
          displaySearchFlights();
          break;
        // Search Hotels
        case 2:
          displaySearchHotels();
          break;
        // View Booked Flights
        case 3:
          displayBookedFlights();
          break;
        // View Booked Hotels
        case 4:
          displayBookedHotels();
          break;
        // View Account Info
        case 5:
          displayAccountInformationMenu();
          break;
        // Logout
        case 6:
          logout = fsystem.logout();
      }
    }
  }

  public void displayGuestMenu() {
    keyboard.nextLine();
    System.out.println("******** Guest Menu ********\n1: Search Flights\n2: Search Hotels");
    switch (keyboard.nextInt()) {
      // Search Flights
      case 1:
        displaySearchFlights();
        break;
      // Search Hotels
      case 2:
        displaySearchHotels();
        break;
    }
  }

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

    System.out.println("Would you like to set your preferences now?\n'yes' or 'no'");
    String prefres = keyboard.nextLine();
    if (prefres.toLowerCase().equals("yes")) {
      displayPreferenceSelection();
    } else {
      System.out.println("You can set your preferences later in 'Account information'");
    }
  }

  /*
   * User Decides to Login
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
    }
  }

  public void displaySearchFlights() {
    keyboard.nextLine();
    System.out.println(
        "******** Search Flights ********\n1: Search all Flights\n2: Search Based on Preferences\n3: Change Preferences");
    switch (keyboard.nextInt()) {
      // Search Flights
      case 1:
        displaySearchAllFlights();
        break;
      // Search Flights w/ Preferences
      case 2:
        displaySearchFlightsPref();
        break;
      // Change Preferences
      case 3:
        displayPreferenceSelection();
        break;
    }

  }

  public void displaySearchHotels() {
    keyboard.nextLine();
    System.out.println(
        "******** Search Hotels ********\n1: Search all Hotels\n2: Search Based on Preferences\n3: Change Hotel Preferences");
    switch (keyboard.nextInt()) {
      // Search Hotels
      case 1:
        displaySearchAllHotels();
        break;
      // Search Flights w/ Preferences
      case 2:
        displaySearchHotelPref();
        break;
      // Change Preferences
      case 3:
        displayHotelPreferenceSelection();
        break;
    }
  }

  public void displayAccountInformationMenu() {
    keyboard.nextLine();
    System.out.println(
        "******** Account Information ********\n1: See/Change Username, Password, Email\n2: See/Change Preferences\n3: Add Passport Information\n4: View History");
    switch (keyboard.nextInt()) {
      // username password email
      case 1:
        displayChangeLoginInfo();
        break;
      // change preferenece
      case 2:
        displayPreferenceSelection();
        break;
      // add passport info
      case 3:
        displayAddPassportInfo();
        break;
      // View flight history
      case 4:
        displayFlightHistory();
        break;
    }
  }

  public void displayPreferenceSelection() {
    keyboard.nextLine();
    System.out.println(
        "******** Setting Your Preferences ********\n----- Flight Type -----\nEnter: 'One Way' 'Layover' or 'Round Trip'");
    String flightPref = keyboard.nextLine();
    System.out.println("----- Airline -----\nEnter: 'Delta' 'American' 'United' or 'Spirit'");
    String airlinePref = keyboard.nextLine();
    System.out.println("----- Baggage Number -----\nEnter: Number of Luggage Bags (As a Number)");
    int baggageCountPref = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("----- Medical Accomidation Seating -----\nEnter: 'Yes' or 'No'");
    String medicalAccomPref = keyboard.nextLine();
    System.out
        .println("----- Enter Pet Weight in Pounds -----\nEnter: Your Pets Weight in pounds (If no pet enter '0')");
    int petWeightpref = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("----- Seat Type -----\nEnter: 'Business' 'Economy' or 'First Class'");
    String seatTypePref = keyboard.nextLine();
    System.out.println("----- Seat Location -----\nEnter: 'Aisle' 'Middle' or 'Window'");
    String seatLocationPref = keyboard.nextLine();
    System.out.println("----- Airport Origin Code -----\nEnter: Airport Origin Code");
    String airportOriginCodePref = keyboard.nextLine();

    // TODO Store these preferences
  }

  public void displayHotelPreferenceSelection() {
    keyboard.nextLine();
    System.out.println("----- Number of Beds -----\nEnter: Number of Beds (As a Number)");
    int bedCountPref = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("----- Bed Type -----\nEnter: 'Twin' 'Queen' or 'King'");
    String bedTypePref = keyboard.nextLine();
    System.out.println("----- Smoking Accomidation -----\nEnter: 'Yes' or 'No'");
    String smokingAccomPref = keyboard.nextLine();
    System.out.println("----- Pet Friendly -----\nEnter: 'Yes' or 'No'");
    String petAccomPref = keyboard.nextLine();
    System.out.println("----- Check-In Date -----\nEnter: a date in MM/DD/YYYY format");
    String checkInDate = keyboard.nextLine();
    System.out.println("----- Check-out Date -----\nEnter: a date in MM/DD/YYYY format");
    String checkoutDate = keyboard.nextLine();

    // TODO store these preferences
  }

  public void displaySearchAllFlights() {
    keyboard.nextLine();
    System.out.println("----- Search All Flights -----");
    System.out.println(fsystem.getFlights().toString());
  }

  public void displaySearchAllHotels() {
    keyboard.nextLine();
    System.out.println("----- Search All Hotels -----");
    // TODO display 3 hotels
  }

  public void displaySearchFlightsPref() {
    keyboard.nextLine();
    System.out.println("----- Search Flights Based off Preferences -----");
    // TODO display 3ish flights, based off preferences
  }

  public void displaySearchHotelPref() {
    keyboard.nextLine();
    System.out.println("----- Search Hotels Based off Preferences -----");
    // TODO display 3ish Hotels, based off preferences
  }

  public void displayBookingHistory() {
    keyboard.nextLine();
    System.out.println("----- Display Booking History -----");
    // TODO display booking history
  }

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

  public void displayAddPassportInfo() {
    keyboard.nextLine();
    System.out.println("----- Adding Passport Information -----");
    System.out.println("\n----- First Name -----\nEnter: Your First Name'");
    String passfirstName = keyboard.nextLine();
    System.out.println("\n----- Last Name -----\nEnter: Your Last Name");
    String passlastName = keyboard.nextLine();
    System.out.println("\n----- Passport Number -----\nEnter: Your Passport Number (as a number)");
    int passportnum = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("----- Date of Birth -----\nEnter: Your birth date in MM/DD/YYYY format");
    String passbirthDate = keyboard.nextLine();
    System.out.println("----- Issue Date -----\nEnter: The date your passport was issued in MM/DD/YYYY format");
    String passissueDate = keyboard.nextLine();
    System.out.println("----- Expiration Date -----\nEnter: The date your passport will expire in MM/DD/YYYY format");
    String passexperationDate = keyboard.nextLine();
    System.out.println("----- Sex -----\nEnter: The Sex on your Passport 'M' or 'F'");
    String passsex = keyboard.nextLine();
  }

  public void displayThankYouMessage() {
    keyboard.nextLine();
    System.out.println(
        "----- Thank YOU For Booking With Us! -----\nWhat else can we do for you?\n1: View Booked Flight(s)\n2: Search More Flights\n3: Search Hotels\n4: Return to Menu");
    switch (keyboard.nextInt()) {
      // View Booked Flight
      case 1:
        displayBookedFlights();
        break;
      // Search Flights
      case 2:
        displaySearchFlights();
        break;
      // Search Hotels
      case 3:
        displaySearchHotels();
        break;
      // Display the Menu
      case 4:
        displayMenu();
        break;
    }
  }

  public void displayBookedFlights() {
    keyboard.nextLine();
    System.out.println("DISPLAY BOOKED FLIGHTS HERE");
  }

  public void displayBookedHotels() {
    keyboard.nextLine();
    System.out.println("DISPLAY BOOKED HOTELS HERE");
  }

  public void displayFlightHistory() {
    keyboard.nextLine();
    System.out.println("DISPLAY FLIGHT HISTORY HERE");
  }

  public static void main(String[] args) {
    MainDriver mD = new MainDriver();
    mD.run();
  }
}
