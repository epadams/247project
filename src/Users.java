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
    
    // TODO change id to be insde construction
    UUID id = UUID.randomUUID();
    userList.add(new User(id, username, password, email, age));
  }

  // TODO
  public void saveUsers() {

  }

  // TODO add tostring
}
