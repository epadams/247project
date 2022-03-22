import java.util.Scanner;

public class MainDriver {
  private FSystem fsystem;

  public MainDriver() {
    fsystem = new FSystem();
  }

  // TODO break this up into multiple methods
  public void run() {
    displayLogin();
    Scanner keyboard = new Scanner(System.in);
    switch (keyboard.nextInt()) {
      case 1:
        System.out.println("login case 1");
        break;
      case 2:
        System.out.println("login case 2");
        break;
      case 3:
        System.out.println("login case 3");
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
          System.exit(0);
          break;
      }
    }
    keyboard.close();

    // debugging
    // fsystem.getCurrentUser();
    // fsystem.createAccount("testUser2", "a2df", "test2@email.com", 20);
    // System.out.println(fsystem.getUsers().printAllUsers());
  }

  public void displayLogin() {
    System.out.println("******** Welcome ********\n1: Login\n2: Create Account"
        + "\n3: Continue as guest");
  }

  public void displayMenu() {
    System.out.println(
        "******** Main Menu ********\n1: Search Flights\n2: Search Hotels\n3: View Booked Flights\n4: View Booked Hotels\n5: View Account Information\n6: Logout");
  }

  public static void main(String[] args) {
    MainDriver mD = new MainDriver();
    mD.run();
  }
}
