package Week2;

import java.util.Scanner;

public class MatrisTranspoz {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int s = 0;
        int i, j;
        System.out.println("Oluşturulacak satır sayısını gir");
        int satir = oku.nextInt();
        System.out.println("Oluşturulacak  sutun sayısını gir");
        int sutun = oku.nextInt();
        int[][] matris = new int[satir][sutun]; //girilen sayı kadar çok boyutlu dizi oluşturur.
        int[][] transpoz = new int[sutun][satir];
        for (i = 0; i < s; i++) {
            for (j = 0; j < s; j++) {
                System.out.println((i + 1) + "x" + (j + 1) + "sayıyı gir");
                matris[i][j] = oku.nextInt();
                transpoz[i][j] = matris[i][j];
            }
        }
        for (i = 0; i < s; i++) {  //transpoz alınmamış hali
            for (j = 0; j < s; j++) {
                System.out.print(matris[i][j] + "\t");

            }

            System.out.println("");

        }

        System.out.println("");
        for (i = 0; i < s; i++) {
            for (j = 0; j < s; j++) {
                System.out.print(transpoz[j][i] + "\t"); //traspoz alınmış hali

            }
            System.out.println("");

        }


    }
}
