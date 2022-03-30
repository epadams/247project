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
  public ArrayList<Flight> searchFlights(String flightName) {
    ArrayList<Flight> matchedFlights = new ArrayList<Flight>();
    for (Flight flight : flightList) {
      if (flight.getFlightName().contains(flightName)) {
        matchedFlights.add(flight);
      }
    }
    return matchedFlights;
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
  public ArrayList<Flight> searchAirline(String airline) {
    ArrayList<Flight> matchedFlights = new ArrayList<Flight>();
    for (Flight flight : flightList) {
      if (flight.getAirline().contains(airline)) {
        matchedFlights.add(flight);
      }
    }
    return matchedFlights;
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
  public ArrayList<Flight> searchDepartureTime(String departureTime) {
    ArrayList<Flight> matchedFlights = new ArrayList<Flight>();
    for (Flight flight : flightList) {
      if (flight.getDepartureTime().contains(departureTime)) {
        matchedFlights.add(flight);
      }
    }
    return matchedFlights;
  }

  /**
   * searches for a specific arrival time based on the time passed 
   * @param arrivalTime
   * @return arrival time or null
   */
  public ArrayList<Flight> searchArrivalTime(String arrivalTime) {
    ArrayList<Flight> matchedFlights = new ArrayList<Flight>();
    for (Flight flight : flightList) {
      if (flight.getArrivalTime().contains(arrivalTime)) {
        matchedFlights.add(flight);
      }
    }
    return matchedFlights;
  }

  public ArrayList<Flight> searchFlightType(String flightType) {
    ArrayList<Flight> matchedFlights = new ArrayList<Flight>();
    for (Flight flight : flightList) {
      if (flight.getFlightType().contains(flightType)) {
        matchedFlights.add(flight);
      }
    }
    return matchedFlights;
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

  public Seat searchSeatsByUUID(UUID id) {
    for (Flight flight : flightList) {
      for (Seat seat : flight.getSeats()) {
        if (seat.getUUID().equals(id)) return seat; 
      }
    }
    return null;
  }
}
