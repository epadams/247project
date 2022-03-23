import java.util.ArrayList;
import java.util.UUID;

public class Flights {
  private static Flights flights;
  private ArrayList<Flight> flightList;
 

  private Flights() {
    flightList = JReader.getFlights();
  }

  public static Flights getInstance() {
    if (flights == null) {
      flights = new Flights();
    }
    return flights;
  }
  
  public boolean haveFlight(String flightName) {
    for (Flight flight : flightList) {
      if (flight.getFlightName().equals(flightName)) {
        return true;
      }
    }
    return false;
  }

  public Flight getFlight(String flightName) {
    for (Flight flight : flightList) {
      if (flight.getFlightName().equals(flightName)) {
        return flight;
      }
    }
    return null;
  }

  public ArrayList<Flight> getFlights() {
    return flightList;
  }

  // FIX
  public void addFlight(String flightname) {
    if (haveFlight(flightname)) return;
    // flightList.add(new Flight(UUID.randomUUID(), );
  }

  public void saveFlights() {
    // JWriter.saveFlights();
  }
  
  public String printAllFlights() {
    String ret = "";
    for (Flight flight : flightList) {
      ret += flight.toString();
    }
    return ret;
  }

  public Flight searchFlights(String flightName) {
    for (Flight flight : flightList) {
      if (flight.getFlightName().contains(flightName)) {
        return flight;
      }
    }
    return null;
  }

  public Flight searchDestination(String destination){
    for(Flight dest : flightList){
      if(dest.getDestination().contains(destination)){
        return dest;
      }
    }
    return null;
  }

  public Flight searchID(UUID id){
    for(Flight identity : flightList){
      if(identity.getUUID().equals(id)){                  //Used .equals here check behind to make sure this is the best way
        return identity;
      }
    }
    return null;
  }

  public Flight searchAirline(String airline){
    for(Flight air : flightList){
      if(air.getAirline().contains(airline)){
        return air;
      }
    }
    return null;
  }

  public Flight searchDeparture(String departure){
    for(Flight depart : flightList){
      if(depart.getDeparture().contains(departure)){
        return depart;
      }
    }
    return null;
  }

  public Flight searchDepartureTime(String departureTime){
    for(Flight departTime : flightList){
      if(departTime.getDepartureTime().contains(departureTime)){
        return departTime;
      }
    }
    return null;
  }

  public Flight searchArrivalTime(String arrivalTime){
    for(Flight arriveTime : flightList){
      if(arriveTime.getArrivalTime().contains(arrivalTime)){
        return arriveTime;
      }
    }
    return null;
  }

  public Flight searchFlightType(String flightType){
    for(Flight type : flightList){
      if(type.getFlightType().contains(flightType)){
        return type;
      }
    }
    return null;
  }
}
