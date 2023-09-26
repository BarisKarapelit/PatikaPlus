package Week1.Java101;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int number = input.nextInt();
        double sum = 0;
        for (int i = 1; i < number; i++) {
            sum+=(1/i);
        }
        System.out.println("Result :"+sum);
    }
}
