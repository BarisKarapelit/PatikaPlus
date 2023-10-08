package Week2;

import java.util.Arrays;
import java.util.Scanner;

public class ShortToLongArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] shortArray = new int[size];

        // Elemanları kullanıcıdan al
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            shortArray[i] = scanner.nextInt();
        }

        // Diziyi küçükten büyüğe sırala
        Arrays.sort(shortArray);

        // Sıralı diziyi ekrana yazdır
        System.out.print("Sıralama: ");
        for (int i = 0; i < size; i++) {
            System.out.print(shortArray[i] + " ");
        }
    }
}
