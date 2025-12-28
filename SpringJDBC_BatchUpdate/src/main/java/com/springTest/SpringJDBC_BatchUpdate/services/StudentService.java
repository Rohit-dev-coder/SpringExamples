package com.springTest.SpringJDBC_BatchUpdate.services;

import com.springTest.SpringJDBC_BatchUpdate.models.Student;
import com.springTest.SpringJDBC_BatchUpdate.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository repo;

    @Autowired
    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public void addStudent() {
        repo.save();
    }

    public int[] addAllStudents(List<Student> studentList) {
        return repo.save(studentList);
    }


    public int rollNumExist(int roll) {
        return repo.rollNumExist(roll);
    }

    public void printAllStudents() {
        repo.printAllStudents();
    }
}
