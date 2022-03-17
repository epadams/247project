package src;

public class Taxi extends Booking {
  private int travelDistance;

  public Taxi() {

  }

  public Taxi(int travelDistance) {
    this.travelDistance = travelDistance;
  }

  public int getTravelDistance() {
    return this.travelDistance;
  }

  public void setTravelDistance(int travelDistance) {
    this.travelDistance = travelDistance;
  }
}
