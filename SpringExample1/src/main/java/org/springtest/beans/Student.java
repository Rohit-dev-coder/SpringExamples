package org.springtest.beans;

public class Student {
    private String name;
    private int rollNo;
    private String [] subjects;
    private String collegeName;


    public Student() {
        super();
        System.out.println("Creating Student Object...");
    }

    public Student(String collegeName){
        super();
        this.collegeName = collegeName;
        System.out.println("Creating Student Object with College Name: " + collegeName);
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        System.out.println("Setting Roll No: " + rollNo);
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

}
