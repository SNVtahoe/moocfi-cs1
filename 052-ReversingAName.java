import java.util.Scanner;

public class ReversingName {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Type your name: ");
    String name = reader.nextLine();

    int counter = 1;
    int nameLength = name.length();

    System.out.print("In reverse order: ");

    while (nameLength >= counter) {
      System.out.print(name.charAt(nameLength - counter));
      counter++;
    }

    System.out.print("\n");

    reader.close();
  }
}