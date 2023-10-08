package Week2;

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;
        String menu = "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n" +
                "5. Power\n" +
                "6. Mod\n" +
                "7. Rectangle Area and Perimeter\n" +
                "0. Exit\n";
        System.out.println(menu);
        while (true) {
            System.out.print("Please select menu below: ");
            select = scanner.nextInt();

            if (select == 0) {
                break;
            }
            System.out.print("Please First Number Enter : ");
            int a = scanner.nextInt();
            System.out.print("Please Second Number Enter : ");
            int b = scanner.nextInt();


            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divied(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    rectangle(a, b);
                    break;
                case 0:
                    System.out.println("Exit"
                            + "\nThank you for using our program");
                    break;
                default:
                    System.out.println("Error: Invalid selection");
                    break;
            }
        }
    }

    static void rectangle(int firstNumber, int secondNumber) {
        int area = firstNumber * secondNumber;
        int perimeter = (firstNumber + secondNumber) * 2;
        System.out.println("Area : " + area);
        System.out.println("Perimeter : " + perimeter);
    }

    static int mod(int firstNumber, int secondNumber) {
        int result = firstNumber % secondNumber;
        System.out.println("Result :" + result);
        return result;
    }

    static int power(int firstNumber, int secondNumber) {
        int result = 1;
        for (int i = 0; i < secondNumber; i++) {
            result *= firstNumber;
        }
        System.out.println("Result :" + result);
        return result;
    }

    static double divied(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            System.out.println("Error: Division by zero");
            System.out.println("Second number must be different from zero");
            return 0;
        }
        double result = (double) firstNumber / secondNumber;
        System.out.println("Result :" + result);
        return result;
    }

    static int times(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        System.out.println("Result :" + result);
        return result;
    }

    static int minus(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        System.out.println("Result :" + result);
        return result;
    }

    static int sum(int number1, int number2) {
        int result = number1 + number2;
        System.out.println("Sum : " + result);
        return result;
    }
}
