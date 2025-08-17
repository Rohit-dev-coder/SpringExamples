package org.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springtest.beans.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext container = new ClassPathXmlApplicationContext("Configurations.xml");

        Customer cus1 = (Customer) container.getBean("cus1");
        System.out.println(cus1);

        Customer cus2 = (Customer) container.getBean("cus2");
        System.out.println(cus2);

        Customer cus3 = (Customer) container.getBean("cus3");
        System.out.println(cus3);
    }
}
