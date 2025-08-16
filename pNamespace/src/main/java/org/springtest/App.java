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
        ApplicationContext container = new ClassPathXmlApplicationContext("beanConfig.xml");
        Student s = (Student) container.getBean("stdObj");
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("------------------------");

        Student s2 = (Student) container.getBean("stdObj2");
        System.out.println("Name: " + s2.getName());
        System.out.println("Age: " + s2.getAge());
        System.out.printf("Address: %s, %s, %s%n",
                          s2.getAddress().getStreet(),
                          s2.getAddress().getCity(),
                          s2.getAddress().getZipCode());
    }
}
