package Week2;

import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        isPalindrom(n);

    }
    static boolean isPalindrom(int n){
        int temp = n,reversedNumber = 0,remainder;
        while (temp != 0){
            remainder = temp % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            temp /= 10;
        }
        if (reversedNumber == n){
            System.out.println(n + " is a palindrom number");
            return true;
        }else System.out.println(n + " is not a palindrom number");

        return false;
    }
}
