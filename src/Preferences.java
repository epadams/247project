

public class Preferences {
    private boolean medAccom;
    private String originAirportCode;

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