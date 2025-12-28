package com.springTest.SpringJPAEx1;

import com.springTest.SpringJPAEx1.models.Student;
import com.springTest.SpringJPAEx1.services.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJpaEx1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext container = SpringApplication.run(SpringJpaEx1Application.class, args);
        StudentService serv = container.getBean(StudentService.class);
        Student s1 = new Student();
        s1.setRoll(101);
        s1.setName("Lalit");
        s1.setPer(78.9);
        Student s2 = new Student();
        s2.setRoll(102);
        s2.setName("Mayank");
        s2.setPer(64.2);
        serv.saveStudent(s1);
        serv.saveStudent(s2);
        Student searchedStudent = serv.getStudent(101);
        System.out.println(searchedStudent);
        searchedStudent = serv.getStudent(102);
        System.out.println(searchedStudent);
    }

}
