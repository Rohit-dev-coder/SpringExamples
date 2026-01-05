package com.springTest.SpringDataJPA_Rel_Ex2;

import com.springTest.SpringDataJPA_Rel_Ex2.models.User;
import com.springTest.SpringDataJPA_Rel_Ex2.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaRelEx2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpaRelEx2Application.class, args);
		UserService serv=container.getBean(UserService.class);
//		User user = serv.createUserWithProfile("Ajay", "SDE with experience of 3 years");
//		System.out.println("User created with ID: " + user.getId());
//		Optional<User> result1 = serv.findUserById(user.getId());
//		System.out.println("Getting data from User");
//		if (result1.isPresent()) {
//			User retrievedUser=result1.get();
//			System.out.println("User Name: " + retrievedUser.getName());
//			System.out.println("User Profile Bio: " + 		retrievedUser.getProfile().getBio());
//		} else {
//			System.out.println("User not found.");
//		}
		Optional<User> userById = serv.findUserByName("Ajay");
		userById.ifPresentOrElse(
				(s) -> System.out.println(s),
				() -> System.out.println("User not present")
		);
	}

}
