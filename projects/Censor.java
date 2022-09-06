import java.lang.String;
import java.lang.Character;
import java.lang.Object;

public class Censor {

  private String badWord;
  private String goodWord;

  public Censor() {
    badWord = "tyrant";
    goodWord = "saint";
  }

  public String censorBadWord(String sentence) {

    String replaceWord = "";

    if (sentence.contains(badWord)) {

      for (int i = 0; i < badWord.length(); i++) {
        replaceWord += "*"; // Create a censored word at the badWord length
      }

      sentence = sentence.replaceAll(badWord, replaceWord);

    }

    return sentence;

  }

  public String replaceBadWords(String sentence) {

    if (sentence.contains(badWord)) {
      sentence = sentence.replaceAll(badWord, goodWord);
    }

    return sentence;

  }

  public void setBadWord(String word) {

    char[] charArr = word.toCharArray(); // make word a character array

    for (char c : charArr) { // go through charArr
      if (!Character.isLetter(c)) { // check if characters are alpha
        System.out.println("In setBodWord(String word) method, word is not all alpha characters.");
        return; // exit method
      }
    }

    badWord = word;

  }

  public void setGoodWord(String word) {

    char[] charArr = word.toCharArray(); // make word a character array

    for (char c : charArr) { // go through charArr
      if (!Character.isLetter(c)) { // check if characters are alpha
        System.out.println("In setGoodWord(String word) method, word is not all alpha characters.");
        return; // exit method
      }
    }

    goodWord = word;

  }

}
