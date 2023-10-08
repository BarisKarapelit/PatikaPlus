package Week2;

import java.util.Scanner;

public class ExponentNumberCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Base Value: " );
        int base = input.nextInt();
        System.out.print("Exponent Value: ");
        int exponent = input.nextInt();
        System.out.println("Result: " + exponent(base, exponent));
    }
    static int exponent(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return (int) (Math.pow(base,exponent)+exponent(base, exponent-1));
    }
}
