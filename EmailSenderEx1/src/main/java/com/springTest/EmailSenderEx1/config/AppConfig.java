package com.springTest.EmailSenderEx1.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.springTest.EmailSenderEx1.beans", "com.springTest.EmailSenderEx1.Component"})
public class AppConfig {

}
