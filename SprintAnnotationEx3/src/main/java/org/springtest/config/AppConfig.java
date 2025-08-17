package org.springtest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springtest.beans.Car;
import org.springtest.beans.Student;

@Configuration
public class AppConfig {

    @Bean
    public Student student() {
        return new Student("John Doe", 20);
    }

    @Bean
    public Car car() {
        return new Car("Toyota", "Corolla", 2020);
    }
}
