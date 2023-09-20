package Java101;

import java.util.Scanner;

public class ProgramToFindEvenNumbersUpToTheEnteredNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if (number>1){
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }else{
            System.out.printf("Fault");
        }

    }
}
