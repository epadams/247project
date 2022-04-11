import java.util.UUID;

/**
 * this class stored info for each seat in the flight
 */
public class Seat extends Flight {
  private UUID id;
  private int row;
  private char aisle;
  private SeatType type;
  private boolean vacancy;

  /**
   * constructs seat
   */
  public Seat() {

  }

  /**
   * constructs seat based on given information
   * @param id the UUID for the seat
   * @param row the row in the flight the seat is on
   * @param aisle the aisle in the flight the seat is on
   * @param type the type of seat
   * @param vacancy if the seat has been booked already or not
   */
  public Seat(UUID id, int row, char aisle, SeatType type, boolean vacancy) {
    this.id = id;
    this.row = row;
    this.aisle = aisle;
    this.type = type;
    this.vacancy = vacancy;
  }

  /**
   * gets the UUID for the seat
   * @return the seat's UUID
   */
  public UUID getUUID() {
    return this.id;
  }

  /**
   * will set the Seats UUID to the given parameter
   * @param id UUID we want for the seat
   */
  public void setUUID(UUID id) {
    this.id = id;
  }

  /**
   * sets the row for the seat in the flight
   * @param row the row in the flight the seat is on
   */
  public void setRow(int row) {
    this.row = row;
  }

  /**
   * gets the row the seat is on in the flight
   * @return the row the seat is on
   */
  public int getRow() {
    return this.row;
  }

  /**
   * sets the aisle in the flight the seat is on
   * @param aisle the aisle the seat is on
   */
  public void setAisle(char aisle) {
    this.aisle = aisle;
  }

  /**
   * gets the aisle the seat is on in the flight
   * @return the aisle the seat is on
   */
  public char getAisle() {
    return this.aisle;
  }

  /**
   * sets the value of if the seat is vacant or not
   * @param vacancy the true or false value on whether the seat is vacant or not
   */
  public void setVacancy(boolean vacancy) {
    this.vacancy = vacancy;
  }

  /**
   * gets the vacancy value for the seat
   * @return true if the seat is vacant, false if not
   */
  public boolean getVacancy() {
    return this.vacancy;
  }

  /**
   * sets the type of seat in the flight
   * @param type the type os seat this seat is
   */
  public void setType(SeatType type) {
    this.type = type;
  }

  /**
   * gets the seat's type
   * @return the seat's type
   */
  public SeatType getType() {
    return this.type;
  }

  /**
   * shows the data for the seat in a string type value
   * @return the String holding all the seat's datas
   */
  public String toString() {
    return "ID: " + this.id.toString() + "\nRow: " + this.row + "\nAisle: "
      + this.aisle + "\nType: " + this.type + "\nVacancy: " + this.vacancy;
  }

  /**
   * gets the seat's row and aisle
   * @return the seat's row and aisle in the flight represented in a string type value
   */
  public String getSeatRowAndAisle() {
    return Integer.toString(this.row) + this.aisle;
  }
}
