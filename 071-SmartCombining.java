import java.util.ArrayList;

public class SmartCombining {
  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();

    list1.add(4);
    list1.add(3);

    list2.add(5);
    list2.add(10);
    list2.add(7);
    list2.add(4);

    smartCombine(list1, list2);

    System.out.println(list1);
    System.out.println(list2);
  }

  public static void smartCombine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
    for (int item : list2) {
      if (!list1.contains(item)) {
        list1.add(item);
      }
    }
  }
}