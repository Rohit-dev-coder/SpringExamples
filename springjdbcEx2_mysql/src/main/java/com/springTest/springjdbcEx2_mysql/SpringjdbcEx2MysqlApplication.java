package com.springTest.springjdbcEx2_mysql;

import com.springTest.springjdbcEx2_mysql.models.Student;
import com.springTest.springjdbcEx2_mysql.services.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Random;

@SpringBootApplication
public class SpringjdbcEx2MysqlApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringjdbcEx2MysqlApplication.class, args);

		Student s = container.getBean(Student.class);
		s.setRoll(new Random().nextInt(1000));
		s.setName("John Doe" + new Random().nextInt(100));
		s.setPer(new Random().nextFloat(100));
		StudentService service = container.getBean(StudentService.class);
		service.addStudent(s);

		System.out.println("Total Students: " + service.getCount());
		for(Student student: service.getAllStudents()){
			System.out.println(student);
		}

		System.out.println("Using BeanPropertyRowMapper:");
		for(Student student: service.getAllStudents2()) {
			System.out.println(student);
		}
	}
}
