import java.sql.Time;
import java.util.ArrayList;

public class Flight extends Booking {
  private String departure;
  private Time departureTime;
  private String destination;
  private FlightType flightType;
  private int travelTime;
  private ArrayList<Flight> flights; 

  Flight() {
    
  }

  Flight(String departure, String destination, FlightType flightType, int travelTime) {
    this.departure = departure;
    this.departureTime = departureTime;
    this.destination = destination;
    this.flightType = flightType;
    this.travelTime = travelTime;
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

  public void setTravelTime(int travelTime) {
    this.travelTime = travelTime;
  }

  public int getTravelTime() {
    return this.travelTime;
  }

  public void setFlightType(FlightType flightType) {
    this.flightType = flightType;
  }

  public FlightType getFlightType() {
    return this.flightType;
  }
}
