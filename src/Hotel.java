import java.sql.Date;
import java.util.ArrayList;
import java.util.UUID;

public class Hotel extends Booking {
  private UUID id;
  private ArrayList<Room> rooms;
  private String hotelName;
  private String location;

  public Hotel() {
    this.rooms = new ArrayList<Room>();
  }

  public Hotel(UUID id, ArrayList<Room> rooms, String hotelName, String location) {
    this.id = id;
    this.rooms = rooms;
    this.hotelName = hotelName;
    this.location = location;
  }

  public UUID getUUID() {
    return this.id;
  }

  public void setRooms() {
    this.rooms = rooms;
  }

  public ArrayList<Room> getRooms() {
    return this.rooms;
  }

  public int getNumOfRooms() {
    return this.rooms.size();
  }

  public void setHotelName(String hotelName) {
    this.hotelName = hotelName;
  }

  public String getHotelName() {
    return this.hotelName;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getLocation() {
    return this.location;
  }
}
