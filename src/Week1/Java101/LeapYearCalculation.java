package Week1.Java101;

import java.util.Scanner;

public class LeapYearCalculation {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = input.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println(year + " is  a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
