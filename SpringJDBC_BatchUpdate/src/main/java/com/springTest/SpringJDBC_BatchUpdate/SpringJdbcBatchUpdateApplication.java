package com.springTest.SpringJDBC_BatchUpdate;

import com.springTest.SpringJDBC_BatchUpdate.models.Student;
import com.springTest.SpringJDBC_BatchUpdate.services.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringJdbcBatchUpdateApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringJdbcBatchUpdateApplication.class, args);
		StudentService service=container.getBean(StudentService.class);
		List<Student> studentList=new ArrayList<>();
		Scanner kb=new Scanner(System.in);
		String choice;
		do{
			System.out.println("Enter roll,name and per");
			int roll=kb.nextInt();
			String name=kb.next();
			double per=kb.nextDouble();
			Student s=new Student();
			s.setRoll(roll);
			s.setName(name);
			s.setPer(per);
			studentList.add(s);
			int c = service.rollNumExist(roll);
			if (c == -1) {
				studentList.remove(s);
			}
			System.out.println("Any more ?");
			choice=kb.next();
		}while(choice.equals("yes"));
		int[]result=service.addAllStudents(studentList);
		for(int r:result) {
			System.out.println("Inserted:"+r);
		}
		service.printAllStudents();
	}
}
