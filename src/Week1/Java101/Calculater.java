package Week1.Java101;

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        int n1, n2 ,select;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        n1 = input.nextInt();
        System.out.println("Enter second number: ");
        n2 = input.nextInt();
        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.println("Select operation: ");
        select = input.nextInt();
        switch (select){
            case 1:
                System.out.println("Result: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Result: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Result: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0){
                    System.out.println("Result: " + (n1 / n2));
                }else{
                    System.out.println("You can't divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid operation!");
        }
    }
}
