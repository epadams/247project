import java.util.ArrayList;
import java.util.UUID;

public class Users {
  private static Users users;
  private ArrayList<User> userList;

  private Users() {
    userList = JReader.getUsers();
  }

  public static Users getInstance() {
    if (users == null) {
      users = new Users();
    }
    return users;
  }
  
  public boolean haveUser(String username) {
    for (User user : userList) {
      if (user.getUserName().equals(username)) {
        return true;
      }
    }
    return false;
  }

  public User getUser(String username) {
    for (User user : userList) {
      if (user.getUserName().equals(username)) {
        return user;
      }
    }
    return null;
  }

  public ArrayList<User> getUsers() {
    return userList;
  }

  public void addUser(String username, String password, String email, int age) {
    if (haveUser(username)) return;
    userList.add(new User(UUID.randomUUID(), username, password, email, age));
  }

  public void saveUsers() {
    JWriter.saveUsers();
  }
  
  public String printAllUsers() {
    String ret = "";
    for (User user : userList) {
      ret += user.toString();
    }
    return ret;
  }
}
