package org.springtest.beans;

public class Programmer {
    private String name;
    private Computer computer;

    public Programmer() {
        super();
        System.out.println("Creating Programmer Object...");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        System.out.println("Setting Programmer Name: " + name);
        this.name = name;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        System.out.println("Setting Programmer Computer: " + computer.getBrand());
        this.computer = computer;
    }

    public void writeCode(){
        boolean isStarted = computer.start();
        if (isStarted) {
            System.out.println(name + " is writing code on " + computer.getBrand() + " computer.");
        } else {
            System.out.println(name + "'s computer failed to start.");
        }
    }
}
