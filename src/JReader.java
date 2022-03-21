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
      JSONArray usersJSON = (JSONArray) new JSONParser().parse(reader);

      // TODO update to include all elements of json
      for (int i = 0; i < usersJSON.size(); i++) {
        JSONObject userJSON = (JSONObject) usersJSON.get(i);
        UUID id =  UUID.fromString((String) userJSON.get(USER_ID));
        String username = (String) userJSON.get(USER_USERNAME);
        String password = (String) userJSON.get(USER_PASSWORD);
        String email = (String) userJSON.get(USER_EMAIL);
        String firstName = (String) userJSON.get(USER_FIRST_NAME);
        String lastName = (String) userJSON.get(USER_LAST_NAME);
        int age = ((Long) userJSON.get(USER_AGE)).intValue();
        String address = (String) userJSON.get(USER_ADDRESS);
        boolean frequentFlyer = (boolean) userJSON.get(USER_FREQFLYER);

        // users.add(new User(id, username, password, email, age));
        users.add(new User(id, username, password, email, firstName, lastName, age,
              address, frequentFlyer));
      }
      return users;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public static ArrayList<Flight> getFlightList() {
    ArrayList<Flight> flights = new ArrayList<Flight>();
    try {
      FileReader reader = new FileReader(USER_FILE_NAME);
      JSONArray flightsJSON = (JSONArray) new JSONParser().parse(reader);

      //TODO update to include all elements of json (Ask ethan)
      //TODO update JWriter for flights
      for(int i = 0;i < flightsJSON.size();i++) {
        //JSONObject flightJSON = (JSONObject) flightsJSON.get(i);
        //UUID id =  UUID.fromString((String) flightsJSON.get(USER_ID));
        // String flightName = (String) flightsJSON.get(USER_FLIGHTNAME);
        // String departureTime = (String) flightsJSON.get(USER_DEPARTURETIME);       //Commented until JWriter is updated
        // String arrivalTime = (String) flightsJSON.get(USER_ARRIVALTIME);
        // String placeOfDeparture = (String) flightsJSON.get(USER_PLACEOFDEPARTURE);
        // String placeOfArrival = (String) flightsJSON.get(USER_PLACEOFARRIVAL);
        // String airline = (String) flightsJSON.get(USER_AIRLINE);
        // String type = (String) flightsJSON.get(USER_TYPE);
        //flights.add(new Flight(id,flightName,departueTime,arrivalTime,placeOfDeparture,placeOfArrival,airline,type));
      }
      return flightList;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}
