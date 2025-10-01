package com.springTest.SpringJPAEx2.models;

import jakarta.persistence.*;

@Entity
@Table (name = "student1", uniqueConstraints = {
        @UniqueConstraint(name = "name_uc", columnNames = "name")
})
public class Student {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int roll;
    private String name;
    @Column(name = "percentage", nullable = false)
    private double per;

    public Student() {
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
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", per=" + per +
                '}';

    }
}