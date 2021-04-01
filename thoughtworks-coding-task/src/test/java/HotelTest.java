import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HotelTest {

  @Test
  public void testCreateHotel() {
    List<Price> prices = Arrays.asList(
        new Price("Regular", "week", 110),
        new Price("Reward", "week", 80),
        new Price("Regular", "weekend", 90),
        new Price("Reward", "weekend", 80));

    Hotel hotel = new Hotel("Lakewood", 3, prices);

    assertThat(hotel.getName(), is("Lakewood"));
    assertThat(hotel.getClassification(), is(3));
  }

}