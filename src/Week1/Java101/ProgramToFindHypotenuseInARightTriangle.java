package Week1.Java101;

import java.util.Scanner;

public class ProgramToFindHypotenuseInARightTriangle {
    public static void main(String[] args) {
        int a, b;
        double c;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the first edge: ");
        a = input.nextInt();
        System.out.println("Enter the length of the second edge: ");
        b = input.nextInt();
        c=Math.sqrt((a * a) + (b * b));
        System.out.println("The length of the hypotenuse is: " + c);
        double u = (a + b + c) / 2;
        double field = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("The field of the triangle is: " + field);

    }
}
