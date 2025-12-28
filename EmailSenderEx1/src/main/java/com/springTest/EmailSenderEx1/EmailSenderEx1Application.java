package com.springTest.EmailSenderEx1;

import com.springTest.EmailSenderEx1.Component.EmailService;
import com.springTest.EmailSenderEx1.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class EmailSenderEx1Application {

	public static void main(String[] args) {
//		SpringApplication.run(EmailSenderEx1Application.class, args);
		ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
		EmailService emailService = (EmailService) container.getBean("emailService");
		emailService.sendMail();
//		System.out.println(person);
	}

}
