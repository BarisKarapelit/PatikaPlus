package Java101;

import java.util.Scanner;

public class ReceivingDataFromUser {
    public static void main(String[] args){
        DynamicCentering dynamicCentering = new DynamicCentering();
        Scanner input = new  Scanner(System.in);
        String textToCenter = "User Giriş Ekranı";
        textCentering(dynamicCentering, textToCenter);


    }

    private static void textCentering(DynamicCentering dynamicCentering, String textToCenter) {
        // Get the console width
        int consoleWidth = dynamicCentering.getConsoleWidth();

        int padding = (consoleWidth - textToCenter.length()) / 2;

        // Print the padding spaces followed by the centered text
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.println(textToCenter);
    }
}
