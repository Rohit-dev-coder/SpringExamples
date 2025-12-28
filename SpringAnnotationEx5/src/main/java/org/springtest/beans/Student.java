package org.springtest.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Student {

    @Value("${student.name}")
    private String name;
    @Value("${student.age}")
    private int age;
    @Value("${student.address:Unknown}")
    private String address;

    @Value("${student.subjects}")
    private String[] subjects;

    @Value("#{${student.scores}}")
    private Map<String, Integer> scores;

    public Student() {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", subjects=" + String.join(", ", subjects) +
                ", scores=" + scores +
                '}';
    }

}
