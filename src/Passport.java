// import java.util.Date;
import java.util.UUID;
/**
 * this class hold data for passport
 */
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

  /**
   * constructs a passport
   */
  public Passport() {

  }

  /**
   * constructs a passport based on the info given
   * @param id The UUID for the passport
   * @param firstName the first name on the passport
   * @param lastName the last name on the passport
   * @param passportNum the passport number
   * @param dateOfBirth the date of birth on the passport
   * @param placeOfBirth the place of birth on the passport
   * @param issueDate the date the passport was issued
   * @param expirationDate the date the passport expires
   * @param sex the sex on the passport
   */
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

  /**
   * gets the passport's UUID
   * @return the passport's UUID
   */
  public UUID getUUID() {
    return this.id;
  }

  /**
   * sets the passport's first name to the value we need
   * @param firstName the first name on the passport
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * sets the passport's last name to the value we need
   * @param lastName the last name on the passport
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * sets teh passport number to the passport
   * @param passportNum the passport number
   */
  public void setPassportNum(int passportNum) {
    this.passportNum = passportNum;
  }

  /**
   * sets the passport user's date of birth to the passport
   * @param dateofBirth the date of brith we want to put on the passport
   */
  public void setDateofBirth(String dateofBirth) {
    this.dateOfBirth = dateofBirth;
  }

  /**
   * sets the passport user's palce of brith to the passport
   * @param placeOfBirth the place of birth we want to put on the passport
   */
  public void setPlaceOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }

  /**
   * sets the passport issue date to the passport
   * @param issueDate the date the passport was issued
   */
  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }

  /**
   * sets the passport expiration date to the passport
   * @param expirationDate the date the passport expires
   */
  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  /**
   * sets the sex of the person on the passport
   * @param sex the sex of the person on the passport
   */
  public void setSex(char sex) {
    this.sex = sex;
  }

  /**
   * gets the first name on the passport
   * @return the first name on the passport
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * gets the last name on the passport
   * @return the last name on the passport
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * gets the passport number on the passport
   * @return the passport number on the passport
   */
  public int getPassportNum() {
    return this.passportNum;
  }

  /**
   * gets the date of birth on the passport
   * @return the date of birth on the passport
   */
  public String getDateOfBirth() {
    return this.dateOfBirth;
  }

  /**
   * gets the place of birth on the passport
   * @return the place of birth on the passport
   */
  public String getPlaceOfBirth() {
    return this.placeOfBirth;
  }

  /**
   * gets the issue date on the passport
   * @return the issue date on the passport
   */
  public String getIssueDate() {
    return this.issueDate;
  }

  /**
   * gets the date the passport expires
   * @return the expiration date of the passport
   */
  public String getExpirationDate() {
    return this.expirationDate;
  }

  /**
   * gets the sex of the person on the passport
   * @return the sex on the passport
   */
  public char getSex() {
    return this.sex;
  }

  /**
   * displays the values and data of the passport in a string type value
   * @return String with all the data of the passport
   */
  public String toString() {
    return "First Name: " + this.firstName + "\nLast Name: " + this.lastName
      + "\nPassport Number: " + this.passportNum + "\nDate of Birth: "
      + this.dateOfBirth.toString() + "\nPlace of Birth: " + this.placeOfBirth
      + "\nIssue Date: " + this.issueDate.toString() + "\nExpiration Date: "
      + this.expirationDate.toString() + "\nSex: " + this.sex;
  }
}
