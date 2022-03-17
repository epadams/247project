package src;

import java.util.Date;

public class RentalCar extends Booking {
    private CarType type;
    private Date startDate;
    private Date endDate;

    public RentalCar() {

    }

    public RentalCar(CarType type, Date startDate, Date endDate) {

    }

    public CarType getType() {
      return this.type;
    }

    public Date getStartDate() {
      return this.startDate;
    }

    public Date getEndDate() {
      return this.endDate;
    }

    public void setType(CarType type) {

    }

    public void setStartDate(Date startDate) {

    }

    public void setEndDate(Date endDate) {

    }
}
