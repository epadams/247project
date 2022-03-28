import java.util.ArrayList;
import java.io.IOException;
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.UUID;

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
    userDetails.put(USER_BOOKED_SEATS, saveUserSeats(user));
    userDetails.put(USER_BOOKED_ROOMS, saveUserRooms(user));

    return userDetails;
  }

  public static JSONArray saveUserSeats(User user) {
    JSONArray bookedSeats = new JSONArray();
    ArrayList<UUID> seatUUIDs = user.getBookedSeatIDs();
    if (seatUUIDs != null) {
      for (int i = 0; i < seatUUIDs.size(); i++) {
        UUID id = seatUUIDs.get(i);
        bookedSeats.add(id.toString());
      }
    }
    return bookedSeats;
  }

  public static JSONArray saveUserRooms(User user) {
    JSONArray bookedRooms = new JSONArray();
    ArrayList<UUID> roomUUIDs = user.getBookedSeatIDs();
    if (roomUUIDs != null) {
      for (int i = 0; i < roomUUIDs.size(); i++) {
        UUID id = roomUUIDs.get(i);
        bookedRooms.add(id.toString());
      }
    }
    return bookedRooms;
  }

  public static void savePreferences() {
    Preferences preferences = Preferences.getInstance();
    JSONArray jsonUserPreferences = new JSONArray();
    jsonUserPreferences.add(getPreferenceJSON(preferences));
    
    try (FileWriter file = new FileWriter(USER_FILE_NAME)) {
      file.write(jsonUserPreferences.toJSONString());
      file.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static JSONObject getPreferenceJSON(Preferences preference) {
    //Preferences preference = new Preferences();
<<<<<<< HEAD
=======
    JSONObject userPreferences = new JSONObject();
    userPreferences.put(PREF_ID, preference.getId().toString());
    userPreferences.put(PREF_MED_ACCOM,preference.getMedicalAccomodation());
    userPreferences.put(PREF_ORIGIN_CODE,preference.getAirportOrigin());
    userPreferences.put(PREF_SEAT_TYPE,preference.getSeatType());
    userPreferences.put(PREF_BAGGAGE,preference.getNumBaggage());
    userPreferences.put(PREF_AIRLINE,preference.getAirline());
    userPreferences.put(PREF_FLIGHT_TYPE,preference.getFlightType());

    return userPreferences;

>>>>>>> mahipref
  }

  public static void saveFlight() {
    Flights flight = Flights.getInstance();
    ArrayList<Flight> flightList = flight.getFlights();
    JSONArray jsonFlights = new JSONArray();

    for(int i = 0; i<flightList.size(); i++) {
      jsonFlights.add(getFlightJSON(flightList.get(i)));
    }
    try (FileWriter file = new FileWriter(USER_FILE_NAME)) {
      file.write(jsonFlights.toJSONString());
      file.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static JSONObject getFlightJSON(Flight flight) {
    JSONObject flightDetails = new JSONObject();
    flightDetails.put(FLIGHT_ID, flight.getUUID().toString());
    flightDetails.put(FLIGHT_FLIGHTNAME, flight.getFlightName().toString());
    flightDetails.put(FLIGHT_DEPARTURETIME, flight.getDepartureTime());
    flightDetails.put(FLIGHT_ARRIVALTIME, flight.getArrivalTime());
    flightDetails.put(FLIGHT_DEPARTURE, flight.getDeparture());
    flightDetails.put(FLIGHT_DESTINATION, flight.getDestination());
    flightDetails.put(FLIGHT_AIRLINE, flight.getAirline());
    flightDetails.put(FLIGHT_FLIGHTTYPE, flight.getFlightType());

    return flightDetails;
  }
}
