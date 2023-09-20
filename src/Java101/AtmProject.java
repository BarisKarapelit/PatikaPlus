package Java101;

import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName,password;
        int right=3;
        int balance=1000;
        do {
            System.out.print("Enter the Username :");
            userName= inp.nextLine();
            System.out.print("Enter the Password :");
            password= inp.nextLine();
            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Welcome to the Patika Bank");
                System.out.println("What do you want to do?");
                System.out.println("1- Deposit Money");
                System.out.println("2- Withdraw Money");
                System.out.println("3- Balance Inquiry");
                System.out.println("4- Exit");
                System.out.print("Enter the number :");
                int select= inp.nextInt();
                switch (select){
                    case 1:
                        System.out.print("Enter the amount of money you want to deposit :");
                        int deposit= inp.nextInt();
                        balance+=deposit;
                        System.out.println("Your money has been deposited into your account.");
                        break;
                    case 2:
                        System.out.print("Enter the amount of money you want to withdraw :");
                        int withdraw= inp.nextInt();
                        if (withdraw>balance){
                            System.out.println("You don't have enough money in your account.");
                        }
                        else {
                            balance-=withdraw;
                        }
                        System.out.println("Your money has been withdrawn from your account.");
                        break;
                    case 3:
                        System.out.println("Your balance :"+balance);
                        break;
                    case 4:
                        System.out.println("Goodbye");
                        break;
                    default:
                        System.out.println("Please enter a valid number.");
                }
                System.out.println("Goodbye");
            }
            else {
                right--;
                System.out.println("Wrong Username or Password");
                System.out.println("You have "+right+" right");
            }
        } while (right>0);
        System.out.println("54465");


    }
}
