package Week1.Java101;

import java.util.Scanner;

public class SuggestingActivitiesAccordingToAirTemperature {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the air temperature: ");
        heat = input.nextInt();
        if (heat < 5) {
            System.out.println("You can go skiing.");
        } else if (heat >= 5 && heat <= 15) {
            System.out.println("You can go to the cinema.");
        } else if (heat > 10 && heat <= 25) {
            System.out.println("You can go to picnic.");
        } else if (heat > 25) {
            System.out.println("You can go swimming.");
        } else {
            System.out.println("Please enter a valid value.");
        }
    }
}
