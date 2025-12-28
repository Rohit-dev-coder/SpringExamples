package com.springTest.springjdbcEx2_mysql.services;


import com.springTest.springjdbcEx2_mysql.models.Student;
import com.springTest.springjdbcEx2_mysql.repository.StudentRepository;
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

    public void addStudent(Student s) {
        repo.save(s);
    }

    public int getCount() {
        return repo.getCount();
    }

    public String findById(int roll) {
        return repo.findById(roll);
    }

    public Student findStudentById(int roll) {
        return repo.findStudentById(roll);
    }

    public void deleteAllStudents() {
        repo.deleteAll();
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public List<Student> getAllStudents2(){
        return repo.findAll2();
    }
}
