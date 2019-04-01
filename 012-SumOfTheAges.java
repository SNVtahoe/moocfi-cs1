import java.util.Scanner;

public class SumOfTheAges {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Type your name: ");
    String name1 = reader.nextLine();
    System.out.print("Type your age: ");
    int x = Integer.parseInt(reader.nextLine());

    System.out.println("");

    System.out.print("Type your name: ");
    String name2 = reader.nextLine();
    System.out.print("Type your age: ");
    int y = Integer.parseInt(reader.nextLine());

    System.out.println("");

    System.out.println(name1 + " and " + name2 + " are " + (x + y) + " years old in total.");

    reader.close();
  }
}