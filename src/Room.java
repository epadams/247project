// import java.util.Date;
import java.util.ArrayList;

/**
 * this class gets and stored data for the hotel room
 */
public class Room {
  private int numOfBeds;
  private boolean smoking;
  private ArrayList<String> bookedDates;
  private int roomNumber;

  /**
   * constructs room
   */
  public Room() {
    this.bookedDates = new ArrayList<String>();
  }

  /**
   * contstructs room based on data given
   * @param roomNumber the room number
   * @param numOfBeds number of beds in room
   * @param smoking true if smoking is allowed in room, false if not
   * @param bookedDates the dates the room is booked
   */
  public Room(int roomNumber, int numOfBeds, boolean smoking, ArrayList<String> bookedDates) {
    this.roomNumber = roomNumber;
    this.numOfBeds = numOfBeds;
    this.smoking = smoking;
    this.bookedDates = bookedDates;
  }

  /**
   * sets the room number to the value we need
   * @param roomNumber the room muner associated with the room
   */
  public void setRoomNumber(int roomNumber) {
    this.roomNumber = roomNumber;
  }

  /**
   * get the room's room number
   * @return the room's room number
   */
  public int getRoomNumber() {
    return this.roomNumber;
  }

  /**
   * gets the number of beds in the room
   * @return the number of beds in the room
   */
  public int getNumOfBeds() {
    return this.numOfBeds;
  }

  public boolean getSmoking() {
    return this.smoking;
  }

  /**
   * sets the number of beds in the room to the value we need
   * @param numOfBeds the number of beds we want to associate to the room
   */
  public void setNumOfBeds(int numOfBeds) {
    this.numOfBeds = numOfBeds;
  }

  /**
   * sets if the room is a smoking room or not
   * @param smoking true of false value of if smoking is allowed in the room or not
   */
  public void setSmoking(boolean smoking) {
    this.smoking = smoking;
  }

  /**
   * adds booked dates to the room
   * @param date the date we want to book the room
   */
  public void addBookedDate(String date) {
    if (haveBookedDate(date)) return;
    this.bookedDates.add(date);
  }

  /**
   * gets the dates the room is booked
   * @return all the dates the room is booked
   */
  public ArrayList<String> getBookedDates() {
    return this.bookedDates;
  }

  /**
   * check if the room is booked at the date we want
   * @param wantedDate the date we want to book a room
   * @return a boolean type value whether the room is available on the wanted date or not
   */
  public boolean haveBookedDate(String wantedDate) {
    for (String date : bookedDates) {
      if (date.equals(wantedDate)) {
        return true;
      }
    }
    return false;
  }
}
