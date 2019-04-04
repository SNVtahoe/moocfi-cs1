public class AverageOfGivenNumbers {
  public static void main(String[] args) {
    double answer = average(4, 3, 6, 1);
    System.out.println("average: " + answer);
  }

  public static int sum(int num1, int num2, int num3, int num4) {
    return num1 + num2 + num3 + num4;
  }

  public static double average(int num1, int num2, int num3, int num4) {
    return sum(num1, num2, num3, num4) / (double) 4;
  }
}