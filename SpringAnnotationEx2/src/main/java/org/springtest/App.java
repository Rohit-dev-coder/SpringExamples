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
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
        Student st = (Student) container.getBean("student");
        System.out.println("Student Name: " + st.getName());
        System.out.println("Student Age: " + st.getAge());

    }
}
