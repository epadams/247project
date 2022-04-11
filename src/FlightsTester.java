import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

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
}