package src;

import java.util.Date;

public class RentalCar extends Booking {
    private CarType type;
    private Date startDate;
    private Date endDate;

    public RentalCar() {

    }

    public RentalCar(CarType type, Date startDate, Date endDate) {
      this.type = type;
      this.startDate = startDate;
      this.endDate = endDate;
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
      this.type = type;
    }

    public void setStartDate(Date startDate) {
      this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
      this.endDate = endDate;
    }
}
