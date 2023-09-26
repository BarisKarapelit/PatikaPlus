package Week1.Java101;

import java.util.Scanner;

public class OneBetweenNumberPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, i, flag = 0;
        System.out.println("Enter a number: ");
        number = input.nextInt();
        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
