import java.util.Scanner;

public class LoopsEndingRemembering {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Type numbers:");
    int sum = 0;
    int counter = 0;
    int evenCounter = 0;
    int oddCounter = 0;

    while (true) {
      int value = Integer.parseInt(reader.nextLine());

      if (value == -1) {
        break;
      }

      if (value % 2 == 0) {
        evenCounter++;
      } else {
        oddCounter++;
      }

      counter++;
      sum += value;
    }

    double average = (double) sum / counter;

    System.out.println("Thank you and see you later!");
    System.out.println("The sum is " + sum);
    System.out.println("How many numbers: " + counter);
    System.out.println("Average: " + average);
    System.out.println("Even numbers: " + evenCounter);
    System.out.println("Odd numbers: " + oddCounter);

    reader.close();
  }
}