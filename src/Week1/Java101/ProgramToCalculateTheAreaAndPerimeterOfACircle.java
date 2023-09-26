package Week1.Java101;

import java.util.Scanner;

public class ProgramToCalculateTheAreaAndPerimeterOfACircle {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, area, perimeter, alpha;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        r = input.nextInt();
        area = pi * r * r;
        perimeter = 2 * pi * r;
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        System.out.println("Enter the \uD835\uDEFC of the circle: ");
        alpha = input.nextDouble();
        area = (pi * (r * r) * alpha) / 360;
        System.out.println(" Alpha Part Area: " + area);
        input.close();


    }
}
