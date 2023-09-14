import ManavKasaProgrami.ManavKasaProgrami;
import VucutKitleEndeksiHesabi.VucutKitleEndeksiHesabi;

import java.util.Scanner;

public class PatikaPlus {
    public static void main(String[] args) {
        //VucutKitleEndeksiHesabi();
        ManavKasaProgrami();


    }

    private static void ManavKasaProgrami() {
        //ManavKasaProgrami object olusturuldu
        ManavKasaProgrami manavKasaProgrami = new ManavKasaProgrami();
        //Scanner object olusturuldu
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan alınan degerler set edildi
        System.out.println("Mana Kasa Programı");
        System.out.println("Armut Kaç Kilo ? : ");
        //setArmutKg methodu ile armutKg degiskenine deger atandı
        manavKasaProgrami.setArmutKg(input.nextDouble());
        System.out.println("Elma Kaç Kilo ? : ");
        //setElmaKg methodu ile elmaKg degiskenine deger atandı
        manavKasaProgrami.setElmaKg(input.nextDouble());
        System.out.println("Domates Kaç Kilo ? : ");
        //setDomatesKg methodu ile domatesKg degiskenine deger atandı
        manavKasaProgrami.setDomatesKg(input.nextDouble());
        System.out.println("Muz Kaç Kilo ? : ");
        //setMuzKg methodu ile muzKg degiskenine deger atandı
        manavKasaProgrami.setMuzKg(input.nextDouble());
        System.out.println("Patlıcan Kaç Kilo ? : ");
        //setPatlicanKg methodu ile patlicanKg degiskenine deger atandı
        manavKasaProgrami.setPatlicanKg(input.nextDouble());
        //hesapla methodu ile toplam tutar hesaplandı
        System.out.println("Toplam Tutar : " + manavKasaProgrami.hesapla());
    }

    private static void VucutKitleEndeksiHesabi() {
        VucutKitleEndeksiHesabi hesap = new VucutKitleEndeksiHesabi();
        hesap.SetBoy(1.80);
        hesap.SetVucutKilogrami(80.0);
        System.out.println(hesap.hesapla());
    }
}
