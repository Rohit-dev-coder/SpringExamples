package org.springtest.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springtest.beans.Car;
import org.springtest.beans.Person;

@Configuration
public class AppConfig {

    @Bean
    public Car car(){
        System.out.println("Creating Car Bean");
        return new Car("Toyota", "Camry", 2020);
    }

    //Directly injecting car bean into person bean
//    @Bean
//    public Person person(){
//        return new Person("John Doe", 30, car());
//    }

    //Using method parameter to inject car bean into person bean
    @Bean
    @Lazy // Person bean will be created only when it is requested
    public Person person(Car car){
        System.out.println("Creating Person Bean");
        return new Person("John Doe", 30, car);
    }

}
