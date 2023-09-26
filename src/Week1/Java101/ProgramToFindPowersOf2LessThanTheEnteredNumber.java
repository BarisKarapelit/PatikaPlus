package Week1.Java101;

import java.util.Scanner;

public class ProgramToFindPowersOf2LessThanTheEnteredNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, power = 1;
        System.out.printf("Enter a number: ");
        number = input.nextInt();
        for (int i = 1; i <= number; i *= 2) {
            System.out.println("2^" + power + " = " + i);
            power++;
        }
        System.out.printf("4 Power And 5 Power Power Of Numbers");
        power = 1;
        for (int i = 1; i <= number; i *= 4) {
            System.out.println("4^" + power + " = " + i);
            power++;
        }
        power =1;
        int i=1;
        while (power<=number){
            i*=number;
            System.out.println("5^" + power + " = " + i);
            power++;
        }
    }
}
