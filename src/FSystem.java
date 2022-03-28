import java.util.UUID;

public class FSystem {
  private Users users;
  private User currentUser;
  private Flights flights;

  public FSystem() {
    currentUser = null;
    users = Users.getInstance();
    flights = Flights.getInstance(); 
  }

  public void createAccount(String username, String password, String email, int age) {
    users.addUser(username, password, email, age);
  }

  public int login(String username, String password) {
    if (!users.haveUser(username)) return 1;
    if (!users.getUser(username).getPassword().equals(password)) return 2;
    currentUser = users.getUser(username);
    return 3;
  }

  // TODO fix
  public boolean logout() {
    users.saveUsers();
    return true;
  }

  public User getCurrentUser() {
    return currentUser;
  }

  public Users getUsers() {
    return this.users;
  }

  public Flights getFlights() {
    return this.flights;
  }

  public String registerFlight(UUID id, int row, char aisle) {
    if (flights.searchFlightID(id).searchSeats(row, aisle).getVacancy()) {
      flights.searchFlightID(id).registerSeat(row, aisle);
      this.getCurrentUser().addBookedSeat(id);
      return "Your seat has been booked";
    } else {
      return "Your seat is taken";
    }
  }
}
