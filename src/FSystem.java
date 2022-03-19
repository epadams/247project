public class FSystem {
  private Users users;
  private User currentUser;

  public FSystem() {
    users = Users.getInstance();
    // TODO remove this test statement
    System.out.println(users.getUsers().toString());
  }

  public void createAccount(String username, String password, String email) {

  }

  public void login(String username, String password) {

  }

  public User getCurrentUser() {
    return currentUser;
  }


}
