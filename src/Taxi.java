import java.util.UUID;

public class Taxi extends Booking {
  private UUID id;
  private String serviceName;
  private double basePrice;
  private double costPerMile;

  public Taxi() {

  }

  public Taxi(UUID id, String serviceName, double basePrice, double costPerMile) {
    this.id = id;
    this.serviceName = serviceName;
    this.basePrice = basePrice;
    this.costPerMile = costPerMile;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public void setBasePrice(double basePrice) {
    this.basePrice = basePrice;
  }

  public void setCostPerMile(double costPerMile) {
    this.costPerMile = costPerMile;
  }

  public UUID getUUID() {
    return this.id;
  }

  public String getServiceName() {
    return this.serviceName;
  }

  public double getBasePrice() {
    return this.basePrice;
  }

  public double getCostPerMile() {
    return this.costPerMile;
  }

/*  MIGHT NEED
/*  public int getTravelDistance() {
/*  }
/*
/*  public void setTravelDistance(int travelDistance) {
/*  }
 */

}
