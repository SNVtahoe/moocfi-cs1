import java.util.*;

public class RecurringWord {
  public static void main(String[] args) {
    ArrayList<String> words = new ArrayList<String>();
    Scanner reader = new Scanner(System.in);
    String repeat;

    while (true) {
      System.out.print("Type a word: ");

      String word = reader.nextLine();

      if (words.contains(word)) {
        repeat = word;
        break;
      } else {
        words.add(word);
      }
    }

    System.out.println("You gave the word " + repeat + " twice");

    reader.close();
  }
}