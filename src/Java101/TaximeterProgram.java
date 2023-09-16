package Java101;

import java.util.Scanner;

public class TaximeterProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km ;
        double perKm = 2.20, total, startPrice = 10;
        System.out.print("Enter the distance: ");
        km = input.nextInt();
        total =km * perKm;
        total += startPrice;
        total = (total < 20) ? 20 : total;
        System.out.println("Total price: " + total);
    }
}
