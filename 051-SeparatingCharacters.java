import java.util.Scanner;

public class SeparatingCharacters {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Type your name: ");
    String name = reader.nextLine();

    int counter = 0;
    int nameLength = name.length();

    while (counter < nameLength) {
      System.out.println((counter + 1) + ". character: " + name.charAt(counter));
      counter++;
    }

    reader.close();
  }
}