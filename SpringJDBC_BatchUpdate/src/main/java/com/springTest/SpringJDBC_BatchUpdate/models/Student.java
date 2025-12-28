package com.springTest.SpringJDBC_BatchUpdate.models;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int roll;
    private String name;
    private Double per;

    public Student() {
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public Double getPer() {
        return per;
    }

    public void setPer(Double per) {
        this.per = per;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
