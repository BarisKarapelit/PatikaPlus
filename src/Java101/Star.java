package Java101;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter the Number :");
            number = inp.nextInt();
        } while (number % 2 != 1);


        for (int i = 1; i <= (number / 2) + 1; i++) {
            for (int j = 1; j <= (number - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = (number / 2); i >= 1; i--) {
            for (int j = (number - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i) - 1; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
