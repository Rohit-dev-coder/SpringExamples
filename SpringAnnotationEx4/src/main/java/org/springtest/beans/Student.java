package org.springtest.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("Julia")
    private String name;
    @Value("27")
    private int age;

    public Student() {
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Value("John")
    public void setName(String name) {
        this.name = name;
        System.out.println("setName called with: " + name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Value("John2")
    public void setDetails(String name, @Value("2") int age) {
        this.name = name;
        this.age = age;
        System.out.println("setDetails called with: " + name + ", age: " + age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
