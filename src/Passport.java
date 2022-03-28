// import java.util.Date;
import java.util.UUID;

public class Passport {
  private UUID id;
  private String firstName;
  private String lastName;
  private int passportNum;
  private String dateOfBirth;
  private String placeOfBirth;
  private String issueDate;
  private String expirationDate;
  private char sex;

  public Passport() {

  }

  public Passport(UUID id, String firstName, String lastName, int passportNum,
      String dateOfBirth, String placeOfBirth, String issueDate,
      String expirationDate, char sex) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.passportNum = passportNum;
    this.dateOfBirth = dateOfBirth;
    this.placeOfBirth = placeOfBirth;
    this.issueDate = issueDate;
    this.expirationDate = expirationDate;
    this.sex = sex;
  }

  public UUID getUUID() {
    return this.id;
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

  public void setDateofBirth(String dateofBirth) {
    this.dateOfBirth = dateofBirth;
  }

  public void setPlaceOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }

  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }

  public void setExpirationDate(String expirationDate) {
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

  public String getDateOfBirth() {
    return this.dateOfBirth;
  }

  public String getPlaceOfBirth() {
    return this.placeOfBirth;
  }

  public String getIssueDate() {
    return this.issueDate;
  }

  public String getExpirationDate() {
    return this.expirationDate;
  }

  public char getSex() {
    return this.sex;
  }

  public String toString() {
    return "First Name: " + this.firstName + "\nLast Name: " + this.lastName
      + "\nPassport Number: " + this.passportNum + "\nDate of Birth: "
      + this.dateOfBirth.toString() + "\nPlace of Birth: " + this.placeOfBirth
      + "\nIssue Date: " + this.issueDate.toString() + "\nExpiration Date: "
      + this.expirationDate.toString() + "\nSex: " + this.sex;
  }
}
