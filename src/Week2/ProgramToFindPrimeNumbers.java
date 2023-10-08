package Week2;

import java.util.Scanner;

public class ProgramToFindPrimeNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        boolean isPrime = isPrimeNumber(number);

        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }

    static boolean isPrimeNumber(int number) {
        // Sayı negatif veya 1 ise asal değildir
        if (number < 2) {
            return false;
        }

        // 2 ve 3 asal sayıdır
        if (number == 2 || number == 3) {
            return true;
        }

        // Sayıyı 2 ile başlayarak kontrol et
        return isPrimeRecursive(number, 2);
    }

    static boolean isPrimeRecursive(int number, int divisor) {
        // Rekürsif olarak sayının asal olup olmadığını kontrol et

        // Eğer bölen sayıya eşitse, sayı asal değildir
        if (divisor == number) {
            return true;
        }

        // Eğer sayı bölenle tam bölünüyorsa, asal değildir
        if (number % divisor == 0) {
            return false;
        }

        // Bir sonraki böleni kontrol et
        return isPrimeRecursive(number, divisor + 1);
    }
}