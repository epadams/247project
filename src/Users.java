/*
 * TODO
 * make it possible to add users
 * get users
 * save users
 * see if a user exists
 * etc
 */

package src;

import java.util.ArrayList;

public class Users {
  private static Users users;
  private ArrayList<User> userList;

  private Users() {
    // add reading in users from json
  }

  public static Users getInstance () {
    if (users == null) {
      users = new Users();
    }
    return users;
  }
}
