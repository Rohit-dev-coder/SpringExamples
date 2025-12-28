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
        ApplicationContext container = new ClassPathXmlApplicationContext("configuration.xml");

        Student stdObj = (Student) container.getBean("stdObj");
        System.out.println("Student Object: " + stdObj);
        System.out.println("Address: " + stdObj.hashCode());

        Student stdObj2 = (Student) container.getBean("stdObj");
        System.out.println("Student Object: " + stdObj2);
        System.out.println("Address: " + stdObj2.hashCode()); // Reference is same as stdObj


        Student stdObj3 = (Student) container.getBean("stdObj2");
        System.out.println("Student Object: " + stdObj3);
        System.out.println("Address: " + stdObj3.hashCode());

        Student stdObj4 = (Student) container.getBean("stdObj2");
        System.out.println("Student Object: " + stdObj4);
        System.out.println("Address: " + stdObj4.hashCode()); // Reference is not same as stdObj3

        Student stdObj5 = (Student) container.getBean("stdObj3");
        System.out.println("Student Object: " + stdObj5);
        System.out.println("Address: " + stdObj5.hashCode());
    }
}
