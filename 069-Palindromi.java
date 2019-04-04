import java.util.Scanner;

public class Palindromi {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Type a text: ");
    String text = reader.nextLine();

    if (palindrome(text)) {
      System.out.println("The text is a palindrome!");
    } else {
      System.out.println("The text is not a palindrome!");
    }

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

  public static boolean palindrome(String text) {
    String mirror = reverse(text);

    return text.equals(mirror);
  }
}