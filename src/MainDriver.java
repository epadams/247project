public class MainDriver {
  private FSystem fsystem;

  public MainDriver() {
    fsystem = new FSystem();
  }

  public void run() {
    fsystem.getCurrentUser();
    fsystem.createAccount("testUser2", "a2df", "test2@email.com", 20);
    System.out.println(fsystem.getUsers().printAllUsers());
    fsystem.logout();
  }

  public static void main(String[] args) {
    MainDriver mD = new MainDriver();
    mD.run();
  }
}
