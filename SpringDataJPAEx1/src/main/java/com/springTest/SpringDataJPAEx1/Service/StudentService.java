package com.springTest.SpringDataJPAEx1.Service;

import com.springTest.SpringDataJPAEx1.Models.Student;
import com.springTest.SpringDataJPAEx1.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
        System.out.println("Injected Repo class name:"+this.studentRepository.getClass().getName());

    }

    public void saveStudent(Student s){
        studentRepository.save(s);
    }

    public boolean deleteStudentById(Integer id){
        if(studentRepository.existsById(id)){
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public boolean deleteAll() {
        boolean result=true;
        try {
            studentRepository.deleteAll();
        }catch (DataAccessException e) {
            result=false;
        }finally {
            return result;
        }
    }


    public void saveAllStudent(List<Student> studentList) {
        studentRepository.saveAll(studentList);
    }

    public Optional<Student> findStudentById(Integer id){
        return studentRepository.findById(id);
    }

    public Iterable<Student> findAllStudents(){
        return studentRepository.findAll();
    }

    public long getTotalStudent(){
        return studentRepository.count();
    }
}
