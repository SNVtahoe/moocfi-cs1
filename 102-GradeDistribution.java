import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    doSomething(scanner);
  }

  public static void doSomething(Scanner scanner) {
    ArrayList<Integer> scores = new ArrayList<Integer>();

    System.out.println("Type exam scores, -1 completes");
    while (true) {
      int score = Integer.parseInt(scanner.nextLine());

      if (score == -1) {
        break;
      }

      if (score >= 0 && score < 61) {
        scores.add(score);
      }
    }

    printScores(scores);
  }

  public static void printScores(ArrayList<Integer> scores) {
    String[] stars = { "", "", "", "", "", "" };
    double validScore = 0;
    int scoresInput = scores.size();

    for (int score : scores) {
      if (score > 0 && score < 30) {
        stars[0] += "*";
      } else if (score < 35) {
        stars[1] += "*";
        validScore += 1.0;
      } else if (score < 40) {
        stars[2] += "*";
        validScore += 1.0;
      } else if (score < 45) {
        stars[3] += "*";
        validScore += 1.0;
      } else if (score < 50) {
        stars[4] += "*";
        validScore += 1.0;
      } else {
        stars[5] += "*";
        validScore += 1.0;
      }
    }

    System.out.println("Grade distribution:");

    for (int i = stars.length - 1; i >= 0; i--) {
      System.out.println(i + ": " + stars[i]);
    }

    System.out.println("Acceptance percentage: " + ((validScore / scoresInput) * 100));
  }
}