import java.util.ArrayList;
import java.util.UUID;
/**
 * A class that holds functionality for flights 
 */
public class Flights {
  private static Flights flights;
  private ArrayList<Flight> flightList;
 
/**
 * loads the flights list from the Jreader with information of each flight 
 */
  private Flights() {
    flightList = JReader.getFlights();
  }
/**
 * Gets the instance of flights and creates a new instance of flights there is not one already 
 * @return flights 
 */
  public static Flights getInstance() {
    if (flights == null) {
      flights = new Flights();
    }
    return flights;
  }
  /**
   * Checks if there is a flight within the flightlist 
   * @param flightName
   * @return true or false
   */
  public boolean haveFlight(String flightName) {
    for (Flight flight : flightList) {
      if (flight.getFlightName().equals(flightName)) {
        return true;
      }
    }
    return false;
  }
/**
 * Gets a flight within the flight list 
 * @param flightName
 * @return flight or null
 */
  public Flight getFlight(String flightName) {
    for (Flight flight : flightList) {
      if (flight.getFlightName().equals(flightName)) {
        return flight;
      }
    }
    return null;
  }
/**
 * Gets the flight light 
 * @return flightlist
 */
  public ArrayList<Flight> getFlights() {
    return flightList;
  }
/**
 * Adds a new flight to the flight list 
 * @param flightname
 */
  public void addFlight(String flightname) {
    if (haveFlight(flightname)) {
      return;
    }
    // flightList.add(new Flight(UUID.randomUUID(), );
  }

  // TODO Implement
  public void saveFlights() {
    // JWriter.saveFlights();
  }
  /**
   * Prints all of the flights within the flight list
   * @return ret
   */
  public String printAllFlights() {
    String ret = "";
    for (Flight flight : flightList) {
      ret += flight.toString();
    }
    return ret;
  }
/**
 * searches the a flight by its name in the flight list 
 * @param flightName
 * @return flight or null
 */
  public Flight searchFlights(String flightName) {
    for (Flight flight : flightList) {
      if (flight.getFlightName().contains(flightName)) {
        return flight;
      }
    }
    return null;
  }
/**
 * searches for the destination that is passed wihtin the flightlist and adds it to matched flights 
 * @param destination
 * @return matchedFlights 
 */
  public ArrayList<Flight> searchDestination(String destination) {
    ArrayList<Flight> matchedFlights = new ArrayList<Flight>();
    for (Flight flight : flightList) {
      if (flight.getDestination().contains(destination)) {
        matchedFlights.add(flight);
      }
    }
    return matchedFlights;
  }
/**
 * Searches the specific UUID for a flight in the flight list 
 * @param id
 * @return identity or null
 */
  public Flight searchFlightID(UUID id) {
    for (Flight identity : flightList) {
      // Used .equals here check behind to make sure this is the best way
      // (Added note: maybe use .compareTo)
      if (identity.getUUID().equals(id)) {
        return identity;
      }
    }
    return null;
  }
/**
 * searches for a specific airline within the flightlist 
 * @param airline
 * @return air or null
 */
  public Flight searchAirline(String airline) {
    for (Flight air : flightList) {
      if (air.getAirline().contains(airline)) {
        return air;
      }
    }
    return null;
  }
/**
 * Searches for a specific place of departure based on the information passed  and adds it to matchedFlights 
 * @param departure
 * @return matchedFLights 
 */
  public ArrayList<Flight> searchDeparture(String departure) {
    ArrayList<Flight> matchedFlights = new ArrayList<Flight>();
    for (Flight depart : flightList) {
      if (depart.getDeparture().contains(departure)) {
        matchedFlights.add(depart);
      }
    }
    return matchedFlights;
  }
/**
 * Searches for a specific place of departure and destination based on the departure and destination passed and adds it to machedFlights 
 * @param departure
 * @param destination
 * @return matchedFlights 
 */
  public ArrayList<Flight> searchDepartureAndDestination(String departure,
      String destination) {
    ArrayList<Flight> matchedFlights = new ArrayList<Flight>();
    for (Flight flight : flightList) {
      if (flight.getDeparture().contains(departure)
          && flight.getDestination().contains(destination)) {
        matchedFlights.add(flight);
      }
    }
    return matchedFlights;
  }
/**
 * searches for a specific depature time based on the time that is passed 
 * @param departureTime
 * @return departTime or null
 */
  public Flight searchDepartureTime(String departureTime) {
    for (Flight departTime : flightList) {
      if (departTime.getDepartureTime().contains(departureTime)) {
        return departTime;
      }
    }
    return null;
  }
/**
 * searches for a specific arrival time based on the time passed 
 * @param arrivalTime
 * @return arrival time or null
 */
  public Flight searchArrivalTime(String arrivalTime) {
    for (Flight arriveTime : flightList) {
      if (arriveTime.getArrivalTime().contains(arrivalTime)) {
        return arriveTime;
      }
    }
    return null;
  }

  public Flight searchFlightType(String flightType) {
    for (Flight type : flightList) {
      if (type.getFlightType().contains(flightType)) {
        return type;
      }
    }
    return null;
  }
/**
 * toString method that prints the flightList 
 * @return ret 
 */
  public String toString() {
    String ret = "";
    for (Flight flight : flightList) {
      ret += flight.toString() + "\n";
    }
    return ret;
  }
}
