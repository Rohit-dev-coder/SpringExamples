package org.springtest;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springtest.beans.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car = (Car) container.getBean("car1");
        System.out.println("Car model: " + car.getModel());

        Car car2 = (Car) container.getBean("car2");
        System.out.println("Car model: " + car2.getModel());
        car2.destroy(); // Explicitly call destroy method since it is not managed by Spring container

        // Close the container to trigger @PreDestroy
        container.close();
    }
}
