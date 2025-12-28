package com.springtest.springbootbanner.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner executed!");
        System.out.println("Total arguments: " + args.length);
        for (String arg : args) {
            System.out.println("Arg: " + arg);
        }
    }
}
