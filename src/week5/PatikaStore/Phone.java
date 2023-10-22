package week5.PatikaStore;

import java.util.ArrayList;

public class Phone extends Product{

    private String color;
    private int batteryPower;

    public static ArrayList<Phone> phones = new ArrayList<>();

    static{
        phones.add(new Phone("iPhone 12 Pro Max", 16499, 10, Brand.selectedBrand(0), 128, 6.7, 6, "Graphite", 3687));
        phones.add(new Phone("iPhone 12 Pro ", 17000, 10, Brand.selectedBrand(0), 128, 6.7, 6, "Silver", 3687));
        phones.add(new Phone("iPhone 12", 12000, 10, Brand.selectedBrand(0), 128, 6.1, 4, "Black", 2815));
        phones.add(new Phone("iPhone 12 Mini", 10000, 10, Brand.selectedBrand(0), 128, 5.4, 4, "Blue", 2227));
        phones.add(new Phone("iPhone 11", 9000, 10, Brand.selectedBrand(0), 128, 6.1, 4, "Black", 3110));
        phones.add(new Phone("Samsung Galaxy S21 Ultra", 13999, 10, Brand.selectedBrand(1), 128, 6.8, 12, "Phantom Black", 5000));
        phones.add(new Phone("Samsung Galaxy S21+", 11999, 10, Brand.selectedBrand(1), 128, 6.7, 8, "Phantom Violet", 4800));
        phones.add(new Phone("Huawei P40 Pro", 9999, 10, Brand.selectedBrand(2), 128, 6.58, 8, "Black", 4200));
        phones.add(new Phone("Huawei P40 Lite", 3999, 10, Brand.selectedBrand(2), 128, 6.4, 6, "Black", 4200));
    }

    public Phone(String name, double price, int discount, Brand brandInfo, int memory, double dislaySize, int ram, String color, int batteryPower) {
        super(name, price, discount, brandInfo, memory, dislaySize, ram);
        this.color = color;
        this.batteryPower = batteryPower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }
}
