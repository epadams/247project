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
  /**
   * search for the taxi UUID
   * @param id
   * @return identity 
   */
  public Taxi searchTaxiID(UUID id){
    for(Taxi identity : taxiList){
      if(identity.getUUID().equals(id)){
        return identity;
      }
    }
    return null;
  }
  /**
   * search for the taxi service name
   * @param serviceName
   * @return name
   */
  public Taxi searchServiceName(String serviceName){
    for(Taxi name : taxiList){
      if(name.getServiceName().contains(serviceName)){
        return name;
      }
    }
    return null;
  }
  /**
   * search for base price of taxi
   * @param basePrice
   * @return price
   */
  public Taxi searchBasePrice(double basePrice){
    for(Taxi price : taxiList){
      if(price.getBasePrice() == basePrice){
        return price;
      }
    }
    return null;
  }
  /**
   * search for cost per mile for taxi 
   * @param costPerMile
   * @return cost
   */
  public Taxi searchCostPerMile(double costPerMile){
    for(Taxi cost : taxiList){
      if(cost.getCostPerMile() == costPerMile){
        return cost;
      }
    }
    return null;
  }
}
