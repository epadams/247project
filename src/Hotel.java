package src;

import java.sql.Date;
import java.util.ArrayList;

public class Hotel extends Booking {
  private ArrayList<Room> rooms;
  private int numOfRooms;
  private String location;

  public Hotel() {

  }

  public Hotel(ArrayList<Room> rooms, Date startDate, Date endDate, int numOfRooms) {

  }

  public ArrayList<Room> getRooms() {
    // return arraylist of rooms
    return this.rooms;
  }

  public int getNumOfRooms() {
    // return length of the array list
    return this.numOfRooms;
  }

  // setters

}
