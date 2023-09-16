package Java101;

import java.util.Scanner;

public class ReceivingDataFromUser {
    public static void main(String[] args) {
        DynamicCentering dynamicCentering = new DynamicCentering();
        Scanner input = new Scanner(System.in);
        String textToCenter = "User Giriş Ekranı";
        textCentering(dynamicCentering, textToCenter);

        String user,password;

        do {
            System.out.print("Enter your username: ");
            user = input.nextLine();

            if (user == null || user.trim().isEmpty()) {
                System.out.println("Please enter a valid username.");
            } else {
                System.out.println("Entered username: " + user);
                break;  // Break the loop if a valid username is entered
            }

        } while (true);
        do {
            System.out.print("Enter your password: ");
            password = input.nextLine();

            if (password == null || password.trim().isEmpty()) {
                System.out.println("Please enter a valid password.");
            } else {
                System.out.println("Entered password: " + setStar(password.length()));
                break;  // Break the loop if a valid username is entered
            }

        } while (true);
        try {
            Thread.sleep(1000);
            cleanPage();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void cleanPage() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static String setStar(int length){
        String star = "";
        for (int i =0;i<length;i++){
            star+="*";
        }
        return star;
    }
    private static void textCentering(DynamicCentering dynamicCentering, String textToCenter) {
        int consoleWidth = dynamicCentering.getConsoleWidth();
        int padding = (consoleWidth - textToCenter.length()) / 2;

        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.println(textToCenter);
    }
}

