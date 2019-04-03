import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Type a number: ");
    int toFactorial = Integer.parseInt(reader.nextLine());
    int counter = 1;
    int result = 1;

    while (counter <= toFactorial) {
      result *= counter;
      counter++;
    }

    System.out.println("Factorial is " + result);

    reader.close();
  }
}