package week5.PatikaStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Brand {
    private int id;
    private String name;
    private static ArrayList<Brand> brands = new ArrayList<>();

    public Brand(int id, String name, ArrayList<Brand> brands) {
        this.id = id;
        this.name = name;
        this.brands = brands;
    }

    public Brand(String name) {
        this.id = brands.size();
        this.name = name;
    }

    static {
        brands.add(new Brand("Apple"));
        brands.add(new Brand("Samsung"));
        brands.add(new Brand("Huawei"));
        brands.add(new Brand("Xiaomi"));
        brands.add(new Brand("Oppo"));
        brands.add(new Brand("Nokia"));
        brands.add(new Brand("General Mobile"));
        brands.add(new Brand("Casper"));
        brands.add(new Brand("Asus"));
        brands.add(new Brand("Monster"));
        brands.add(new Brand("Lenovo"));
        brands.add(new Brand("HP"));
    }

    public String getBrands() {
        return name;
    }

    public static void printBrands() {
        Collections.sort(brands, Comparator.comparing(o -> o.name));
        int id = 1;
        for (Brand brand : brands) {
            System.out.println(brand.name + " " + id++);
        }
    }

    public static Brand selectedBrand(int x) {
        Collections.sort(brands, Comparator.comparing(o -> o.name));
        return brands.get(x);
    }

    public static String filterBrand(int x){
        return brands.get(x).name;
    }
}
