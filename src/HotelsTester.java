import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.UUID;

public class HotelsTester {

  @BeforeClass
  public static void oneTimeSetup() {
    Hotels.getInstance();
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
  public void testHaveHotel_True() {
    Hotels testHotels = Hotels.getInstance();
    assertTrue(testHotels.haveHotel("Hyatt Place"), "Hyatt Place is a valid hotel");
  }

  @Test
  public void testHaveHotel_False() {
    Hotels testHotels = Hotels.getInstance();
    assertFalse(testHotels.haveHotel("Place Hyatt"), "Place Hyatt is not a valid hotel");
  }

  @Test
  public void testGetHotel() {
    Hotels testHotels = Hotels.getInstance();
    Hotel expectedHotel = new Hotel();
    expectedHotel.setHotelName("Hyatt Place");
    assertEquals(expectedHotel.getHotelName(), testHotels.getHotel("Hyatt Place").getHotelName(), "Hyatt Place not found");
  }

  @Test
  public void testArrayListNotNull() {
    Hotels testHotels = Hotels.getInstance();
    assertNotNull(testHotels.getHotels(), "hotelList should be initialized");
  }

  @Test
  public void testAddHotel() {
    Hotels testHotels = Hotels.getInstance();
    testHotels.addHotel("Test Hotel", 128, "CAE - Columbia", 5, true);
    assertTrue(testHotels.haveHotel("Test Hotel"), "Test Hotel not found");
  }

  @Test
  public void testSearchHotelID() {
    Hotels testHotels = Hotels.getInstance();
    UUID expectedUUID = UUID.fromString("dc950710-9727-407e-a6e6-1c7b203d9fcc");
    assertEquals(expectedUUID, testHotels.searchHotelID(expectedUUID).getUUID(), "Hyatt Place not found");
  }

  @Test
  public void testSearchRooms() {
    Hotels testHotels = Hotels.getInstance();
    Room expectedRoom = new Room();
    UUID testUUID = UUID.randomUUID();
    expectedRoom.setUUID(testUUID);
    assertEquals(expectedRoom.getUUID(), testHotels.searchRooms(testUUID).getUUID(), "Room " + testUUID + " not found");
  }
}