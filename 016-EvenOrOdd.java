import java.util.Scanner;

public class EvenOrOdd {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Type a number: ");
    int x = Integer.parseInt(reader.nextLine());

    if (x % 2 == 0) {
      System.out.println("Number " + x + " is even.");
    } else {
      System.out.println("Number " + x + " is odd.");
    }

    reader.close();
  }
}