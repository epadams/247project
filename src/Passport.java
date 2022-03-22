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

    public Passport(String firstName, String lastName, int passportNum, Date dateOfBirth, String placeOfBirth,
            Date issueDate, Date expirationDate, char sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNum = passportNum;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.issueDate = issueDate;
        this.expirationDate = expirationDate;
        this.sex = sex;
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
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getPassportNum() {
        return this.passportNum;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    public Date getIssueDate() {
        return this.issueDate;
    }

    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public char getSex() {
        return this.sex;
    }

    public String toString() {
        return "First Name: " + this.firstName + "\nLast Name: " + this.lastName + "\nPassport Number: "
                + this.passportNum + "\nDate of Birth: " + this.dateOfBirth.toString() + "\nPlace of Birth: "
                + this.placeOfBirth + "\nIssue Date: " + this.issueDate.toString() + "\nExpiration Date: "
                + this.expirationDate.toString() + "\nSex: " + this.sex;
    }
}
