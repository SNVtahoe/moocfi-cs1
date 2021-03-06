public class Main {
  public static void main(String[] args) {
    MyDate first = new MyDate(9, 3, 2012);
    MyDate second = new MyDate(10, 3, 2011);

    System.out.println(first.differenceInYears(second));
  }
}

/*
 * public class MyDate { private int day; private int month; private int year;
 * 
 * public MyDate(int day, int month, int year) { this.day = day; this.month =
 * month; this.year = year; }
 * 
 * public String toString() { return this.day + "." + this.month + "." +
 * this.year; }
 * 
 * public boolean earlier(MyDate compared) { // first we'll compare years if
 * (this.year < compared.year) { return true; }
 * 
 * // if the years are the same, we'll compare the months if (this.year ==
 * compared.year && this.month < compared.month) { return true; }
 * 
 * // years and months the same, we'll compare the days if (this.year ==
 * compared.year && this.month == compared.month && this.day < compared.day) {
 * return true; }
 * 
 * return false; }
 * 
 * public int differenceInYears(MyDate comparedDate) { int yearDiff =
 * Math.abs(this.year - comparedDate.year); int monthDiff = Math.abs(this.month
 * - comparedDate.month); int dayDiff = Math.abs(this.day - comparedDate.day);
 * 
 * if (this.year > comparedDate.year) { if (monthDiff == 0 && dayDiff == 0) {
 * return yearDiff; } else if (this.month > comparedDate.month) { return
 * yearDiff; } else if (comparedDate.month > this.month) { return yearDiff - 1;
 * } else if (this.day > comparedDate.day) { return yearDiff; } else if
 * (comparedDate.day > this.day) { return yearDiff - 1; } else { return
 * yearDiff; } } else { if (monthDiff == 0 && dayDiff == 0) { return yearDiff; }
 * else if (comparedDate.month > this.month) { return yearDiff; } else if
 * (this.month > comparedDate.month) { return yearDiff - 1; } else if
 * (comparedDate.day > this.day) { return yearDiff; } else if (this.day >
 * comparedDate.day) { return yearDiff - 1; } else { return yearDiff; } } } }
 */