package org.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        System.out.println(student);
    }
}
