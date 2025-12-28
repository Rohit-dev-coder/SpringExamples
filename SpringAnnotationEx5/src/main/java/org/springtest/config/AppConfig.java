package org.springtest.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.springtest.beans")
@PropertySource("classpath:application.properties")
public class AppConfig {

}
