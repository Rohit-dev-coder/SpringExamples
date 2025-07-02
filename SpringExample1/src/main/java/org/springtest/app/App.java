package org.springtest.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springtest.beans.Programmer;
import org.springtest.beans.Student;

public class App {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("beanconf.xml");
        Student st = (Student) container.getBean("stdObj");
        System.out.println("Name: " + st.getName());
        System.out.println("Roll no: " + st.getRollNo());
        System.out.println("Subjects: ");
        for (String subject : st.getSubjects()) {
            System.out.println(subject);
        }

        System.out.println("---------------------------------");

        Student st2 = (Student) container.getBean("stdObj2");
        System.out.println("Name: " + st2.getName());
        System.out.println("Roll no: " + st2.getRollNo());

        System.out.println("---------------------------------");

        Programmer p = container.getBean(Programmer.class);
        System.out.println("Programmer's Name: " + p.getName());
        System.out.println("Programmer's Laptop Name: " + p.getComputer().getBrand());
        p.writeCode();

        System.out.println("---------------------------------");
    }
}
