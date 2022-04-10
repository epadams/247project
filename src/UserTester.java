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
  public void testUser_DEFConstructor() {
    UUID uuid = UUID.randomUUID();
    User testUser = new User(uuid, "test user", "test pass", "test email", "test first", "test last", 1, "test addy",
        false);
    assertNotNull(testUser.getId(), "UUID should not be null if user is created");

  }
}