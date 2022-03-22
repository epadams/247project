public class FSystem {
  private Users users;
  private User currentUser;
  private Flights flights;

  public FSystem() {
    currentUser = null;
    users = Users.getInstance();
    // flights = Flights.getInstance(); 
  }

  public void createAccount(String username, String password, String email, int age) {
    users.addUser(username, password, email, age);
  }

  public void login(String username, String password) {
    if (!users.haveUser(username)) return;
    if (!users.getUser(username).getPassword().equals(password)) return;
    currentUser = users.getUser(username);
  }

  public void logout() {
    users.saveUsers();
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
}
