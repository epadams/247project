import java.util.ArrayList;

public class RegisteredUser { //need to extend User
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private ArrayList<Passport> passports;
    private boolean frequentFLyer;
    private ArrayList<Flight> flightHistory;
    private ArrayList<String> refunds;

    public RegisteredUser() {

    }

    public RegisteredUser(String username, String password, String email, int age) {

    }

    public RegisteredUser(String username, String password, String email, int age, String address, Passport passport) {

    }

    public void setUsername(String username) {

    }

    public void setPassword(String password) {

    }

    public void setEmail(String email) {

    }

    public void setFirstName(String firstName) {

    }

    public void setLastName(String lastName) {

    }

    public void setAge(int age) {

    }

    public void setAddress(String address) {

    }

    public void addPassport(Passport passport) {

    }

    private String getUsername() {

    }

    private String getPassword() {

    }

    private String getEmail() {

    }

    public int getAge() {

    }

    public String getAddress() {

    }

    private ArrayList<Passport> getPassports() {

    }

    public void BookFlight() {

    }

    public void ViewFlights() {

    }

    public void takePreferenceSurvey() {

    }

    public String printFlightHistory() {

    }

    public String printRefunds() {

    }

    public String printFlightTicket() {

    }

    public void logout() {

    }

    public void deleteAccount() {
        
    }
}