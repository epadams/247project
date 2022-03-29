import java.util.ArrayList;
import java.io.FileReader;
// import java.sql.Time;
import java.util.UUID;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 * a class JReader that entends DataConstants and reads the JSON files and sets variables based on the contents of the respective JSON file
 */
public class JReader extends DataConstants {
/**
 * Gets all of the users information from the JSON file and sets it to the appropriate variable 
 * adds and creates a new user based on these variable 
 * @return users
 */
  public static ArrayList<User> getUsers() {
    ArrayList<User> users = new ArrayList<User>();
    try {
      FileReader reader = new FileReader(USER_FILE_NAME);
      JSONArray usersJSON = (JSONArray) new JSONParser().parse(reader);

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

        JSONArray seatsArray = (JSONArray) userJSON.get(USER_BOOKED_SEATS);
        ArrayList<UUID> seatUUIDs = new ArrayList<UUID>();
        if (seatsArray != null) {
          for (int j = 0; j < seatsArray.size(); j++) {
            UUID seatUUID = UUID.fromString((String) seatsArray.get(j));
            seatUUIDs.add(seatUUID);
          }
        }

        JSONArray roomsArray = (JSONArray) userJSON.get(USER_BOOKED_ROOMS);
        ArrayList<UUID> roomUUIDs = new ArrayList<UUID>();
        if (roomsArray != null) {
          for (int j = 0; j < roomsArray.size(); j++) {
            UUID roomUUID = UUID.fromString((String) roomsArray.get(j));
            roomUUIDs.add(roomUUID);
          }
        }

        JSONArray passportsArray = (JSONArray) userJSON.get(USER_PASSPORTS);
        ArrayList<UUID> passportUUIDs = new ArrayList<UUID>();
        if (passportsArray != null) {
          for (int j = 0; j < passportsArray.size(); j++) {
            UUID passportUUID = UUID.fromString((String) passportsArray.get(j));
            passportUUIDs.add(passportUUID);
          }
        }

        users.add(new User(id, username, password, email, firstName, lastName, age,
              address, frequentFlyer, new ArrayList<Passport>(), seatUUIDs, roomUUIDs));
      }
      return users;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
 /**
  * Gets all of the preference information from the JSON file and sets it to the appropriate variable 
  * adds and creates a new instance of preferences based on these variable 
  * @return preferences 
  */
  public static ArrayList<Preferences> getPreferences() {
    ArrayList<Preferences> preferences = new ArrayList<Preferences>();
    try {
      FileReader reader = new FileReader(PREF_FILE_NAME);
      JSONArray preferencesJSON = (JSONArray) new JSONParser().parse(reader);
      for (int i = 0; i < preferencesJSON.size(); i++) {
        JSONObject preferenceJSON = (JSONObject) preferencesJSON.get(i);

        UUID id = UUID.fromString((String) preferenceJSON.get(USER_ID));
        boolean medicalAccom = (boolean) preferenceJSON.get(PREF_MED_ACCOM);
        String originAirport = (String) preferenceJSON.get(PREF_ORIGIN_CODE);
        String seatType = (String) preferenceJSON.get(PREF_SEAT_TYPE);
        int numBaggage = (int) preferenceJSON.get(PREF_BAGGAGE);
        String airline = (String) preferenceJSON.get(PREF_AIRLINE);
        String flightType = (String) preferenceJSON.get(PREF_FLIGHT_TYPE);

        preferences.add(new Preferences(id, medicalAccom, originAirport,
              seatType, numBaggage, airline, flightType));
      }
      return preferences;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
/**
 *  Gets all of the flights information from the JSON file and sets it to the appropriate variable 
 *  adds and creates a new instance of a flight based on these variable 
 * @return flight 
 */
  public static ArrayList<Flight> getFlights() {
    ArrayList<Flight> flight = new ArrayList<Flight>();
    try {
      FileReader reader = new FileReader(FLIGHT_FILE_NAME);
      JSONArray flightsJSON = (JSONArray) new JSONParser().parse(reader);

      for (int i = 0; i < flightsJSON.size(); i++) {
        JSONObject flightJSON = (JSONObject) flightsJSON.get(i);
        

        JSONArray seatsArray = (JSONArray) flightJSON.get(FLIGHT_SEATS);
        ArrayList<UUID> seatUUIDs = new ArrayList<UUID>();
        if (seatsArray != null) {
          for (int j = 0; j < seatsArray.size(); j++) {
            UUID seatUUID = UUID.fromString((String) seatsArray.get(j));
            seatUUIDs.add(seatUUID);
          }
        }

        UUID id =  UUID.fromString((String) flightJSON.get(FLIGHT_ID));
        String flightName = (String) flightJSON.get(FLIGHT_FLIGHTNAME);
        String arrivalTime = (String) flightJSON.get(FLIGHT_ARRIVALTIME);
        String departureTime = (String) flightJSON.get(FLIGHT_DEPARTURETIME);
        String departure = (String) flightJSON.get(FLIGHT_DEPARTURE);
        String destination = (String) flightJSON.get(FLIGHT_DESTINATION);
        String airline = (String) flightJSON.get(FLIGHT_AIRLINE);
        String flightType = (String) flightJSON.get(FLIGHT_FLIGHTTYPE);
        flight.add(new Flight(id, flightName, airline, departure, destination,
              departureTime, arrivalTime, flightType, getSeats(seatUUIDs)));
      }
      return flight;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
/**
 * Gets all of the seat information from the JSON file and sets it to the appropriate variable 
 * adds and creates a new instance of a seat based on these variable 
 * @param ids
 * @return seats
 */
  public static ArrayList<Seat> getSeats(ArrayList<UUID> ids) {
    ArrayList<Seat> seats = new ArrayList<Seat>();
    try {
      FileReader reader = new FileReader(SEATS_FILE_NAME);
      JSONArray seatsJSON = (JSONArray) new JSONParser().parse(reader);
      for (int i = 0; i < seatsJSON.size(); i++) {
        JSONObject seatJSON = (JSONObject) seatsJSON.get(i);
        UUID id =  UUID.fromString((String) seatJSON.get(USER_ID));
        if (ids.contains(id)) {
          int row = ((Long) seatJSON.get(SEATS_ROW_NUM)).intValue();
          char aisle = ((String) seatJSON.get(SEATS_AISLE_NUM)).charAt(0);
          boolean availability = Boolean.parseBoolean(((String) seatJSON.get(SEATS_AVAIL)));
          // TODO fix type
          SeatType type = ((SeatType) seatJSON.get(USER_FIRST_NAME));
          seats.add(new Seat(id, row, aisle, type, availability));
        }
      }
      return seats;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
/**
 * Gets all of the Hotels information from the JSON file and sets it to the appropriate variable 
 * adds and creates a new instance of a hotel based on these variable 
 * @return hotels 
 */
  public static ArrayList<Hotel> getHotels() {
    ArrayList<Hotel> hotels = new ArrayList<Hotel>();
    try {
      FileReader reader = new FileReader(HOTEL_FILE_NAME);
      JSONArray hotelsJSON = (JSONArray) new JSONParser().parse(reader);
      for (int i = 0; i < hotelsJSON.size(); i++) {
        JSONObject hotelJSON = (JSONObject) hotelsJSON.get(i);

        JSONArray roomsArray = (JSONArray) hotelJSON.get(HOTEL_ROOMS);
        ArrayList<UUID> roomUUIDs = new ArrayList<UUID>();
        if (roomUUIDs != null) {
          for (int j = 0; j < roomsArray.size(); j++) {
            UUID roomUUID = UUID.fromString((String) roomsArray.get(j));
            roomUUIDs.add(roomUUID);
          }
        }

        UUID id =  UUID.fromString((String) hotelJSON.get(HOTEL_ID));
        String hotelName = (String) hotelJSON.get(HOTEL_NAME);
        String location = (String) hotelJSON.get(HOTEL_LOCATION);
        int price = ((Long) hotelJSON.get(HOTEL_PRICE)).intValue();
        int rating = ((Long) hotelJSON.get(HOTEL_RATING)).intValue();
        boolean hasPool = Boolean.parseBoolean(((String) hotelJSON.get(HOTEL_POOL)));
        ArrayList<Room> rooms = getRooms(roomUUIDs);
        hotels.add(new Hotel(id, hotelName, location, price, rating, hasPool, rooms));
      }
      return hotels;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
/**
 * Gets all of the rooms information from the JSON file and sets it to the appropriate variable 
 * adds and creates a new instance of a room based on these variable 
 * @param ids
 * @return rooms
 */
  public static ArrayList<Room> getRooms(ArrayList<UUID> ids) {
    ArrayList<Room> rooms = new ArrayList<Room>();
    try {
      FileReader reader = new FileReader(ROOM_FILE_NAME);
      JSONArray roomsJSON = (JSONArray) new JSONParser().parse(reader);
      for (int i = 0; i < roomsJSON.size(); i++) {
        JSONObject roomJSON = (JSONObject) roomsJSON.get(i);
        UUID id = UUID.fromString((String) roomJSON.get(ROOM_ID));
        if (ids.contains(id)) {
          int roomNumber = ((Long) roomJSON.get(ROOM_ROOM_NUM)).intValue();
          boolean smoking = Boolean.parseBoolean(((String) roomJSON.get(ROOM_SMOKING)));
          int numberOfBeds = ((Long) roomJSON.get(ROOM_NUM_BED)).intValue();
          
          JSONArray datesArray = (JSONArray) roomJSON.get(ROOM_BOOKED_DATES);
          ArrayList<String> roomDates = new ArrayList<String>();
          if (datesArray != null) {
            for (int j = 0; j < datesArray.size(); j++) {
              String dateString = (String) datesArray.get(j);
              roomDates.add(dateString);
            }
          }
          rooms.add(new Room(roomNumber, numberOfBeds, smoking, roomDates)); 
        }
      }
      return rooms;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}
