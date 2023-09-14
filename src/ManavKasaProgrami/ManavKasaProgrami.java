package ManavKasaProgrami;

public class ManavKasaProgrami {
    //Urunlerin kilolari tanımlıyoruz.
    private static Double ArmutKg;
    private static Double ElmaKg;
    private static Double DomatesKg;
    private static Double MuzKg;
    private static Double PatlicanKg;

    public Double getArmutKg() {
        return ArmutKg;
    }

    public Double getElmaKg() {
        return ElmaKg;
    }

    public Double getDomatesKg() {
        return DomatesKg;
    }

    public Double getMuzKg() {
        return MuzKg;
    }

    public Double getPatlicanKg() {
        return PatlicanKg;
    }

    public void setArmutKg(Double armutKg) {
        ArmutKg = armutKg;
    }

    public void setElmaKg(Double elmaKg) {
        ElmaKg = elmaKg;
    }

    public void setDomatesKg(Double domatesKg) {
        DomatesKg = domatesKg;
    }

    public void setMuzKg(Double muzKg) {
        MuzKg = muzKg;
    }

    public void setPatlicanKg(Double patlicanKg) {
        PatlicanKg = patlicanKg;
    }


    public Double hesapla(){
        //Tum urunlerin kilo fiyatlarını toplayıp donduruyoruz.
        return (ArmutKg*2.14)+(ElmaKg*3.67)+(DomatesKg*1.11)+(MuzKg*0.95)+(PatlicanKg*5.00);
    }
}
