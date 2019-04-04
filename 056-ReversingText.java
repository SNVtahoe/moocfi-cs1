import java.util.Scanner;

public class ReversingText {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Type a text: ");
    String input = reader.nextLine();

    System.out.println(reverse(input));

    reader.close();
  }

  public static String reverse(String text) {
    int counter = 1;
    int textLength = text.length();
    String post = "";

    while (textLength >= counter) {
      post += text.charAt(textLength - counter);
      counter++;
    }

    return post;
  }
}