package com.springtest.springbootbanner.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner executed!");
        System.out.println("Non-option arguments: " + args.getNonOptionArgs());
        System.out.println("Option names: " + args.getOptionNames());
        for (String name : args.getOptionNames()) {
            System.out.println("Arg " + name + ": " + args.getOptionValues(name));
        }
    }
}
