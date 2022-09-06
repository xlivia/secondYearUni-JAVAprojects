import java.util.Scanner;
import java.lang.String;
import java.lang.Object;

public class CavemanMain {

  public static void main(String[] args) {

    Caveman playerOne = new Caveman("The Beast", 10.0);
    Caveman playerTwo = new Caveman("The Boulder", 20.0);

    playerOne.smack(playerTwo);
    playerTwo.smack(playerOne);
    playerTwo.smack(playerOne);
    playerTwo.smack(playerOne);
    playerOne.smack(playerTwo);
    playerOne.smack(playerTwo);
    playerTwo.smack(playerOne);
    playerTwo.smack(playerOne);
    playerTwo.smack(playerOne);
    playerOne.smack(playerTwo);
    playerOne.smack(playerTwo);

    System.out.println("Player 1: " + playerOne.getName());
    System.out.println("Player 1: " + playerOne.getHealth());

    System.out.println("Player 2: " + playerTwo.getName());
    System.out.println("Player 2: " + playerTwo.getHealth());

  }

}
