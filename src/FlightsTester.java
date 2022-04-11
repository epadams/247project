import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

public class FlightsTester {

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
  public void testHaveFlight_True() {
    Flights testFlights = Flights.getInstance();
    assertTrue(testFlights.haveFlight("CAE to ATL"), "CAE to ATL is a valid Flight");
  }

  @Test
  public void testHaveFlight_False() {
    Flights testFlights = Flights.getInstance();
    assertFalse(testFlights.haveFlight("ATL to CAE"), "ATL to CAE is not a valid flight");
  }

  @Test
  public void testArrayListNotNull() {
    Flights testFlights = Flights.getInstance();
    assertNotNull(testFlights.getFlights(), "flightlist should be initialized");
  }

  @Test
  public void testAddFlight() {
    Flights testFlights = Flights.getInstance();
    testFlights.addFlight("Test: CAE to ATL");
    assertTrue(testFlights.haveFlight("Test: CAE to ATL"), "Test flight no found");
  }

  @Test
  public void testSearchFlights() {

  }

  @Test 
  public void testSearchDestination(){

  }

  @Test
  public void testSearchFlightID() {
    Flights testFlights = Flights.getInstance();
    UUID expectedUUID = UUID.fromString("66bf9c12-4557-41e6-a243-58105abecb5f");
    assertEquals(expectedUUID, testFlights.searchFlightID(expectedUUID).getUUID(), "CAE to ATL flight not found");
  }

  @Test
  public void testSearchAirline() {

  }

  @Test
  public void testSearchSeats() {
    Flights testFlights = Flights.getInstance();
    Seat expectedSeat = new Seat();
    UUID testUUID = UUID.randomUUID();
    //expectedSeat.setUUID(testUUID);
    assertEquals(expectedSeat.getUUID(), testFlights.searchSeatsByUUID(testUUID).getUUID(), "Seat: "+testUUID+" not found");
  }

}