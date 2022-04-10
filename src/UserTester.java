import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

public class UserTester {

  @BeforeClass
  public static void oneTimeSetup() {

  }

  @AfterClass
  public static void oneTimeTearDown() {

  }

  @Before
  public void setup() {

  }

  @After
  public void tearDown() {

  }

  @Test
  public void testUserUUID() {
    UUID uuid = UUID.randomUUID();
    User testUser = new User(uuid, "test user", "test pass", "test email", "test first", "test last", 1, "test addy",
        false);
    assertNotNull(testUser.getId(), "UUID should not be null if user is created");
  }

  @Test
  public void testUserUserName() {
    UUID uuid = UUID.randomUUID();
    User testUser = new User(uuid, "test user", "test pass", "test email", "test first", "test last", 1, "test addy",
        false);
    assertNotNull(testUser.getUserName(), "Username should not be null if user is created");
  }

  @Test
  public void testUserAge() {
    UUID uuid = UUID.randomUUID();
    User testUser = new User(uuid, "test user", "test pass", "test email", "test first", "test last", 1, "test addy",
        false);
    assertNotNull(testUser.getAge(), "Age should not be null if user is created");
  }

  @Test
  public void testUser_AddPassport() {
    UUID uuid = UUID.randomUUID();
    User testUser = new User(uuid, "test user", "test pass", "test email", "test first", "test last", 1, "test addy",
        false);
    Passport testPass = new Passport();
    Passport testPass2 = new Passport();
    testUser.addPassport(testPass);
    testUser.addPassport(testPass2);
    assertNotNull(testUser.getPassports(), "Passport(s) Should be added to the User");
  }
}