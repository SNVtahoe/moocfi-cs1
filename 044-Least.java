public class Least {
  public static void main(String[] args) {
    int answer = least(2, 7);
    System.out.println("Least: " + answer);
  }

  public static int least(int num1, int num2) {
    if (num1 < num2) {
      return num1;
    } else if (num2 < num1) {
      return num2;
    } else {
      return num1;
    }
  }
}