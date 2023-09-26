package Week1.Java101;

import java.util.Scanner;

public class UserEntryPage {
    public static int  loop = 0;
    public static void main(String[] args) {
        String username,password;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz: ");
        username = input.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java101")) {
            System.out.println("Giriş Yaptınız!");
        } else {
            System.out.println("Kullanıcı Adınız veya Şifreniz Yanlış!");
            System.out.println("Şifrenizi Sıfırlamak İster Misiniz? (E/H)");
            char answer = input.next().charAt(0);
            while ((answer != 'H' || answer != 'h') && loop < 3) {
                System.out.print("Kullanıcı Adınız");
                username = input.nextLine();
                System.out.print("Şifrenizi Giriniz: ");
                password = input.nextLine();
                if (username.equals("patika") && password.equals("java101")) {
                    System.out.println("Giriş Yaptınız!");
                    break;
                }
                loop++;
                if (loop > 3) {
                    System.out.println("Giriş Hakkınız Bitti!");
                    System.out.println("Şifrenizi Sıfırlamak İster Misiniz? (E/H)");
                    answer = input.next().charAt(0);
                }
            }
            if (answer == 'E' || answer == 'e') {
                System.out.print("Yeni Şifrenizi Giriniz: ");
                String newPassword = input.next();
                if (newPassword.equals("java101")) {
                    System.out.println("Şifre Oluşturulamadı, Lütfen Başka Şifre Giriniz!");
                } else {
                    System.out.println("Şifre Oluşturuldu!");
                }
            } else {
                System.out.println("Şifre Oluşturma İşlemi İptal Edildi!");
            }
        }
    }
}
