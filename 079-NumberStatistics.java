import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    // Stats HAS to be first, otherwise tmc errors on 79.4
    NumberStatistics stats = new NumberStatistics();
    NumberStatistics even = new NumberStatistics();
    NumberStatistics odd = new NumberStatistics();

    System.out.println("Type numbers: ");

    while (true) {
      int input = Integer.parseInt(reader.nextLine());

      if (input == -1) {
        break;
      }

      if (input % 2 == 0) {
        even.addNumber(input);
      } else {
        odd.addNumber(input);
      }

      stats.addNumber(input);
    }

    System.out.println("sum: " + stats.sum());
    System.out.println("sum of even: " + even.sum());
    System.out.println("sum of odd: " + odd.sum());

    reader.close();
  }
}

/*
 * public class NumberStatistics { private int amountOfNumbers; private int sum;
 * 
 * public NumberStatistics() { this.amountOfNumbers = 0; this.sum = 0; }
 * 
 * public void addNumber(int number) { this.amountOfNumbers++; this.sum +=
 * number; }
 * 
 * public int amountOfNumbers() { return this.amountOfNumbers; }
 * 
 * public int sum() { return this.sum; }
 * 
 * public double average() { if (this.amountOfNumbers > 0) { return (double)
 * this.sum / (double) this.amountOfNumbers; } else { return 0.0; } } }
 */