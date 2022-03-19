public class FSystem {
  private Users users;
  private User currentUser;

  public FSystem() {
    users = Users.getInstance();
    // TODO remove this test statement
    System.out.println(users.getUsers().get(0).toString());
    logout();
    createAccount("testUser2", "a2df", "test2@email.com", 20);
    System.out.println(users.getUsers().get(1).toString());
  }

  public void createAccount(String username, String password, String email, int age) {
    users.addUser(username, password, email, age);
  }

  public void login(String username, String password) {

  }

  public void logout() {
    users.saveUsers();
  }

  public User getCurrentUser() {
    return currentUser;
  }


}
