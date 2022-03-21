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
}
