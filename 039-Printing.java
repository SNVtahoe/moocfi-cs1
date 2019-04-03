import java.util.Scanner;

public class ManyPrints {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("How many?");
    int limit = Integer.parseInt(reader.nextLine());
    int counter = 0;

    while (counter < limit) {
      printText();
      counter++;
    }

    reader.close();
  }

  public static void printText() {
    System.out.println("In the beginning there were the swamp, the hoe and Java.");
  }
}