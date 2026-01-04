package com.springTest.SpringDataJPAEx1;

import com.springTest.SpringDataJPAEx1.models.Student;
import com.springTest.SpringDataJPAEx1.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaEx1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpaEx1Application.class, args);
//		Student s1 = new Student();
//		s1.setName("Ronak");
//		s1.setPer(80.8);
//		Student s2 = new Student();
//		s2.setName("Rohan");
//		s2.setPer(56.9);
//		List<Student> studentList = List.of(s1,s2);
		StudentService studentService = container.getBean(StudentService.class);
//		studentService.saveAllStudent(studentList);
//		studentService.saveStudent(s1);
//		studentService.deleteStudentById(1);
//		studentService.deleteStudentById(2);
		Optional<Student> result = studentService.findStudentById(53);
//		if (result.isPresent()){
//			Student student = result.get();
//			System.out.println(student);
//		}else{
//			System.out.println("Student not present");
//		}

		result.ifPresentOrElse(
				(student) -> System.out.println(student),
				() -> System.out.println("Record not found")
		);

		System.out.println("Total Number of Student: " + studentService.getTotalStudent());

//		Iterable<Student> allStudents = studentService.findAllStudents();
//		for(Student s: allStudents){
//			System.out.println(s);
//		}

	}

}
