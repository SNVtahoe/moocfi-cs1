import java.util.Scanner;

public class FirstCharacters {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Type your name: ");
    String name = reader.nextLine();
    int counter = 0;

    if (name.length() > 2) {
      while (counter < 3) {
        System.out.println((counter + 1) + ". character: " + name.charAt(counter));
        counter++;
      }
    }

    reader.close();
  }
}