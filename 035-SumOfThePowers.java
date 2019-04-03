import java.util.Scanner;

public class SumOfThePowers {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Type a number: ");
    int upTo = Integer.parseInt(reader.nextLine());

    int power = 0;
    int result = 0;

    while (power <= upTo) {
      result = result + (int) Math.pow(2, power);
      power++;
    }

    System.out.println("The result is " + result);

    reader.close();
  }
}