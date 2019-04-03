public class PrintingLikeBoss {
  public static void main(String[] args) {
    printTriangle(4);
    xmasTree(4);
    xmasTree(10);
  }

  public static void printWhitespaces(int size) {
    int counter = 0;

    while (counter < size) {
      System.out.print(" ");
      counter++;
    }
  }

  public static void printStars(int size) {
    int counter = 1;

    while (counter <= size) {
      if (counter == size) {
        System.out.print("*\n");
      } else {
        System.out.print("*");
      }

      counter++;
    }
  }

  public static void printTriangle(int size) {
    int counter = 1;

    while (counter <= size) {
      printWhitespaces(size - counter);
      printStars(counter);
      counter++;
    }
  }

  public static void xmasTree(int height) {
    int counter = 1;

    while (counter <= height) {
      printWhitespaces(height - counter);

      int extraStars = counter - 1;
      printStars(counter + extraStars);

      if (counter == height) {
        int baseLength = counter + (counter - 1);
        int baseCounter = 0;

        while (baseCounter < 2) {
          printWhitespaces(baseLength - (height + 1));
          printStars(3);
          baseCounter++;
        }
      }

      counter++;
    }
  }
}