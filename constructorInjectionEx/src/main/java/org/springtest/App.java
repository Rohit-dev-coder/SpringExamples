package org.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springtest.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext container = new ClassPathXmlApplicationContext("beanConfig.xml");
        Student student = container.getBean(Student.class);
        System.out.println("Roll: " + student.getRoll());
        System.out.println("Name: " + student.getName());
        System.out.println("Address: ");
        System.out.println("House No: " + student.getAddress().getHouseNo());
        System.out.println("Locality: " + student.getAddress().getLocality());
        System.out.println("City: " + student.getAddress().getCity());

    }
}
