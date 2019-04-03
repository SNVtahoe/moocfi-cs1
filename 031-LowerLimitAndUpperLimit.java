import java.util.Scanner;

public class LowerLimitAndUpperLimit {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("First: ");
    int lower = Integer.parseInt(reader.nextLine());
    System.out.print("Second: ");
    int upper = Integer.parseInt(reader.nextLine());

    if (lower <= upper) {
      int incrementer = lower;

      while (incrementer <= upper) {
        System.out.println(incrementer);
        incrementer++;
      }
    }

    reader.close();
  }
}