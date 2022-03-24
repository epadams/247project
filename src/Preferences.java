import java.util.UUID;
public class Preferences {
    private boolean medAccom;
    private String originAirportCode;
    private UUID id;
    private String seatType;
    private int NumOfBaggage;
    private String airline;
    private String flightType;

    public Preferences() {
        //TODO
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
