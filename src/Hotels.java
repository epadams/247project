import java.util.ArrayList;
import java.util.UUID;

/**
 * a class that manages the hotelList 
 */
public class Hotels {
  private static Hotels hotels;
  private ArrayList<Hotel> hotelList;

  /**
   * loads the hotelList from JReader with information for hotels 
   */
  private Hotels() {
    hotelList = JReader.getHotels();
  }

  /**
   * gets the instance of a hotel. if there is not one, creates a new instance of hotels 
   * @return hotels
   */
  public static Hotels getInstance() {
    if (hotels == null) {
      hotels = new Hotels();
    }
    return hotels;
  }

  /**
   * checks if the hotel name passed is in the hotelList 
   * @param hotelName
   * @return true or false
   */
  public boolean haveHotel(String hotelName) {
    for (Hotel hotel : hotelList) {
      if (hotel.getHotelName().equals(hotelName)) {
        return true;
      }
    }
    return false;
  }

  /**
   * gets the hotel based of the hotel name passed 
   * @param hotelName
   * @return hotel or null
   */
  public Hotel getHotel(String hotelName) {
    for (Hotel hotel : hotelList) {
      if (hotel.getHotelName().equals(hotelName)) {
        return hotel;
      }
    }
    return null;
  }

  /**
   * Gets the hotelList 
   * @return hotelLIst */
  public ArrayList<Hotel> getHotels() {
    return hotelList;
  }

  /**
   * adds a new hotel based on the parameters passed to the hotelList 
   * @param String hotelName
   * @param int price 
   * @param String location 
   * @param int starRating 
   * @param boolean hasPool 
   */
  public void addHotel(String hotelName, int price, String location,
      int starRating, boolean hasPool) {
    if (haveHotel(hotelName)) return;
    // hotelList.add(new Hotel(UUID.randomUUID(), hotelName, password, email, age));
  }

  /**
   * saves the hotels 
   */
  public void saveHotels() {
    // JWriter.saveHotels();
  }

  /**
   * prints the hotelList 
   * @return ret
   */
  public String printAllHotels() {
    String ret = "";
    for (Hotel hotel : hotelList) {
      ret += hotel.toString();
    }
    return ret;
  }

  /**
   * search for Hotel UUID
   * @param id
   * @return identity 
   */
  public Hotel searchHotelID(UUID id) {
    for (Hotel hotel : hotelList) {
      if (hotel.getUUID().equals(id)) {
        return hotel;
      }
    }
    return null;
  }

  /**
   * search for hotel name
   * @param hotelName
   * @return name
   */
  public ArrayList<Hotel> searchHotelName(String hotelName) {
    ArrayList<Hotel> matchedHotels = new ArrayList<Hotel>();
    for (Hotel hotel : hotelList) {
      if (hotel.getHotelName().contains(hotelName)) {
        matchedHotels.add(hotel);
      }
    }
    return matchedHotels;
  }

  /**
   * search for hotel location 
   * @param hotelLocation
   * @return location
   */
  public ArrayList<Hotel> searchHotelLocation(String hotelLocation) {
    ArrayList<Hotel> matchedHotels = new ArrayList<Hotel>();
    for (Hotel hotel : hotelList) {
      if (hotel.getLocation().contains(hotelLocation)) {
        matchedHotels.add(hotel);
      }
    }
    return matchedHotels;
  }

  // public Hotel searchNumberOfRoom(int numOfRooms){
  //   for(Hotel rooms : hotelList){
  //     if(rooms.getNumOfRooms() == (numOfRooms)){       //I dont really know about this method tbh
  //       return rooms;
  //     }
  //   }
  //   return null;
  // }

  /**
   * toString method that prints the hotelList 
   * @return ret
   */
  public String toString() {
    String ret = "";
    for (Hotel hotel : hotelList) {
      ret += hotel.toString() + "\n";
    }
    return ret;
  }

  public Room searchRooms(UUID id) {
    for (Hotel hotel : hotelList) {
      for (Room room : hotel.getRooms()) {
        if (room.getUUID().equals(id)) return room; 
      }
    }
    return null;
  }
}
