// import java.util.Date;
import java.util.ArrayList;

public class Room {
  private int numOfBeds;
  private boolean smoking;
  private ArrayList<String> bookedDates;
  private int roomNumber;

  public Room() {
    this.bookedDates = new ArrayList<String>();
  }

  public Room(int roomNumber, int numOfBeds, boolean smoking, ArrayList<String> bookedDates) {
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

  public void addBookedDate(String date) {
    if (haveBookedDate(date)) return;
    this.bookedDates.add(date);
  }

  public ArrayList<String> getBookedDates() {
    return this.bookedDates;
  }

  public boolean haveBookedDate(String wantedDate) {
    for (String date : bookedDates) {
      if (date.equals(wantedDate)) {
        return true;
      }
    }
    return false;
  }
}
