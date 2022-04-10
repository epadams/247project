import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

public class UsersTester {

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
  public void testHaveUser_True() {
    Users testUsers = Users.getInstance();
    assertTrue(testUsers.haveUser("testuser"), "testuser is a valid user in the system.");
  }

  @Test
  public void testHaveUser_True() {
    Users testUsers = Users.getInstance();
    assertFalse(testUsers.haveUser("tesssssstussssser"), "tesssssstussssser is not a valid user in the system.");
  }

  @Test
  public void testGetUser() {
    Users testUsers = Users.getInstance();
    User expectedUser = new User();
    expectedUser.setFirstName("John");
    assertEquals(expectedUser.getFirstName(), testUsers.getUser("testuser").getFirstName(), "test user not found");
  }

  @Test
  public void testArrayListNotNull() {
    Users testUsers = Users.getInstance();
    assertNotNull(testUsers.getUsers(), "User List should be initialized");
  }

  @Test
  public void testAddUser() {
    Users testUsers = Users.getInstance();
    testUsers.addUser("username", "password", "email", 1);
    assertTrue(testUsers.haveUser("username"), "Test User not found");
  }
}