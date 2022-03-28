import java.util.ArrayList;
import java.util.UUID;

public class Preferences {
  private boolean medAccom;
  private String originAirportCode;
  private UUID id;
  private String seatType;
  private int numOfBaggage;
  private String airline;
  private String flightType;

  private static Preferences preference;
  private ArrayList<Preferences> preferences;


  public Preferences() {
    //TODO fix reading preferences
    preferences = JReader.getPreferences();
  }

  public Preferences(UUID id, boolean medAccom, String originAirportCode,
      String seatType, int numBaggage, String airline, String flightType) {
    this.id = id;
    this.medAccom = medAccom;
    this.originAirportCode = originAirportCode;
    this.seatType = seatType;
    this.numOfBaggage = numBaggage;
    this.airline = airline;
    this.flightType = flightType;
  }

  public static Preferences getInstance() {
    if (preference == null) {
      preference = new Preferences();
    }
    return preference;
  }
  
  public void setId(UUID id) {
    this.id = id;
  }

  public void setMedicalAccomodation(boolean medAccom) {
    this.medAccom = medAccom;
  }

  public void setAirportOrigin(String originAirportCode) {
    this.originAirportCode = originAirportCode;
  }

  public void setSeatType(String seatType) {
    this.seatType = seatType;
  }

  public void setNumBaggage(int numOfBaggage) {
    this.numOfBaggage = numOfBaggage;
  }

  public void setAirline(String airline) {
    this.airline = airline;
  }

  public void setFlightType(String flightType) {
    this.flightType = flightType;
  }

  public UUID getId() {
    return this.id;
  }

  public boolean getMedicalAccomodation() {
    return medAccom;
  }

  public String getAirportOrigin() {
    return originAirportCode;
  }

  public String getSeatType() {
    return seatType;
  }

  public int getNumBaggage() {
    return numOfBaggage;
  }

  public String getAirline() {
    return airline;
  }

  public String getFlightType() {
    return flightType;
  }
}
