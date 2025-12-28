package org.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springtest.beans.Car;
import org.springtest.beans.Student;
import org.springtest.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = (Student) container.getBean("student");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        Car car = (Car) container.getBean("car");
        System.out.println("Car Brand: " + car.getBrand());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Year: " + car.getYear());

    }
}
