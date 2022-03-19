import java.util.Date;

public class Passport {
    private String firstName;
    private String lastName;
    private int passportNum;
    private Date dateOfBirth;
    private String placeOfBirth;
    private Date issueDate;
    private Date expirationDate;
    private char sex;

    public Passport() {

    }

    public Passport(String firstName, String lastName, int passportNum, Date dateOfBirth, String placeOfBirth, Date issueDate, Date expirationDate, char sex) {

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassportNum(int passportNum) {
        this.passportNum = passportNum;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateOfBirth = dateofBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public int getPassportNum() {
        return passportNum;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public char getSex() {
        return sex;
    }

    public String toString() {
        return "";
    }

}
