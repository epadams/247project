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

    }

    public int getNumOfBeds() {
        return 0;
    }

    public boolean getSmoking() {
        return true;
    }

    public boolean getVacancy(Date startDate, Date endDate) {
        return true;
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
        return new Date();
    }

    public Date getEndDate() {
        return new Date();
    }

    public void serStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
