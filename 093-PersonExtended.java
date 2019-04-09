public class Main {
  public static void main(String[] args) {
    Person pekka = new Person("Pekka", new MyDate(15, 2, 1983));
    Person steve = new Person("Steve");

    System.out.println(pekka);
    System.out.println(steve);
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

/*
 * import java.util.Calendar;
 * 
 * public class Person { private String name; private MyDate birthday;
 * 
 * public Person(String name, int pp, int kk, int vv) { this.name = name;
 * this.birthday = new MyDate(pp, kk, vv); }
 * 
 * public Person(String name, MyDate birthday) { this.name = name; this.birthday
 * = birthday; }
 * 
 * public Person(String name) { this(name,
 * Calendar.getInstance().get(Calendar.DATE),
 * Calendar.getInstance().get(Calendar.MONTH) + 1,
 * Calendar.getInstance().get(Calendar.YEAR)); }
 * 
 * public int age() { int date = Calendar.getInstance().get(Calendar.DATE); int
 * month = Calendar.getInstance().get(Calendar.MONTH) + 1; int year =
 * Calendar.getInstance().get(Calendar.YEAR);
 * 
 * MyDate toCompare = new MyDate(date, month, year);
 * 
 * return toCompare.differenceInYears(this.birthday); }
 * 
 * public boolean olderThan(Person compared) { return
 * this.birthday.earlier(compared.birthday); }
 * 
 * public String getName() { return this.name; }
 * 
 * public String toString() { return this.name + ", born " + this.birthday; } }
 */