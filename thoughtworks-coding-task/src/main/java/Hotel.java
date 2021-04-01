import java.util.List;

public class Hotel {
  String name;
  int classification;
  List<Price> prices;

  public Hotel(String name, int classification, List<Price> prices) {
    this.name = name;
    this.classification = classification;
    this.prices = prices;
  }

  public int getClassification() {
    return classification;
  }

  int getPriceBasedOnDayAndClientType(String clientType, String dayType) {
    for (Price price : prices) {
      if (price.clientType.equals(clientType) && price.weekdayType.equals(dayType))
        return price.price;
    }
    return 0;
  }

  public String getName() {
    return name;
  }
}
