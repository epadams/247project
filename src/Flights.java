import java.util.ArrayList;
import java.util.UUID;

public class Flights {
  private static Flights flights;
  private ArrayList<Flight> flightList;

  private Flights() {
    // flightList = JReader.getFlights();
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
}
