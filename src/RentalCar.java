import java.util.Date;
import java.util.UUID;

public class RentalCar extends Booking {
  private String name;
  private CarType type;
  private Date startDate;
  private Date endDate;

  public RentalCar() {

  }

  public RentalCar(String name, CarType type, Date startDate, Date endDate) {
    this.name = name;
    this.type = type;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    return this.name;
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
