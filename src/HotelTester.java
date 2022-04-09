import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.UUID;

public class HotelTester {

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
  public void testArrayListNotNull_DefConstruct() {
    Hotel testHotel = new Hotel();
    assertNotNull(testHotel.getRooms(), "rooms should be initialized");
  }

  @Test
  public void testArrayListNotNull_ParamConstruct() {
    Hotel testHotel = new Hotel(UUID.randomUUID(), "Test Hotel", "CAE - Columbia", 128, 5, true, new ArrayList<Room>());
    assertNotNull(testHotel.getRooms(), "rooms should be initialized");
  }

  @Test
  public void testGetRoomByNum() {
    Hotel testHotel = new Hotel();
    ArrayList<Room> testRooms = new ArrayList<Room>();
    Room testRoom = new Room();
    testRoom.setRoomNumber(101);
    testRooms.add(testRoom);
    Room testRoom2 = new Room();
    testRoom2.setRoomNumber(102);
    testRooms.add(testRoom2);
    Room testRoom3 = new Room();
    testRoom3.setRoomNumber(103);
    testRooms.add(testRoom3);
    testHotel.setRooms(testRooms);
    Room expectedRoom = new Room();
    expectedRoom.setRoomNumber(102);
    assertEquals(expectedRoom.getRoomNumber(), testHotel.getRoomByNum(102).getRoomNumber(), "Room #102 not found");
  }

  @Test
  public void testGetNumOfRooms() {
    Hotel testHotel = new Hotel();
    ArrayList<Room> testRooms = new ArrayList<Room>();
    Room testRoom = new Room();
    testRooms.add(testRoom);
    Room testRoom2 = new Room();
    testRooms.add(testRoom2);
    Room testRoom3 = new Room();
    testRooms.add(testRoom3);
    testHotel.setRooms(testRooms);
    assertEquals(3, testHotel.getNumOfRooms(), "There are 3 rooms");
  }

  @Test
  public void testGetNumOfRooms_Empty() {
    Hotel testHotel = new Hotel();
    assertEquals(0, testHotel.getNumOfRooms(), "There are 0 rooms");
  }

  @Test
  public void testGetRoomByUUID() {
    Hotel testHotel = new Hotel();
    ArrayList<Room> testRooms = new ArrayList<Room>();
    Room testRoom = new Room();
    testRoom.setUUID(UUID.randomUUID());
    testRooms.add(testRoom);
    Room testRoom2 = new Room();
    UUID testUUID = UUID.randomUUID();
    testRoom2.setUUID(testUUID);
    testRooms.add(testRoom2);
    Room testRoom3 = new Room();
    testRoom3.setUUID(UUID.randomUUID());
    testRooms.add(testRoom3);
    testHotel.setRooms(testRooms);
    Room expectedRoom = new Room();
    expectedRoom.setUUID(testUUID);
    assertEquals(expectedRoom.getUUID(), testHotel.getRoomByUUID(testUUID).getUUID(), "Room " + testUUID + " not found");
  }

  @Test
  public void testGetRoomUUIDs() {
    Hotel testHotel = new Hotel();
    ArrayList<Room> testRooms = new ArrayList<Room>();
    Room testRoom = new Room();
    UUID testUUID = UUID.randomUUID();
    testRoom.setUUID(testUUID);
    testRooms.add(testRoom);
    Room testRoom2 = new Room();
    UUID testUUID2 = UUID.randomUUID();
    testRoom2.setUUID(testUUID2);
    testRooms.add(testRoom2);
    Room testRoom3 = new Room();
    UUID testUUID3 = UUID.randomUUID();
    testRoom3.setUUID(testUUID3);
    testRooms.add(testRoom3);
    testHotel.setRooms(testRooms);
    ArrayList<UUID> testUUIDs = new ArrayList<UUID>();
    testUUIDs.add(testUUID);
    testUUIDs.add(testUUID2);
    testUUIDs.add(testUUID3);
    assertEquals(testUUIDs, testHotel.getRoomUUIDs(), "UUIDs are incomplete/in excess");
  }
}