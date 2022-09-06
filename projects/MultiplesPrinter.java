public class MultiplesPrinter {

  public static void main(String[] args) {

    for (int i = 1; i <= 30; i++) {

      if (i % 3 == 0) {

        if (i % 6 == 0) {
          System.out.println("six");
        }
        else {
          System.out.println("three");
        }

      }
      else if (i % 5 == 0) {

        if (i % 10 == 0) {
          System.out.println("ten");
        }
        else {
          System.out.println("five");
        }

      }
      else {
        System.out.println("none");
      }

    }

  }

}
