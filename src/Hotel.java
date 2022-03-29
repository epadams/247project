import java.util.ArrayList;
import java.util.UUID;
/**
 * A class that holds the information of hotels 
 */
public class Hotel {
  private UUID id;
  private ArrayList<Room> rooms;
  private String hotelName;
  private String location;
  private int price;
  private int starRating;
  private boolean hasPool;
/**
 * creates a new arraylist of rooms 
 */
  public Hotel() {
    this.rooms = new ArrayList<Room>();
  }
/**
 * An instance of a hotel, sets the id,hotelname, location,price, starRate, pool and rooms to the information passed 
 * @param id
 * @param hotelName
 * @param location
 * @param price
 * @param starRating
 * @param hasPool
 * @param rooms
 */
  public Hotel(UUID id, String hotelName, String location, int price, int starRating,
      boolean hasPool, ArrayList<Room> rooms) {
    this.id = id;
    this.hotelName = hotelName;
    this.location = location;
    this.price = price;
    this.starRating = starRating;
    this.hasPool = hasPool;
    this.rooms = rooms;
  }
/**
 * gets the UUID of the hotel 
 * @return this.id
 */
  public UUID getUUID() {
    return this.id;
  }
/**
 * sets the rooms based on the information passed 
 * @param rooms
 */
  public void setRooms(ArrayList<Room> rooms) {
    this.rooms = rooms;
  }
/**
 * gets the rooms 
 * @return this.rooms
 */
  public ArrayList<Room> getRooms() {
    return this.rooms;
  }
/**
 * gets the number of rooms 
 * @return this.room.size()
 */
  public int getNumOfRooms() {
    return this.rooms.size();
  }
/**
 * sets the hotel name based on the name passed 
 * @param hotelName
 */
  public void setHotelName(String hotelName) {
    this.hotelName = hotelName;
  }
/**
 * gets the hotel name
 * @return this.hotelName
 */
  public String getHotelName() {
    return this.hotelName;
  }
/**
 * sets the location of the hotel based on the location passed 
 * @param location
 */
  public void setLocation(String location) {
    this.location = location;
  }
/**
 * gets the hotels location 
 * @return this.location 
 */
  public String getLocation() {
    return this.location;
  }
/**
 * sets the price of the hotel based on the price passed 
 * @param price
 */
  public void setPrice(int price) {
    this.price = price;
  }
/**
 * gets the price of the hotel 
 * @return this.price 
 */
  public int getPrice() {
    return this.price;
  }
/**
 * Sets the star rating for the hotel based on the rating that is passed 
 * @param starRating
 */
  public void setStarRating(int starRating) {
    this.starRating = starRating;
  }
/**
 * gets the star rating for the hotel 
 * @return star rating 
 */
  public int getStarRating() {
    return this.starRating;
  }
/**
 * sets whether the hotel has a pool or not 
 * @param hasPool
 */
  public void setHasPool(boolean hasPool) {
    this.hasPool = hasPool;
  }
/**
 * gets whether or not the hotel has a pool 
 * @return this.hasPool
 */
  public boolean getHasPool() {
    return this.hasPool;
  }
/**
 * toString method that prints the id, hotel name, hotel location, price, star rating and whether or not it has a pool
 * @returns string with necessary data 
 */
  public String toString() {
    return "ID: " + this.id + "\nHotel Name: " + this.hotelName + "\nLocation: "
      + this.location + "\nPrice: " + this.price + "\nStars: " + this.starRating
      + "\nHas a pool: " + this.hasPool;
  }
}
