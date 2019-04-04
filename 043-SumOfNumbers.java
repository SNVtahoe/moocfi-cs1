public class SumOfNumbers {
  public static void main(String[] args) {
    int answer = sum(4, 3, 6, 1);
    System.out.println("sum: " + answer);
  }

  public static int sum(int num1, int num2, int num3, int num4) {
    int total = num1 + num2 + num3 + num4;
    return total;
  }
}