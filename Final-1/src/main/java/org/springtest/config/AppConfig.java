package org.springtest.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.springtest.beans")
public class AppConfig {
}
