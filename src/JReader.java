package src;

import java.util.ArrayList;
import java.io.FileReader;
import java.util.UUID;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JReader extends DataConstants {

  public static ArrayList<User> getUsers() {
    ArrayList<User> users = new ArrayList<User>();
    try {
      FileReader reader = new FileReader(USER_FILE_NAME);
      // JSONParser parser = new JSONParser();
      //
      JSONArray usersJSON = (JSONArray) new JSONParser().parse(reader);

      for (int i = 0; i < usersJSON.size(); i++) {
        JSONObject userJSON = (JSONObject) usersJSON.get(i);
        UUID id =  UUID.fromString((String) userJSON.get(USER_ID));
        String username = (String) userJSON.get(USER_USERNAME);
        String password = (String) userJSON.get(USER_PASSWORD);
        String email = (String) userJSON.get(USER_EMAIL);
        int age = ((Long) userJSON.get(USER_AGE)).intValue();

        users.add(new User(id, username, password, email, age));
      }
      return users;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public void readFromFile() {

  }

}
