import java.util.ArrayList;
import java.util.UUID;

public class User {
    private UUID id;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private boolean frequentFlyer;
    private ArrayList<Passport> passports;
    private ArrayList<Flight> flightHistory;
    private ArrayList<String> refunds;

    public User () {
        
    }

    public User(UUID id, String username, String password, String email, int age) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
        this.firstName = "";
        this.lastName = "";
        this.address = "";
        this.frequentFlyer = false;
        this.passports = new ArrayList<Passport>();
    }

    public User(UUID id, String username, String password, String email, String firstName,
        String lastName, int age, String address, boolean frequentFlyer) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.frequentFlyer = frequentFlyer;
        this.passports = new ArrayList<Passport>();
    }

    
    public User(UUID id, String username, String password, String email, String firstName,
        String lastName, int age, String address, boolean frequentFlyer,
        Passport passport) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.frequentFlyer = frequentFlyer;
        this.passports = new ArrayList<Passport>();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // TODO check if a passport currently exists to avoid duplication
    public void addPassport(Passport passport) {
        this.passports.add(passport);
    }

    public String getUserName() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    public String getFirstName () {
        return this.firstName;
    }

    public String getLastName () {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    public ArrayList<Passport> getPassports() {
        return this.passports;
    }

    public boolean getFreqFlyerStatus() {
      return this.frequentFlyer;
    }

    public void bookFlight() {

    }

    // TODO Change to string or some kind of return, this should not print anything here
    public void viewFlights() {

    }

    public void takePreferenceSurvey() {

    }

    public ArrayList<Flight> printFlightHistory() {
        return this.flightHistory;
    }

    public ArrayList<String> getRefunds() {
        return this.refunds;
    }

    public String printFlightTicket() {
        return "";
    }

    public void logout() {

    }

    public void deleteAccount() {

    }

    // DEBUGGING ONLY
    public String toString() {
      return "ID: " + this.id + "\nUsername: " + this.username + "\nPassword: "
          + this.password + "\nFirst Name: " + this.firstName + "\nLast Name: "
          + this.lastName + "\nAge: " + this.age + "\nAddress: "
          + this.address + "\nFrequent Flyer: " + this.frequentFlyer;
    }

    public UUID getId() {
      return this.id;
    }
}
