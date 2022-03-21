import java.util.Date;
import java.util.ArrayList;

public class Room {
  private int roomNumber;
  private int numOfBeds;
  private boolean smoking;
  private ArrayList<Date> bookedDates;

  public Room() {
    this.bookedDates = new ArrayList<Date>();
  }

  public Room(int roomNumber, int numOfBeds, boolean smoking, ArrayList<Date> bookedDates) {
    this.roomNumber = roomNumber;
    this.numOfBeds = numOfBeds;
    this.smoking = smoking;
    this.bookedDates = bookedDates;
  }

  public void setRoomNumber(int roomNumber) {
    this.roomNumber = roomNumber;
  }

  public int getRoomNumber() {
    return this.roomNumber;
  }

  public int getNumOfBeds() {
    return this.numOfBeds;
  }

  public boolean getSmoking() {
    return this.smoking;
  }

  public void setNumOfBeds(int numOfBeds) {
    this.numOfBeds = numOfBeds;
  }

  public void setSmoking(boolean smoking) {
    this.smoking = smoking;
  }
  
  public void addBookedDate(Date date) {
    if (haveBookedDate(date)) return;
    this.bookedDates.add(date);
  }

  public ArrayList<Date> getBookedDates() {
    return this.bookedDates;
  }

  public boolean haveBookedDate(Date wantedDate) {
    for (Date date : bookedDates) {
      if (date.equals(wantedDate)) {
        return true;
      }
    }
    return false;
  }
}
