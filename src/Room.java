package src;

import java.util.ArrayList;
import java.util.Date;

public class Room {
    private int numOfBeds;
    private boolean smoking;
    private boolean vacancy;
    private ArrayList<Date> bookedDates;

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

    }

    public void setSmoking(boolean smoking) {

    }

    public void setVacancy(boolean vacancy) {

    }

    public Date getStartDate() {
        return new Date();
    }

    public Date getEndDate() {
        return new Date();
    }

    public void setStartDate(Date startDate) {

    }

    public void setEndDate(Date endDate) {

    }

}