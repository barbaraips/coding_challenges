import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operations {

  private static List<String> weekdays = Arrays.asList("mon", "tues", "wed", "thur", "fri");

  public static boolean isWeekday(String entry) {
    return weekdays.contains(entry);
  }

  public static List<String> getPossibleDays(String entry) {
    Pattern p = Pattern.compile("\\((\\w*)\\)");
    Matcher m = p.matcher(entry);
    ArrayList<String> listOfDays = new ArrayList<>();

    while (m.find()) {
      if (isWeekday(m.group(1)))
        listOfDays.add("week");
      else
        listOfDays.add("weekend");
    }
    return listOfDays;
  }

  public static String getClientType(String entry) {
    return entry.split(":")[0];
  }

  public static String findCheapestHotel(String entry, List<Hotel> hotelsList) {
    String clientType = getClientType(entry);
    Map<Hotel, Integer> listOfProbableHotels = new HashMap<>();
    ArrayList<Map.Entry<Hotel, Integer>> finalHotelList = new ArrayList<>();

    //For each type of day (weekday or weekend), find best price of each hotel
    for (String day : getPossibleDays(entry)) {
      for (Hotel hotel : hotelsList) {
        listOfProbableHotels.put(hotel, hotel.getPriceBasedOnDayAndClientType(clientType, day));
      }
      finalHotelList.add(getBestHotelByPrice(listOfProbableHotels));
    }

    sortHotelList(finalHotelList);

    return finalHotelList.get(0).getKey().getName();

  }

  private static void sortHotelList(ArrayList<Map.Entry<Hotel, Integer>> finalHotelList) {
    finalHotelList.sort((hotel1, hotel2) -> {
      int priceCompare = hotel1.getValue().compareTo(hotel2.getValue());
      if (priceCompare != 0) {
        return priceCompare;
      } else {
        return Integer.compare(hotel1.getKey().getClassification(), hotel2.getKey().getClassification());
      }
    });
  }

  private static Map.Entry<Hotel, Integer> getBestHotelByPrice(Map<Hotel, Integer> listOfProbableHotels) {
    Map.Entry<Hotel, Integer> minimumPrice = null;
    for (Map.Entry<Hotel, Integer> currentPrice : listOfProbableHotels.entrySet()) {
      if (minimumPrice == null || minimumPrice.getValue() > currentPrice.getValue()) {
        minimumPrice = currentPrice;
      }
    }
    return minimumPrice;
  }
}
