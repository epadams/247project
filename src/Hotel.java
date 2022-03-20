import java.sql.Date;
import java.util.ArrayList;

public class Hotel extends Booking {
  private ArrayList<Room> rooms;
  private String location;

  public Hotel() {
    this.rooms = new ArrayList<Room>();
  }

  public Hotel(ArrayList<Room> rooms, String location) {
    this.rooms = rooms;
    this.location = location;
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

  public void setLocation(String location) {
    this.location = location;
  }

  public String getLocation() {
    return this.location;
  }
}
