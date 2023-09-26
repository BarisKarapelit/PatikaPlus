package Week1.Java101;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pass;
        boolean isTrue = false;
        int i = 0;
        do {
            System.out.println("Enter your password: ");
            pass = scan.nextInt();
            if (pass == 1234) {
                System.out.println("Welcome!");
                isTrue = false;
            } else {
                System.out.println("Wrong password!");
                isTrue = true;
            }
            if (i == 3) {
                System.out.println("Your right to enter has been blocked!");
                isTrue = false;
            }
            i++;
        } while (isTrue);
    }
}
