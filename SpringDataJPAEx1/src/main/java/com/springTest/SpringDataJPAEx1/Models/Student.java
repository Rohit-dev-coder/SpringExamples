package com.springTest.SpringDataJPAEx1.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roll;
    private String name;
    private Double per;

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

    public Double getPer() {
        return per;
    }

    public void setPer(Double per) {
        this.per = per;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", per=" + per +
                '}';
    }
}
