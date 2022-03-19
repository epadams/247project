package src;

public class MainDriver {
  private FSystem fsystem;

  public MainDriver() {
    fsystem = new FSystem();
  }

  public void run() {
    System.out.println("hello");
    fsystem.getCurrentUser();
  }

  public static void main(String[] args) {
    MainDriver mD = new MainDriver();
    mD.run();
  }
}
