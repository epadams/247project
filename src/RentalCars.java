import java.sql.Date;
import java.util.ArrayList;
import java.util.UUID;

public class RentalCars {
  private static RentalCars rentalCars;
  private ArrayList<RentalCar> rentalCarList;

  private RentalCars() {
    // rentalCarList = JReader.getRentalCars();
  }

  public static RentalCars getInstance() {
    if (rentalCars == null) {
      rentalCars = new RentalCars();
    }
    return rentalCars;
  }
  
  public boolean haveRentalCar(String rentalCarname) {
    for (RentalCar rentalCar : rentalCarList) {
      if (rentalCar.getName().equals(rentalCarname)) {
        return true;
      }
    }
    return false;
  }

  public RentalCar getRentalCar(String rentalCarname) {
    for (RentalCar rentalCar : rentalCarList) {
      if (rentalCar.getName().equals(rentalCarname)) {
        return rentalCar;
      }
    }
    return null;
  }

  public ArrayList<RentalCar> getRentalCars() {
    return rentalCarList;
  }

  public void addRentalCar(String rentalCarname, String password, String email, int age) {
    if (haveRentalCar(rentalCarname)) return;
    // rentalCarList.add(new RentalCar());
  }

  public void saveRentalCars() {
    // JWriter.saveRentalCars();
  }
  
  public String printAllRentalCars() {
    String ret = "";
    for (RentalCar rentalCar : rentalCarList) {
      ret += rentalCar.toString();
    }
    return ret;
  }
  /**
   * search for rental car name
   * @param name
   * @return car
   */
  public RentalCar searchCarName(String name){
    for(RentalCar car : rentalCarList){
      if(car.getName().contains(name)){
        return car;
      }
    }
    return null;
  }
/**
 * search for the rental car type
 * @param type
 * @return cartype
 */
  public RentalCar searchCarType(CarType type){
    for(RentalCar cartype : rentalCarList){
      if(cartype.getType().equals(type)){             //check .equals if it is best for this
        return cartype;
      }
    }
    return null;
  }
/**
 * search for the start date of rental car
 * @param startDate
 * @return start
 */
  public RentalCar searchStartDate(Date startDate){
    for(RentalCar start : rentalCarList){
      if(start.getStartDate().equals(startDate)){
        return start;
      }
    }
    return null;
  }
/**
 * search for the end date of rental car
 * @param endDate
 * @return end
 */
  public RentalCar seachEndDate(Date endDate){
    for(RentalCar end : rentalCarList){
      if(end.getEndDate().equals(endDate)){
        return end;
      }
    }
    return null;
  }
}
