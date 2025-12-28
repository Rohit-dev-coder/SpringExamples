package com.springTest.SpringJPAEx2.services;

import com.springTest.SpringJPAEx2.models.Student;
import com.springTest.SpringJPAEx2.repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepo repo;

    public StudentService(StudentRepo StudentRepo) {
        this.repo = StudentRepo;
    }

    public void saveStudent(Student s) {
        repo.saveStudent(s);
    }
    public Student getStudent(Integer roll) {
        return repo.findStudentByRoll(roll);
    }

    public List<Student> getAllStudents() {
        return repo.findAllStudents();
    }

    public void deleteStudent(Integer roll) {
        repo.deleteStudent(roll);
    }

    public void showAllStudents(){
        repo.showAllStudents();
    }

    public void showStudentByName(String name){
        repo.showStudentByName(name);
    }

}
