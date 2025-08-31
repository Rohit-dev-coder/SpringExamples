package com.springtest.springjdbcEx1.models;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int roll;
    private String name;
    private double per;

    public Student() {
    }
    public Student(int roll, String name, double per) {
        this.roll = roll;
        this.name = name;
        this.per = per;
    }
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPer() {
        return per;

    }
    public void setPer(double per) {
        this.per = per;
    }
    @Override
    public String toString() {
        return "Students [roll=" + roll + ", name=" + name + ", per=" + per + "]";
    }
}
