/*
 * TODO
 * fix saving users' bookings
 */

import java.util.ArrayList;
import java.util.UUID;

/**
 * this class reads and traverses through all the users in the application
 */
public class Users {
  private static Users users;
  private ArrayList<User> userList;

  /**
   * constructs our users from the JSON file
   */
  private Users() {
    userList = JReader.getUsers();
  }

  /**
   * gets instance of users
   * @return the users we want to traverse and pull from
   */
  public static Users getInstance() {
    if (users == null) {
      users = new Users();
    }
    return users;
  }

  /**
   * checks if we have a user in our user list
   * @param username the user's username we want to check if we have in our list
   * @return boolean type value: true if we have a use with the user, false if not
   */
  public boolean haveUser(String username) {
    for (User user : userList) {
      if (user.getUserName().equals(username)) {
        return true;
      }
    }
    return false;
  }

  /**
   * gets the User with the username we want
   * @param username the username of the user we want to get
   * @return the user we wanted to get or null if user is not there
   */
  public User getUser(String username) {
    for (User user : userList) {
      if (user.getUserName().equals(username)) {
        return user;
      }
    }
    return null;
  }

  /**
   * gets our list of users
   * @return the list of users
   */
  public ArrayList<User> getUsers() {
    return userList;
  }

  /**
   * adds user to our list of users if we don't already have
   * @param username the username of the user we want to add
   * @param password the password of the user we want to add
   * @param email the email of the user we want to add
   * @param age the age of the user we want to add
   */
  public void addUser(String username, String password, String email, int age) {
    if (haveUser(username)) return;
    userList.add(new User(UUID.randomUUID(), username, password, email, age));
  }

  /**
   * saves users to our JSON file
   */
  public void saveUsers() {
    JWriter.saveUsers();
  }

  /**
   * prints all the Users
   * @return the String type value of all the UsersS
   */
  public String printAllUsers() {
    String ret = "";
    for (User user : userList) {
      ret += user.toString();
    }
    return ret;
  }
}
