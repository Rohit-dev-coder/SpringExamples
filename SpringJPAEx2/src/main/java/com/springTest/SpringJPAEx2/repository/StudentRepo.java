package com.springTest.SpringJPAEx2.repository;

import com.springTest.SpringJPAEx2.models.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class StudentRepo {

    @PersistenceContext
    private EntityManager entityManager;

    public StudentRepo(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void saveStudent(Student s) {
        entityManager.persist(s);
    }

    public Student findStudentByRoll(Integer roll) {
        return entityManager.find(Student.class, roll);
    }

    public List<Student> findAllStudents() {
        String jpql = "SELECT s FROM Student s";
        return entityManager.createQuery(jpql, Student.class).getResultList();
    }

    public void deleteStudent(Integer roll) {
        Student s = entityManager.find(Student.class, roll);
        if (s != null) {
            entityManager.remove(s);
        }
    }

    public void showAllStudents(){
        String jpql = "Select * from student1";
        Query q = entityManager.createNativeQuery(jpql);
        List<Object[]> resultList = q.getResultList();
        for(Object[] o: resultList){
            System.out.println(o[0] + " " + o[1] + " " + o[2]);
        }
    }

    public void showStudentByName(String name){
        String jpql = "Select * from student1 where name = :name";
        Query q = entityManager.createNativeQuery(jpql, Student.class);
        q.setParameter("name", name);
        List<Student> resultList = q.getResultList();
        for(Student s: resultList) {
            System.out.println(s);
        }

    }

}
