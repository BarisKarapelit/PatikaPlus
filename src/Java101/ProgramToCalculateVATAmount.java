package Java101;

import java.util.Scanner;

public class ProgramToCalculateVATAmount {
    public  static double tutar, kdvOran, kdvTutar, kdvliTutar;
    public  static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Tutarı giriniz :");
        tutar = input.nextDouble();
        System.out.println("KDV oranını giriniz :");
        kdvOran= input.nextDouble();
        kdvTutar = tutar * (kdvOran/100);
        kdvliTutar = tutar + kdvTutar;
        System.out.println("KDV'siz Tutar :"+tutar);
        System.out.println("KDV'li Tutar :"+kdvliTutar);
        System.out.println("KDV Tutarı :"+kdvTutar);
    }
}
