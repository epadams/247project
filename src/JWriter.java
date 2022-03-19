import java.util.ArrayList;
import java.io.IOException;
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JWriter extends DataConstants {

  public static void saveUsers () {
    Users users = Users.getInstance();
    ArrayList<User> userList = users.getUsers();
    JSONArray jsonUsers = new JSONArray();

    for (int i = 0; i < userList.size(); i++) {
      jsonUsers.add(getUserJSON(userList.get(i)));
    }

    try (FileWriter file = new FileWriter(USER_FILE_NAME)) {
      file.write(jsonUsers.toJSONString());
      file.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static JSONObject getUserJSON(User user) {
    JSONObject userDetails = new JSONObject();
    userDetails.put(USER_ID, user.getId().toString());
    userDetails.put(USER_USERNAME, user.getUserName());
    userDetails.put(USER_PASSWORD, user.getPassword());
    userDetails.put(USER_EMAIL, user.getEmail());
    userDetails.put(USER_AGE, user.getAge());

    return userDetails;
  }
}
