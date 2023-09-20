package Java101;

import java.util.Scanner;

public class ProgramToCalculateExponents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, exponent, result = 1, total = 1;
        System.out.printf("Enter the base: ");
        base = input.nextInt();
        System.out.printf("Enter the exponent: ");
        exponent = input.nextInt();
        System.out.printf("%d^%d = %d", base, exponent, (int) Math.pow(base, exponent));
        System.out.println(" ");

        while (result <= exponent) {
            System.out.println("into while");
            total *= base;
            result++;
        }
        System.out.printf("%d^%d = %d", base, exponent, total);
        System.out.println(" ");

    }
}
