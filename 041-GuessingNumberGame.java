import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int toGuess = drawNumber();
    int guesses = 0;

    while (true) {
      System.out.print("Guess a number: ");
      int guess = Integer.parseInt(reader.nextLine());
      guesses++;

      if (guess == toGuess) {
        System.out.println("Congratulations, your guess is correct!");
        break;
      } else if (guess < toGuess) {
        System.out.println("The number is greater, guesses made: " + guesses);
      } else {
        System.out.println("The number is lesser, guesses made: " + guesses);
      }
    }

    reader.close();
  }

  private static int drawNumber() {
    return new Random().nextInt(101);
  }
}