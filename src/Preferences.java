import java.util.UUID;
public class Preferences {
    private boolean medAccom;
    private String originAirportCode;
    private UUID id;
    private String seatType;
    private int numOfBaggage;
    private String airline;
    private String flightType;

    public Preferences() {
        //TODO
    }

    public Preferences(UUID id, boolean medAccom, String originAirportCode, String seatType, int numBaggage, String airline, String flightType) {
        this.id = id;
        this.medAccom = medAccom;
        this.originAirportCode = originAirportCode;
        this.seatType = seatType;
        this.numOfBaggage = numBaggage;
        this.airline = airline;
        this.flightType = flightType;

    }
    
    public void setMedicalAccomodation() {
        this.medAccom = medAccom;
    }

    public void setAirportOrigin() {
        this.originAirportCode = originAirportCode;
    }

    public boolean getMedicalAccomodation() {
        return medAccom;
    }

    public String getAirportOrigin() {
        return originAirportCode;
    }
}
