package org.springtest.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Value("Rohit")
    private String name;
    @Value("26")
    private int age;
//    @Autowired
    private Car car;

    public Person() {
        System.out.println("Person object created - default constructor");
    }

    @Autowired // if a class has only one constructor, @Autowired is optional
    public Person(Car car) {
        this.car = car;
        System.out.println("Person object created - single parameter constructor");
    }

    public Person(@Value("Rohit") String name,@Value("26") int age, Car car) {
        this.name = name;
        this.age = age;
        System.out.println("Person object created - parameterized constructor");
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

    public Car getCar() {
        return car;
    }

//    @Autowired
    public void setCar(Car car) {
        this.car = car;
        System.out.println("Car object injected into Person - setter method");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }

}
