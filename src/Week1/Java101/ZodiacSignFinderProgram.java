package Week1.Java101;

import java.util.Scanner;

public class ZodiacSignFinderProgram {
    public static void main(String[] args) {
        String month, day, result;
        System.out.println("Zodyak Bulma Programına Hoşgeldiniz!");
        System.out.println("Lütfen Doğduğunuz Ayı Giriniz: ");
        Scanner Input = new Scanner(System.in);
        month = Input.nextLine();
        System.out.println("Lütfen Doğduğunuz Günü Giriniz: ");
        day = Input.nextLine();
        switch (month) {
            case "Ocak":
                if (Integer.parseInt(day) <= 21) {
                    result = "Oğlak";
                } else {
                    result = "Kova";
                }
                break;
            case "Şubat":
                if (Integer.parseInt(day) <= 19) {
                    result = "Kova";
                } else {
                    result = "Balık";
                }
                break;
            case "Mart":
                if (Integer.parseInt(day) <= 20) {
                    result = "Balık";
                } else {
                    result = "Koç";
                }
                break;
            case "Nisan":
                if (Integer.parseInt(day) <= 20) {
                    result = "Koç";
                } else {
                    result = "Boğa";
                }
                break;
            case "Mayıs":
                if (Integer.parseInt(day) <= 21) {
                    result = "Boğa";
                } else {
                    result = "İkizler";
                }
                break;
            case "Haziran":
                if (Integer.parseInt(day) <= 22) {
                    result = "İkizler";
                } else {
                    result = "Yengeç";
                }
                break;
            case "Temmuz":
                if (Integer.parseInt(day) <= 22) {
                    result = "Yengeç";
                } else {
                    result = "Aslan";
                }
                break;
            case "Ağustos":
                if (Integer.parseInt(day) <= 22) {
                    result = "Aslan";
                } else {
                    result = "Başak";
                }
                break;
            case "Eylül":
                if (Integer.parseInt(day) <= 22) {
                    result = "Başak";
                } else {
                    result = "Terazi";
                }
                break;
            case "Ekim":
                if (Integer.parseInt(day) <= 22) {
                    result = "Terazi";
                } else {
                    result = "Akrep";
                }
                break;
            case "Kasım":
                if (Integer.parseInt(day) <= 21) {
                    result = "Akrep";
                } else {
                    result = "Yay";
                }
                break;
            case "Aralık":
                if (Integer.parseInt(day) <= 21) {
                    result = "Yay";
                } else {
                    result = "Oğlak";
                }
                break;
            default:
                result = "Hatalı Giriş Yaptınız!";
                break;
        }
        System.out.println("Burcunuz: " + result);
    }
}
