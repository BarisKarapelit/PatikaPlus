package Week1.Java101;

import java.util.Scanner;


public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int sum = 0;
        int number = input.nextInt();
        int originalNumber = number;

        // Find the number of digits in the number
        int numDigits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
