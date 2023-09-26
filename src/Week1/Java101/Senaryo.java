package Week1.Java101;

import java.util.Scanner;

public class Senaryo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");
        int n = input.nextInt();
        int[] numbers = new int[n];
        int i = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (i = 0; i < n; i++) {
            System.out.println("Enter a number:");
            numbers[i] = input.nextInt();
            sum += numbers[i];
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double) sum / n);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
}
