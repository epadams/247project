import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.UUID;

public class FlightTester {

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
    Flight testFlight = new Flight();
    assertNotNull(testFlight.getSeats(), "seats should be initialized");
  }

  @Test
  public void testArrayListNotNull_ParamConstruct() {
    Flight testFlight = new Flight(UUID.randomUUID(), "CAE to ATL2", "United", "CAE-Columbia", "ATL-Atlanta", "8:00am", "10:00am", "One-Way", new ArrayList<Seat>());
    assertNotNull(testFlight.getSeats(), "seats should be initialized");
  }

  @Test
  public void testGetSeatByUUID() {
    Flight testFlight = new Flight();
    ArrayList<Seat> testSeats = new ArrayList<Seat>();
    Seat testSeat = new Seat();
    testSeat.setUUID(UUID.randomUUID());
    testSeats.add(testSeat);
    Seat testSeat2 = new Seat();
    UUID testUUID = UUID.randomUUID();
    testSeat2.setUUID(testUUID);
    testSeats.add(testSeat2);
    Seat testSeat3 = new Seat();
    testSeat.setUUID(UUID.randomUUID());
    testSeats.add(testSeat3);
    testFlight.setSeats(testSeats);
    Seat expectedSeat = new Seat();
    expectedSeat.setUUID(testUUID);
    assertEquals(expectedSeat.getUUID(), testFlight.getSeatByUUID(testUUID).getUUID(), "Seat: " + testUUID + " not found");
  }

  @Test
  public void testGetSeatUUIDs() {
    Flight testFlight = new Flight();
    ArrayList<Seat> testSeats = new ArrayList<Seat>();
    Seat testSeat = new Seat();
    UUID testUUID = UUID.randomUUID();
    testSeat.setUUID(testUUID);
    testSeats.add(testSeat);
    Seat testSeat2 = new Seat();
    UUID testUUID2 = UUID.randomUUID();
    testSeat2.setUUID(testUUID2);
    testSeats.add(testSeat2);
    Seat testSeat3 = new Seat();
    UUID testUUID3 = UUID.randomUUID();
    testSeat3.setUUID(testUUID3);
    testSeats.add(testSeat3);
    testFlight.setSeats(testSeats);
    ArrayList<UUID> testUUIDs = new ArrayList<UUID>();
    testUUIDs.add(testUUID);
    testUUIDs.add(testUUID2);
    testUUIDs.add(testUUID3);
    assertEquals(testUUIDs, testFlight.getSeatUUIDs(), "UUIDs are incomplete/in excess");
  }
}