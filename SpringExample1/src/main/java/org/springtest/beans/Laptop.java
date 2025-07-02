package org.springtest.beans;

public class Laptop implements Computer {
    private String brand;

    public Laptop() {
        super();
        System.out.println("Creating Laptop Object...");
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        System.out.println("Setting Laptop Brand: " + brand);
        this.brand = brand;
    }

    public boolean start() {
        System.out.println("Laptop is starting...");
        return true;
    }
}
