package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the number of terms: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.println("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
