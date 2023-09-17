package Java101;

import java.util.Scanner;

public class BodyMassIndexCalculation {
    public static void main(String[] args) {
        double weight, height, bodyMassIndex;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight (kg): ");
        weight = input.nextDouble();
        System.out.println("Enter your height (m): ");
        height = input.nextDouble();
        bodyMassIndex = weight / (height * height);
        System.out.println("Your body mass index: " + bodyMassIndex);
    }
}
