package Java101;

import java.util.Scanner;

public class ProgramTheSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum = 0,oddSum=0;

       do {
           System.out.print("Enter a number: ");
           number = input.nextInt();
           sum+=number;
           if (number%2==1){
               oddSum+=number;
           }
       }while (0<number);
        System.out.printf("Sum of all numbers: %d\n",sum);
        System.out.printf("Sum of odd numbers: %d\n",oddSum);
    }
}
