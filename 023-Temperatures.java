import java.util.Scanner;

public class Temperatures {
  public static void main(String[] args) {
    Scanner reader = new Reader(System.in);

    double temp;

    // This is an infinite loop; the assignment did not ask for an escape hatch to
    // be implemented
    while (true) {
      temp = Double.parseDouble(reader.nextLine());

      if (temp >= 30 && temp <= 40) {
        Graph.addNumber(temp);
      }
    }
  }
}