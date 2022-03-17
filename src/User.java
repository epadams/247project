package src;

import java.util.ArrayList;

public class User {
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

    public User(String username, String password, String email, int age) {

    }

    public User(String username, String password, String email, int age, String address, Passport passport) {

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

    public void addPassport(Passport passport) {
        //TODO
    }

    private String getUsername() {
        return username;
    }

    private String getPassword() {
        return password;
    }

    private String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    private ArrayList<Passport> getPassports() {
        return passports;
    }

    public void BookFlight() {

    }

    public void ViewFlights() {

    }

    public void takePreferenceSurvey() {

    }

    public String printFlightHistory() {
        return "";
    }

    public String printRefunds() {
        return "";
    }

    public String printFlightTicket() {
        return "";
    }

    public void logout() {

    }

    public void deleteAccount() {

    }
}
