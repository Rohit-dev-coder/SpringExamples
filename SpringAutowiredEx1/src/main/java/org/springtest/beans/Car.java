package org.springtest.beans;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private String brand = "Audi";
    private String model = "A4";
    private int year = 2015;

    public Car() {
        System.out.println("Car object created - default constructor");
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        System.out.println("Car object created - parameterized constructor");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

}
