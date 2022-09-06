import java.util.Scanner;
import java.lang.String;

public class Censorship {

  public static void main(String[] args) {

    int numCensored = 0;
    String[] messages = { "you are such a BARNACLE!",
                          "i'm allergic to darnacles",
                          "hello world!",
                          "bArnacleS are growing between my toes",
                          "q29038102938098)(*)(!!!!!!"
                        };

    for (int lc = 0; lc < 5; lc++) {
      messages[lc] = messages[lc].toLowerCase(); // Make the string lowercase
    }

    for (int i = 0; i < 5; i++) { // Iterate through messages string

      if (messages[i].contains("barnacle")) {

        for (int j = 0; j < messages[i].length(); j++) { // Iterate through the message

          messages[i] = messages[i].substring(0, j) + '*' + messages[i].substring(j + 1); // censor the message

        }

        numCensored++; // Count censored messages

      }

    }

    System.out.println(""); // Print New Line
    System.out.println("Number of Censored Messages = " + numCensored);
    System.out.println(""); // Print New Line

    for (int p = 0; p < 5; p++) {
      System.out.println(messages[p]); // Print Messages
      System.out.println(""); // Print New Line
    }

  }

}
