package week5.PatikaStore;

import java.util.UUID;

public class Product {
    private  UUID id;
    private String name;
    private double price;
    private int discount;
    private Brand brandInfo;
    private int memory;
    private double dislaySize;
    private int ram;

    public Product(String name, double price, int discount, Brand brandInfo, int memory, double dislaySize, int ram) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.brandInfo = brandInfo;
        this.memory = memory;
        this.dislaySize = dislaySize;
        this.ram = ram;

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Brand getBrandInfo() {
        return brandInfo;
    }

    public void setBrandInfo(Brand brandInfo) {
        this.brandInfo = brandInfo;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getDislaySize() {
        return dislaySize;
    }

    public void setDislaySize(double dislaySize) {
        this.dislaySize = dislaySize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
