import java.util.Scanner;

public class UpToCertainNumber {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Up to what number? ");
    int x = Integer.parseInt(reader.nextLine());
    int incrementer = 1;

    while (incrementer <= x) {
      System.out.println(incrementer);
      incrementer++;
    }

    reader.close();
  }
}