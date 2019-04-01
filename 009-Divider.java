import java.util.Scanner;

public class Divider {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Type a number: ");
    int x = Integer.parseInt(reader.nextLine());

    System.out.print("Type another number: ");
    int y = Integer.parseInt(reader.nextLine());

    double total = (double) x / y;
    System.out.println("Division: " + x + " / " + y + " = " + total);

    reader.close();
  }
}