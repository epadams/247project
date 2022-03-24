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
        return id;
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
