import java.util.UUID;

public class Seat extends Flight {
  private UUID id;
  private int row;
  private char aisle;
  private SeatType type;
  private boolean vacancy;

  public Seat() {

  }

  public Seat(UUID id, int row, char aisle, SeatType type, boolean vacancy) {
    this.id = id;
    this.row = row;
    this.aisle = aisle;
    this.type = type;
    this.vacancy = vacancy;
  }

  public UUID getUUID() {
    return this.id;
  }

  public void setRow(int row) {
    this.row = row;
  }

  public int getRow() {
    return this.row;
  }

  public void setAisle(char aisle) {
    this.aisle = aisle;
  }

  public char getAisle() {
    return this.aisle;
  }

  public void setVacancy(boolean vacancy) {
    this.vacancy = vacancy;
  }

  public boolean getVacancy() {
      return this.vacancy;
  }

  public void setType(SeatType type) {
    this.type = type;
  }

  public SeatType getType() {
    return this.type;
  }

  public String toString() {
    return "ID: " + this.id.toString() + "\nRow: " + this.row + "\nAisle: "
      + this.aisle + "\nType: " + this.type + "\nVacancy: " + this.vacancy;
  }
}
