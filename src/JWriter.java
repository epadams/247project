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
    userDetails.put(USER_FIRST_NAME, user.getFirstName());
    userDetails.put(USER_LAST_NAME, user.getLastName());
    userDetails.put(USER_AGE, user.getAge());
    userDetails.put(USER_ADDRESS, user.getAddress());
    userDetails.put(USER_FREQFLYER, user.getFreqFlyerStatus());

    return userDetails;
  }

  public static void savePreferences() {
    //Preferences preference = new Preferences();

  }

  public static void saveFlight() {
     Flights flight = Flights.getInstance();                //commented until methods are created 
     ArrayList<Flight> flightList = flight.getFlights(); //TODO fix
    JSONArray jsonFlights = new JSONArray();

    for(int i = 0;i<flightList.size();i++){
      jsonFlights.add(getFlightJSON(flightList.get(i)));
    }
    try (FileWriter file = new FileWriter(USER_FILE_NAME)) {
      file.write(jsonFlights.toJSONString());
      file.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  public static JSONObject getFlightJSON(Flight flight){
    JSONObject flightDetails = new JSONObject();
    flightDetails.put(FLIGHT_ID, flight.getUUID().toString());
    flightDetails.put(FLIGHT_FLIGHTNAME, flight.getFlightName().toString());
    flightDetails.put(FLIGHT_DEPARTURETIME, flight.getDepartureTime());
    flightDetails.put(FLIGHT_ARRIVALTIME, flight.getArrivalTime());            //commented till updated 
    flightDetails.put(FLIGHT_DEPARTURE, flight.getDeparture());
    flightDetails.put(FLIGHT_DESTINATION, flight.getDestination());
    flightDetails.put(FLIGHT_AIRLINE, flight.getAirline());
    flightDetails.put(FLIGHT_FLIGHTTYPE, flight.getFlightType());

    return flightDetails;
  }
  }

