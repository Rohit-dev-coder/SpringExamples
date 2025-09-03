package com.springtest.springjdbcEx1;

import com.springtest.springjdbcEx1.models.Student;
import com.springtest.springjdbcEx1.services.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class SpringjdbcEx1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(SpringjdbcEx1Application.class, args);
//        Student s = container.getBean(Student.class);
//        s.setRoll(101);
//        s.setName("Ravi");
//        s.setPer(68.9);
//        StudentService service = container.getBean(StudentService.class);
//        service.addStudent(s);

        StudentService service = container.getBean(StudentService.class);
        Scanner kb = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Enter roll,name and per");
            int roll = kb.nextInt();
            String name = kb.next();
            double per = kb.nextDouble();
            Student s = container.getBean(Student.class);
            s.setRoll(roll);
            s.setName(name);
            s.setPer(per);
            service.addStudent(s);
            System.out.println("Any more ?");
            choice = kb.next();
        } while (choice.equals("yes"));

        System.out.println("Total rec inserted:" + service.getCount());
        System.out.println("Enter roll to search");

        int roll = kb.nextInt();
        String name = service.findById(roll);
        Student std = service.findStudentById(roll);
        if (name == null) {
            System.out.println("No record found!");
        } else {
            System.out.println("Name is " + name);
            System.out.println("Student is " + std);
        }
        service.deleteAllStudents();
        service.findById(2);

    }
}
