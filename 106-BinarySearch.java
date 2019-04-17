import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Here you can test binary search
    int[] array = { -3, 2, 3, 4, 7, 8, 12 };
    Scanner reader = new Scanner(System.in);

    System.out.print("Values of the array: " + Arrays.toString(array));
    System.out.println();
    System.out.println();

    System.out.print("Enter searched number: ");
    String searchedValue = reader.nextLine();
    System.out.println();

    boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));

    // Print the binary search result here
    if (result) {
      System.out.println("Value " + searchedValue + " is in the array.");
    } else {
      System.out.println("Value " + searchedValue + " is not in the array.");
    }
  }
}

/*
 * public class BinarySearch { public static boolean search(int[] array, int
 * searchedValue) { int beginning = 0; int end = array.length - 1;
 * 
 * while (beginning <= end) { int middle = (beginning + end) / 2;
 * 
 * if (array[middle] == searchedValue) { return true; }
 * 
 * // restrict the search area if (array[middle] < searchedValue) { beginning =
 * middle + 1; } else { end = middle - 1; } } return false; } }
 */