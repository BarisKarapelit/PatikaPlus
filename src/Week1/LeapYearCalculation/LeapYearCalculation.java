package Week1.LeapYearCalculation;

import java.util.Scanner;

public class LeapYearCalculation {
    private static Integer year;

    public static void setYear(Integer year) {
        LeapYearCalculation.year = year;
    }
    public static Integer getYear() {
        return year;
    }
    public static boolean isLeapYear() {
        System.out.println("Please enter a year:");
        Scanner scanner = new Scanner(System.in);
        setYear(scanner.nextInt());
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                System.out.println("Year " + year + " is a leap year.");
                return year % 400 == 0;
            }
            System.out.println("Year " + year + " is a leap year.");
            return true;
        }
        System.out.println("Year " + year + " is not a leap year.");
        return false;
    }
}
