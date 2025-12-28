package com.springTest.SpringJPAEx1.repository;

import com.springTest.SpringJPAEx1.models.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class StudentRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public StudentRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void saveStudent(Student s) {
        entityManager.persist(s);
    }

    public Student findStudentByRoll(Integer roll) {
        return entityManager.find(Student.class, roll);
    }

}
