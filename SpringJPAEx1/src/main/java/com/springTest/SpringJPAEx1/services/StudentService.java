package com.springTest.SpringJPAEx1.services;

import com.springTest.SpringJPAEx1.models.Student;
import com.springTest.SpringJPAEx1.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository repo;

    public StudentService(StudentRepository studentRepository) {
        this.repo = studentRepository;
    }

    public void saveStudent(Student s) {
        repo.saveStudent(s);
    }
    public Student getStudent(Integer roll) {
        return repo.findStudentByRoll(roll);
    }


}
