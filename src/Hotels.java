import java.util.ArrayList;
import java.util.UUID;

public class Hotels {
  private static Hotels hotels;
  private ArrayList<Hotel> hotelList;

  private Hotels() {
    // hotelList = JReader.getHotels();
  }

  public static Hotels getInstance() {
    if (hotels == null) {
      hotels = new Hotels();
    }
    return hotels;
  }
  
  public boolean haveHotel(String hotelName) {
    for (Hotel hotel : hotelList) {
      if (hotel.getHotelName().equals(hotelName)) {
        return true;
      }
    }
    return false;
  }

  public Hotel getHotel(String hotelName) {
    for (Hotel hotel : hotelList) {
      if (hotel.getHotelName().equals(hotelName)) {
        return hotel;
      }
    }
    return null;
  }

  public ArrayList<Hotel> getHotels() {
    return hotelList;
  }

  public void addHotel(String hotelName, String password, String email, int age) {
    if (haveHotel(hotelName)) return;
    // hotelList.add(new Hotel(UUID.randomUUID(), hotelName, password, email, age));
  }

  public void saveHotels() {
    // JWriter.saveHotels();
  }
  
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
  public Hotel searchHotelID(UUID id){
    for(Hotel identity : hotelList){
      if(identity.getUUID().equals(id)){
        return identity;
      }
    }
    return null;
  }
  /**
   * search for hotel name
   * @param hotelName
   * @return name
   */
  public Hotel searchHotelName(String hotelName){
    for(Hotel name : hotelList){
      if(name.getHotelName().contains(hotelName)){
        return name;
      }
    }
    return null;
  }
  /**
   * search for hotel location 
   * @param hotelLocation
   * @return location
   */
  public Hotel searchHotelLocation(String hotelLocation){
    for(Hotel location : hotelList){
      if(location.getLocation().contains(hotelLocation)){
        return location;
      }
    }
    return null;
  }

  // public Hotel searchNumberOfRoom(int numOfRooms){
  //   for(Hotel rooms : hotelList){
  //     if(rooms.getNumOfRooms() == (numOfRooms)){       //I dont really know about this method tbh
  //       return rooms;
  //     }
  //   }
  //   return null;
  // }

  //maybe add searchRooms method
}
