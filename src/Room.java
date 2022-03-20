import java.util.Date;

public class Room {
  private int numOfBeds;
  private boolean smoking;
  private boolean vacancy;
  private Date startDate;
  private Date endDate;

  public Room() {

  }

  public Room(int numOfBeds, boolean smoking, boolean vacancy) {
    this.numOfBeds = numOfBeds;
    this.smoking = smoking;
    this.vacancy = vacancy;
  }

  public int getNumOfBeds() {
      return this.numOfBeds;
  }

  public boolean getSmoking() {
      return this.smoking;
  }

  public boolean getVacancy(Date startDate, Date endDate) {
      return this.vacancy;
  }

  public void setNumOfBeds(int numOfBeds) {
      this.numOfBeds = numOfBeds;
  }

  public void setSmoking(boolean smoking) {
      this.smoking = smoking;
  }

  public void setVacancy(boolean vacancy) {
      this.vacancy = vacancy;
  }

  public Date getStartDate() {
      return this.startDate;
  }

  public Date getEndDate() {
      return this.endDate;
  }

  public void setStartDate(Date startDate) {
      this.startDate = startDate;
  }

  public void setEndDate(Date endDate) {
      this.endDate = endDate;
  }
}
