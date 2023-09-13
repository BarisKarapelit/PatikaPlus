import VucutKitleEndeksiHesabi.VucutKitleEndeksiHesabi;

public class PatikaPlus {
    public static void main(String[] args) {
        VucutKitleEndeksiHesabi hesap = new VucutKitleEndeksiHesabi();
        hesap.SetBoy(1.80);
        hesap.SetVucutKilogrami(80.0);
        System.out.println(hesap.hesapla());
    }
}
