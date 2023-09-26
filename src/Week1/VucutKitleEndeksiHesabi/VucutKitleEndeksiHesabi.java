package Week1.VucutKitleEndeksiHesabi;
public class VucutKitleEndeksiHesabi {
    private  static  Double Boy;
    private  static  Double VucutKilogrami;

    public String hesapla(){
        String sonuc = Double.toString(VucutKilogrami/(Boy*Boy));
        // Hata kontrolü
        try{
            // 1 sn bekle
            Thread.sleep(1000);
            // Konsolu temizle
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            // 1 sn bekle
            Thread.sleep(1000);
            // Konsola yaz
            return sonuc.substring(0,4);

        }catch (Exception e){
            return "Hata";
        }
    }
    public Double SetVucutKilogrami(Double VucutKilogrami){

        return this.VucutKilogrami = VucutKilogrami;
    }
    public Double GetVucutKilogrami(){
        return VucutKilogrami;
    }
    public Double SetBoy(Double Boy){
        return this.Boy = Boy;
    }
    public Double GetBoy(){
        return Boy;
    }

}
