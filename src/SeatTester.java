import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

public class SeatTester {

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
  public void testSeatUUID()
  {
    Seat testSeat = new Seat();
    testSeat.setUUID(UUID.randomUUID());
    assertNotNull(testSeat.getUUID(),"UUID working");
  }

  public void testSeatRow()
  {
    Seat testSeat = new Seat();
    testSeat.setRow(2);
    assertEquals(2,testSeat.getRow(),"Row working");
  }

  public void testSeatAisle()
  {
    Seat testSeat = new Seat();
    testSeat.setAisle('a');
    assertEquals('a', testSeat.getAisle(),"Aisle working");
  }

  public void testSeatVacancy()
  {
    Seat testSeat = new Seat();
    testSeat.setVacancy(true);
    assertEquals(true, testSeat.getVacancy(),"Vacancy working");
  }

  public void testSeatType()
  {
    Seat testSeat = new Seat();
    testSeat.setType(SeatType.BUSINESS);
    assertEquals(SeatType.BUSINESS, testSeat.getType(),"Seat type working");
  }
}