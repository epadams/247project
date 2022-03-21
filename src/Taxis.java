import java.util.ArrayList;
import java.util.UUID;

public class Taxis {
  private static Taxis taxis;
  private ArrayList<Taxi> taxiList;

  private Taxis() {
    // taxiList = JReader.getTaxis();
  }

  public static Taxis getInstance() {
    if (taxis == null) {
      taxis = new Taxis();
    }
    return taxis;
  }
  
  public boolean haveTaxi(String taxiName) {
    for (Taxi taxi : taxiList) {
      if (taxi.getServiceName().equals(taxiName)) {
        return true;
      }
    }
    return false;
  }

  public Taxi getTaxi(String taxiName) {
    for (Taxi taxi : taxiList) {
      if (taxi.getServiceName().equals(taxiName)) {
        return taxi;
      }
    }
    return null;
  }

  public ArrayList<Taxi> getTaxis() {
    return taxiList;
  }

  public void addTaxi(String taxiName, String password, String email, int age) {
    if (haveTaxi(taxiName)) return;
    // taxiList.add(new Taxi(UUID.randomUUID(), taxiName, password, email, age));
  }

  public void saveTaxis() {
    // JWriter.saveTaxis();
  }
  
  public String printAllTaxis() {
    String ret = "";
    for (Taxi taxi : taxiList) {
      ret += taxi.toString();
    }
    return ret;
  }
}
