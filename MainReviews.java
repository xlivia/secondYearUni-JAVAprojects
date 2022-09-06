import java.util.Scanner;
import java.lang.String;

public class MainReviews {

  public static void main(String[] args) {

    String modReviews = "";
    String userInput = "";

    Scanner scan = new Scanner(System.in); // Create Scanner object

    Censor mcDonalds = new Censor(); // Create object
    Censor burgerKing = new Censor(); // Create object
    Censor allReviews = new Censor(); // Create object

    mcDonalds.setBadWord("disgusting"); // Use Censor methods
    mcDonalds.setGoodWord("delicious"); // Use Censor methods

    burgerKing.setBadWord("delicious"); // Use Censor methods
    burgerKing.setGoodWord("disgusting"); // Use Censor methods

    allReviews.setBadWord("barnacle"); // Use Censor methods

    System.out.println("Write a review:");
    System.out.println("(Type 'McD:' for a McDonalds review.)");
    System.out.println("Type 'BK:' for a BurgerKing review.)");
    System.out.println("(Type 'END' when done.)");
    userInput = scan.nextLine(); // Take user input

    while (!userInput.equals("END")) {

      if (userInput.contains("McD:")) { // Check if review is for McDonalds

        userInput = mcDonalds.replaceBadWords(userInput); // Use Censor methods

      }
      else if (userInput.contains("BK:")) { // Check if review is for BurgerKing

        userInput = burgerKing.replaceBadWords(userInput); // Use Censor methods

      }
      else {

        userInput = allReviews.censorBadWord(userInput); // Use Censor methods

      }

      modReviews += userInput + "\n"; // Append the new and old reviews in a string

      System.out.println("\nModified String:\n" + modReviews);

      System.out.println("Write a review:");
      System.out.println("(Type 'McD:' for a McDonalds review.)");
      System.out.println("Type 'BK:' for a BurgerKing review.)");
      System.out.println("(Type 'END' when done.)");
      userInput = scan.nextLine(); // Take user input

    }

  }

}
