import java.util.ArrayList;
import java.util.UUID;

/**
 * this class is used to store and access the user's preferences
 * @author Mahi Patel, Ethan Adams, Will Columbia
 */
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

  /**
   * constructs the preferences
   */
  public Preferences() {
    //TODO fix reading preferences
    preferences = JReader.getPreferences();
  }

  /**
   * constructs the preferences based on the info we give it
   * @param id the UUID for the preferences
   * @param medAccom boolean type value, ture if user wants medical accomodations, false if not
   * @param originAirportCode the code for the airport you want to depart form
   * @param seatType the type of seat the user prefers
   * @param numBaggage the number of bags the user wants to bring
   * @param airline the airline brand the user prefers
   * @param flightType the type of flight the user prefers
   */
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

  /**
   * gets and checks that there are preferences
   * @return the instant of preferences
   */
  public static Preferences getInstance() {
    if (preference == null) {
      preference = new Preferences();
    }
    return preference;
  }
  
  /**
   * sets UUID to the value we need
   * @param id the UUID we want to set to the preferences
   */
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   * sets the medical Accommadation to the value we need
   * @param medAccom the true or false value for medical ccomdoation the user wants in preferences
   */
  public void setMedicalAccomodation(boolean medAccom) {
    this.medAccom = medAccom;
  }

  /**
   * sets the ariport code from which the user wants to depart from into preferences
   * @param originAirportCode the code for the sirport the user wants to depart from
   */
  public void setAirportOrigin(String originAirportCode) {
    this.originAirportCode = originAirportCode;
  }

  /**
   * sets the seat type the user prefers into their preferences instance
   * @param seatType the seat type the user prefers
   */
  public void setSeatType(String seatType) {
    this.seatType = seatType;
  }

  /**
   * sets the number of baggages the user wants in their preferences instance
   * @param numOfBaggage the int type value of number of bags user wants
   */
  public void setNumBaggage(int numOfBaggage) {
    this.numOfBaggage = numOfBaggage;
  }

  /**
   * sets the airline band the user prefers into their preferences instance
   * @param airline the airline brand the user prefers
   */
  public void setAirline(String airline) {
    this.airline = airline;
  }

  /**
   * sets the flight type the user prefers to their preferences instance
   * @param flightType the type of flight the user prefers
   */
  public void setFlightType(String flightType) {
    this.flightType = flightType;
  }

  /**
   * gets the UUID for the preferences
   * @return the UUID set to the preferences
   */
  public UUID getId() {
    return this.id;
  }

  /**
   * gets the medical accomodation value currenlty stored in this preferences
   * @return the boolean typ value currently stored in medical accomodation in this preferences. 
   */
  public boolean getMedicalAccomodation() {
    return medAccom;
  }

  /**
   * gets the current airport origin code in the preferences
   * @return the currently stored airport origin code
   */
  public String getAirportOrigin() {
    return originAirportCode;
  }

  /**
   * gets the current seat type value stored in preferences
   * @return the currenlty stored seat type preference
   */
  public String getSeatType() {
    return seatType;
  }

  /**
   * gets the currently store number of bags value stored in preferences
   * @return the currently stored number of bags in preferences
   */
  public int getNumBaggage() {
    return numOfBaggage;
  }

  /**
   * gets the currently stored airline brand value stored in preferences
   * @return the currently stored airline brand in preferences
   */
  public String getAirline() {
    return airline;
  }

  /**
   * gets the currently stored flight type value stored in preferences
   * @return the currently stored flgiht type in preferences
   */
  public String getFlightType() {
    return flightType;
  }
}
