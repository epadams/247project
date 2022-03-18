package src;

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
    private ArrayList<Passport> passports;
    private boolean frequentFLyer;
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
    }

    public User(UUID id, String username, String password, String email, int age, String address, Passport passport) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
        this.address = address;
        this.addPassport(passport);
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

    private String getUsername() {
        return this.username;
    }

    private String getPassword() {
        return this.password;
    }

    private String getEmail() {
        return this.email;
    }

    public String getFirstName () {
        return this.firstName;
    }

    public String getLastName () {
        return this.lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    private ArrayList<Passport> getPassports() {
        return this.passports;
    }

    public void BookFlight() {

    }

    // TODO Change to string or some kind of return, this should not print anything here
    public void ViewFlights() {

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
}
