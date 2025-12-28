package org.springtest.beans;

public class Desktop implements Computer{
    private String brand;

    public Desktop() {
        super();
        System.out.println("Creating Desktop Object...");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("Setting Desktop Brand: " + brand);
        this.brand = brand;
    }

    public boolean start() {
        System.out.println("Desktop is starting...");
        return true;
    }
}
