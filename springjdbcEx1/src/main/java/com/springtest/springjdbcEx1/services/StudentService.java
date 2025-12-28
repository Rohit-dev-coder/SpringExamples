package com.springtest.springjdbcEx1.services;

import com.springtest.springjdbcEx1.models.Student;
import com.springtest.springjdbcEx1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
