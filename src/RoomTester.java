import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

public class RoomTester {

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
  public void testRoomUUID()
  {
    Room testRoom = new Room();
    testRoom.setUUID(UUID.randomUUID());
    assertNotNull(testRoom.getUUID(), "constructors for UUID working");
  }

  public void testRoomNumber() {
    Room testRoom = new Room();
    testRoom.setRoomNumber(0);
    assertEquals(0,testRoom.getRoomNumber(), "constructors for Room Number working");
  }

  public void testNumOfBeds() {
    Room testRoom = new Room();
    testRoom.setNumOfBeds(3);
    assertEquals(3,testRoom.getNumOfBeds(), "Constructors for Number of beds working");
  }

  public void testSmoking()
  {
    Room testRoom = new Room();
    testRoom.setSmoking(true);
    assertEquals(true,testRoom.getSmoking(), "Smoking constructor working");
  }

 public void testArrayListNotNull_DefConstruct()
 {
   Room testRoom = new Room();
   assertNotNull(testRoom.getBookedDates(),"Booked dates is initialized");
 }
}