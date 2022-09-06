import java.util.*;
import java.lang.String;

public class McDonalds {

  private String restaurantName;
  private int treasury;
  private String city;

  //WRITE YOUR CONSTRUCTORS BELOW

  public McDonalds() {
    restaurantName = "McDonalds";
    treasury = 10000;
    city = "Toronto";
  }

  public McDonalds(String restaurantNameArg, int treasuryArg, String cityArg) {

    if (restaurantNameArg.equals("BurgerKing")) {
      restaurantName = "BarnacleKing";
    }
    else {
      restaurantName = restaurantNameArg;
    }

    if (treasury < 0) {
      treasury = 0;
    }
    else {
      treasury = treasuryArg;
    }

    city = cityArg;

  }

  //DON'T CHANGE THIS CODE

  public void printInfo() {
    System.out.println(restaurantName);
    System.out.println(treasury);
    System.out.println(city);
  }

}
