package week5.PatikaStore;

import java.util.ArrayList;

public class Notebook extends Product {
    public  static ArrayList<Notebook> notebooks = new ArrayList<>();
    static {
        notebooks.add(new Notebook("MacBook Air", 10000, 10, Brand.selectedBrand(0), 128, 13.3, 8));
        notebooks.add(new Notebook("MacBook Pro", 15000, 10, Brand.selectedBrand(0), 256, 13.3, 8));
        notebooks.add(new Notebook("MacBook Pro", 18000, 10, Brand.selectedBrand(0), 512, 16, 16));
    }
    public Notebook(String name, double price, int discount, Brand brandInfo, int memory, double dislaySize, int ram) {
        super(name, price, discount, brandInfo, memory, dislaySize, ram);
    }
}
