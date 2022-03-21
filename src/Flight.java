import java.util.UUID;
import java.sql.Time;


public class Flight extends Booking {
  private UUID id;
  private String flightName;
  private String airline;
  private String departure;
  private String destination;
  private Time departureTime;
  private Time arrivalTime;
  private FlightType flightType;
  private int travelTime;
  
  

  Flight() {
    
  }

  public Flight(UUID id, String flightName, String airline, String departure,
      String destination, Time departureTime, Time arrivalTime, FlightType flightType) {
    this.id = id;
    this.flightName = flightName;
    this.airline = airline;
    this.departure = departure;
    this.destination = destination;
    this.departureTime = departureTime;
    this.arrivalTime = arrivalTime;
    this.flightType = flightType;
  }

  public UUID getUUID() {
    return this.id;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public String getDestination() {
    return this.destination;
  }

  public void setDeparture(String departure) {
    this.departure = departure;
  }

  public String getDeparture() {
    return this.departure;
  }

  public void setDepartureTime(Time time) {
    this.departureTime = time;
  }

  public Time getDepartureTime() {
    return this.departureTime;
  }

  public void setArrivalTime(Time arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public Time getArrivalTime() {
    return this.arrivalTime;
  }

  public void setFlightType(FlightType flightType) {
    this.flightType = flightType;
  }

  public FlightType getFlightType() {
    return this.flightType;
  }

  public void setFlightName(String flightName) {
    this.flightName = flightName;
  }

  public String getFlightName() {
    return this.flightName;
  }

  public void setAirline(String airline) {
    this.airline = airline;
  }

  public String getAirline() {
    return this.airline;
  }
}
