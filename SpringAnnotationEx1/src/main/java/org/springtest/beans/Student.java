package org.springtest.beans;

import org.springframework.stereotype.Component;

@Component
public class Student {

    public Student(){
        System.out.println("Student constructor called");
    }

    public void sayHello() {
        System.out.println("Hello from Student!");
    }
}
