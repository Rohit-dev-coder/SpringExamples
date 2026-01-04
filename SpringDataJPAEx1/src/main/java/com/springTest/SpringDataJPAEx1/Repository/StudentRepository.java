package com.springTest.SpringDataJPAEx1.Repository;

import com.springTest.SpringDataJPAEx1.Models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
