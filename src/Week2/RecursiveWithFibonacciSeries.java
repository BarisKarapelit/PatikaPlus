package Week2;

import java.util.Scanner;

public class RecursiveWithFibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Fibonacci series of " + number + " numbers: ");
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println();
        System.out.println("Sum of " + number + " numbers: " + fibonacci(number));
    }
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
