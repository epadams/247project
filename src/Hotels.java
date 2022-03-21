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
}
