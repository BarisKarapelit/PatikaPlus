package Java101;

import java.util.Scanner;

public class ProgramToCalculateFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int number = input.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(number + "! = " + factorial);
    }
}
