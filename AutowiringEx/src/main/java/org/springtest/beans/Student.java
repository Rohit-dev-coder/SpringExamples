package org.springtest.beans;

public class Student {
    private String name;
    private int age;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    public void backpack() {
        System.out.println(name + " is packing their backpack.");
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + '}';
    }
}
