import java.util.Scanner;

public class NamePrinter {

  public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);

    System.out.print("Enter Your Name: ");
    String inputStr = userInput.nextLine();

    System.out.println("Your name is " + inputStr);

  }

}
