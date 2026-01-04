package com.springTest.SpringDataJPAEx1.repository;

import com.springTest.SpringDataJPAEx1.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
