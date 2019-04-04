import java.util.ArrayList;

public class Variance {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(2);
    list.add(7);
    list.add(2);

    System.out.println("The variance is: " + variance(list));
  }

  public static int sum(ArrayList<Integer> list) {
    int total = 0;

    for (int num : list) {
      total += num;
    }

    return total;
  }

  public static double average(ArrayList<Integer> list) {
    int total = sum(list);
    double items = list.size();

    return total / items;
  }

  public static double variance(ArrayList<Integer> list) {
    double listAvg = average(list);

    double numerator = 0;
    int denominator = list.size() - 1;

    for (int item : list) {
      numerator += Math.pow((item - listAvg), 2.0);
    }

    return (numerator / denominator);
  }
}