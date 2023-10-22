package week5.PatikaStore;

import java.util.Scanner;

public class PatikaStore {
    public void start() {
        System.out.println("\nPatikaStore Product Management Panel!");
        System.out.println("1- Notebook Operations");
        System.out.println("2- Phone Operations");
        System.out.println("3- Brand List");
        System.out.println("0- Exit");
        System.out.print("Your Choice: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.print("\033[H\033[2J");
                NotebookOperations notebookOperations = new NotebookOperations();
                notebookOperations.start();
                break;
            case 2:
                System.out.print("\033[H\033[2J");
                PhoneOperations phoneOperations = new PhoneOperations();
                phoneOperations.start();
                break;
            case 3:
                System.out.print("\033[H\033[2J");
                Brand.printBrands();
                start();
                break;
            case 0:
                System.out.print("\033[H\033[2J");
                System.out.println("Exiting...");
                break;
            default:
                System.out.print("\033[H\033[2J");
                System.out.println("Invalid choice!");
                start();
        }

    }
}
