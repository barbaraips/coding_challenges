import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class OperationsTest {

  private static List<Hotel> hotelList;

  @Test
  public void testIsWeekday() {
    assertTrue(Operations.isWeekday("mon"));
    assertFalse(Operations.isWeekday("sat"));
  }

  @Test
  public void getListOfPossibleReservationDays() {
    String entry = "Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)";
    List<String> listOfDays = Arrays.asList("week", "weekend", "weekend");
    assertEquals(listOfDays, Operations.getPossibleDays(entry));
  }

  @Test
  public void getClientType() {
    String entry = "Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)";
    assertEquals("Regular", Operations.getClientType(entry));
  }

  @Before
  public void createHotels() {

    List<Price> pricesLakew = Arrays.asList(
        new Price("Regular", "week", 110),
        new Price("Reward", "week", 80),
        new Price("Regular", "weekend", 90),
        new Price("Reward", "weekend", 80));
    Hotel lakewoodHotel = new Hotel("Lakewood", 3, pricesLakew);

    List<Price> pricesBridgewood = Arrays.asList(
        new Price("Regular", "week", 160),
        new Price("Reward", "week", 110),
        new Price("Regular", "weekend", 60),
        new Price("Reward", "weekend", 50));
    Hotel bridgewoodHotel = new Hotel("Bridgewood", 4, pricesBridgewood);

    List<Price> pricesRidgewood = Arrays.asList(
        new Price("Regular", "week", 220),
        new Price("Reward", "week", 100),
        new Price("Regular", "weekend", 150),
        new Price("Reward", "weekend", 40));
    Hotel ridgewoodHotel = new Hotel("Ridgewood", 5, pricesRidgewood);

    hotelList = Arrays.asList(lakewoodHotel, bridgewoodHotel, ridgewoodHotel);
  }

  @Test
  public void testFindCheapestHotel() {
    String entry1 = "Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)";
    String entry2 = "Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)";
    String entry3 = "Reward: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)";

    assertEquals("Lakewood", Operations.findCheapestHotel(entry1, hotelList));
    assertEquals("Bridgewood", Operations.findCheapestHotel(entry2, hotelList));
    assertEquals("Ridgewood", Operations.findCheapestHotel(entry3, hotelList));

  }

}
