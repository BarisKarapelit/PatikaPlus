import ManavKasaProgrami.ManavKasaProgrami;
import VucutKitleEndeksiHesabi.VucutKitleEndeksiHesabi;

import java.util.Scanner;

public class PatikaPlus {
    public static void main(String[] args) {
        //VucutKitleEndeksiHesabi();
        ManavKasaProgrami();


    }

    private static void ManavKasaProgrami() {
        ManavKasaProgrami manavKasaProgrami = new ManavKasaProgrami();
        Scanner input = new Scanner(System.in);
        System.out.println("Mana Kasa Programı");
        System.out.println("Armut Kaç Kilo ? : ");
        manavKasaProgrami.setArmutKg(input.nextDouble());
        System.out.println("Elma Kaç Kilo ? : ");
        manavKasaProgrami.setElmaKg(input.nextDouble());
        System.out.println("Domates Kaç Kilo ? : ");
        manavKasaProgrami.setDomatesKg(input.nextDouble());
        System.out.println("Muz Kaç Kilo ? : ");
        manavKasaProgrami.setMuzKg(input.nextDouble());
        System.out.println("Patlıcan Kaç Kilo ? : ");
        manavKasaProgrami.setPatlicanKg(input.nextDouble());
        System.out.println("Toplam Tutar : " + manavKasaProgrami.hesapla());
    }

    private static void VucutKitleEndeksiHesabi() {
        VucutKitleEndeksiHesabi hesap = new VucutKitleEndeksiHesabi();
        hesap.SetBoy(1.80);
        hesap.SetVucutKilogrami(80.0);
        System.out.println(hesap.hesapla());
    }
}
