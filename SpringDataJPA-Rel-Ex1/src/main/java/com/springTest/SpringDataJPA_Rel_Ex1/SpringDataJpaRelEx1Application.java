package com.springTest.SpringDataJPA_Rel_Ex1;

import com.springTest.SpringDataJPA_Rel_Ex1.models.Profile;
import com.springTest.SpringDataJPA_Rel_Ex1.models.User;
import com.springTest.SpringDataJPA_Rel_Ex1.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaRelEx1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpaRelEx1Application.class, args);
		UserService userService = container.getBean(UserService.class);

		Profile profile1 = new Profile();
		profile1.setBio("He is a Tester");
		User user1 = new User();
		user1.setName("Aman");
		user1.setProfile(profile1);
		userService.AddUser(user1);

		Optional<User> userById = userService.findUserById(2);
		userById.ifPresentOrElse(
				(s) -> System.out.println(s),
				() -> System.out.println("Not present")
		);
	}

}
