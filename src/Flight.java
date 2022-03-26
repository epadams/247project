import java.util.UUID;
import java.util.ArrayList;
// import java.sql.Time;

/**
 * A class flight that extends booking 
 */
public class Flight extends Booking {
  private UUID id;
  private String flightName;
  private String airline;
  private String departure;
  private String destination;
  private String departureTime;
  private String arrivalTime;
  private String flightType;
  private ArrayList<Seat> seats;
  
  public Flight() {
    seats = new ArrayList<Seat>();
  }

  /**
   * sets the id,flightname,airline,departure,destination, departuretime,arrivaltime, and flightype to the params passed
   * @param id
   * @param flightName
   * @param airline
   * @param departure
   * @param destination
   * @param departureTime
   * @param arrivalTime
   * @param flightType
   */
  public Flight(UUID id, String flightName, String airline, String departure,
      String destination, String departureTime, String arrivalTime,
      String flightType, ArrayList<Seat> seats) {
    this.id = id;
    this.flightName = flightName;
    this.airline = airline;
    this.departure = departure;
    this.destination = destination;
    this.departureTime = departureTime;
    this.arrivalTime = arrivalTime;
    this.flightType = flightType;
    this.seats = seats;
  }

  /**
   * gets the UUID
   * @return this.id
   */
  public UUID getUUID() {
    return this.id;
  }

  /**
   * sets the destination to the destination passed
   */
  public void setDestination(String destination) {
    this.destination = destination;
  }

  /**
   * get the destination 
   * @return this.destination 
   */
  public String getDestination() {
    return this.destination;
  }

  /**
   * set teh place of departure to the place of departure passed
   * @param departure
   */
  public void setDeparture(String departure) {
    this.departure = departure;
  }

  /**
   * gets the place of departure 
   * @return this.departure
   */
  public String getDeparture() {
    return this.departure;
  }

  /**
   * sets the departure time to the time that is passed 
   * @param time
   */
  public void setDepartureTime(String depatureTime) {
    this.departureTime = depatureTime;
  }

  /**
   * gets the departure time
   * @return this.departureTime
   */
  public String getDepartureTime() {
    return this.departureTime;
  }

  /**
   * sets the arrival time to the arrival time passed
   * @param arrivalTime
   */
  public void setArrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
  }   

  /**
   * gets the arrival time
   * @return this.arrivalTime
   */
  public String getArrivalTime() {
    return this.arrivalTime;
  }

  /**
   * sets the flight type based on the flight type passed
   * @param flightType
   */
  public void setFlightType(String flightType) {
    this.flightType = flightType;
  }

  /**
   * gets the flight type
   * @return this.flightType
   */
  public String getFlightType() {
    return this.flightType;
  }

  /**
   * sets the flight name based on the flight name passed
   * @param flightName
   */
  public void setFlightName(String flightName) {
    this.flightName = flightName;
  }

  /**
   * gets the flight name
   * @return this.flightName
   */
  public String getFlightName() {
    return this.flightName;
  }

  /**
   * setst the airline based on the airline passed 
   * @param airline
   */
  public void setAirline(String airline) {
    this.airline = airline;
  }

  /**
   * gets the airline
   * @return this.airline
   */
  public String getAirline() {
    return this.airline;
  }

  public ArrayList<Seat> getSeats() {
    return this.seats;
  }

  public void setSeats(ArrayList<Seat> seats) {
    this.seats = seats;
  }

  /**Prints the flight information 
   * @return String with id,flightname,depaturetime,arrivaltime,place of departure, place of arrival, airline, flightype
   */
  public String toString() {
    return "ID: " + this.id + "\nFlight Name: " + this.flightName
      + "\nDeparture Time: " + this.departureTime + "\nArrival Time: "
      + this.arrivalTime + "\nPlace of Departure: " + this.departure
      + "\nPlace of Arrival: " + this.destination + "\nAirline: "
      + this.airline + "\nType: " + this.flightType + "\n";
  }

  public String printSeatMap() {
    if (seats.isEmpty()) return null;
    String ret = "";
    int currRow = 1;
    for (int i = 0; i < seats.size(); i++) {
      if (currRow != seats.get(i).getRow()) {
        ret += "\n";
      }
      if (seats.get(i).getVacancy()) {
        ret += "O";
      } else {
        ret += "X";
      }
      currRow++;
    }
    return ret;
  }

  public Seat searchSeats(String location) {
    for (Seat seat : seats) {
      if (seat.getRow() == (Integer.parseInt(location.substring(0, 0)))
          && seat.getAisle() == (location.charAt(1))) {
        return seat;
      }
    }
    return null;
  }

  public void registerSeat(String location) {
    for (Seat seat : seats) {
      if (seat.getRow() == (Integer.parseInt(location.substring(0, 0)))
          && seat.getAisle() == (location.charAt(1))) {
        seat.setVacancy(false);
      }
    }
  }
}
