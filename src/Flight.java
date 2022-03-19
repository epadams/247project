import java.sql.Time;

public class Flight extends Booking {
  private String departure;
  private Time departureTime;
  private String destination;
  private FlightType flightType;
  private int travelTime;
  private boolean roundTrip;
  private boolean hasLayover;

  Flight() {

  }

  Flight(String departure, String destination, FlightType flightType, int travelTime, boolean roundTrip,
      boolean hasLayover) {

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

  public void setRoundTrip(boolean roundTrip) {
    this.roundTrip = roundTrip;
  }

  public boolean getRoundTrip() {
    return this.roundTrip;
  }

  public void setHasLayover(boolean layover) {
    this.hasLayover = layover;
  }

  public boolean getHasLayover() {
    return this.hasLayover;
  }

}
