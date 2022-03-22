import java.util.Scanner;

public class MainDriver {
  private FSystem fsystem;

  public MainDriver() {
    fsystem = new FSystem();
  }

  // TODO break this up into multiple methods
  public void run() {
    Scanner keyboard = new Scanner(System.in);
    System.out.println(fsystem.getFlights().printAllFlights());
    // debugging
    // fsystem.getCurrentUser();
    // fsystem.createAccount("testUser2", "a2df", "test2@email.com", 20);
    // System.out.println(fsystem.getUsers().printAllUsers());
    displayLogin();
    switch (keyboard.nextInt()) {
      case 1:
        System.out.println("Login"); // Move to Login
        break;
      case 2:
        System.out.println("Create Account");
        break;
      case 3:
        System.out.println("Continue As Guest");
        break;
    }
    boolean run = true;
    while (run) {
      displayMenu();
      switch (keyboard.nextInt()) {
        // Search Flights
        case 1:
          System.out.println("case 1");
          break;
        // Search Hotels
        case 2:
          System.out.println("case 2");
          break;
        // View Booked Flights
        case 3:
          System.out.println("case 3");
          break;
        // View Booked Hotels
        case 4:
          System.out.println("case 4");
          break;
        // View Account Info
        case 5:
          System.out.println("case 5");
          break;
        // Logout
        case 6:
          fsystem.logout();
          run = false;
          break;
      }
    }
    keyboard.close();

  }

  public void displayLogin() {
    System.out.println("******** Welcome ********\n1: Login\n2: Create Account"
        + "\n3: Continue as guest");
  }

  public void displayMenu() {
    System.out.println(
        "******** Main Menu ********\n1: Search Flights\n2: Search Hotels\n3: View Booked Flights\n4: View Booked Hotels\n5: View Account Information\n6: Logout");
  }

  public void Login() {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("******** Login ********\nPlease Enter Your Username");
    String usrnm = keyboard.nextLine();
    System.out.println("\nPlease Enter Your Password");
    String pass = keyboard.nextLine();
    fsystem.login(usrnm, pass); // What does this do?

  }

  public static void main(String[] args) {
    MainDriver mD = new MainDriver();
    mD.run();
  }
}
