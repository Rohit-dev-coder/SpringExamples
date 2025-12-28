package org.springtest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springtest.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.springtest.beans");
//        context.register(Student.class);
//        context.refresh();
        Student student = (Student) context.getBean("student");
        student.sayHello();


    }
}
