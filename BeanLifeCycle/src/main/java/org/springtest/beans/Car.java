package org.springtest.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Car {
    private String model;

    //default constructor
    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    @PostConstruct
    public void init() {
        System.out.println("Car bean is being initialized with model: " + model);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Car bean is being destroyed with model: " + model);
    }
}
