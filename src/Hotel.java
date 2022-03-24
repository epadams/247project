import java.util.*;
import java.util.ArrayList;
import java.util.UUID;

public class Hotel {
  private UUID id;
  private ArrayList<Room> rooms;
  private String hotelName;
  private String location;
  private int price;
  private double starRating;
  private boolean hasPool;

  public Hotel() {
    this.rooms = new ArrayList<Room>();
  }

  public Hotel(UUID id, String hotelName, String location, int price, double starRating, boolean hasPool, ArrayList<Room> rooms) {
    this.id = id;
    this.hotelName = hotelName;
    this.location = location;
    this.price = price;
    this.starRating = starRating;
    this.hasPool = hasPool;
    this.rooms = rooms;
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

  public void setPrice(int price) {
    this.price = price;
  }

  public int getPrice() {
    return this.price;
  }

  public void setStarRating(double starRating) {
    this.starRating = starRating;
  }

  public double getStarRating() {
    return this.starRating;
  }

  public void setHasPool(boolean hasPool) {
    this.hasPool = hasPool;
  }

  public boolean getHasPool() {
    return this.hasPool;
  }
}
