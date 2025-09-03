package com.springtest.springjdbcEx1.repository;

import com.springtest.springjdbcEx1.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    /* JdbcTemplate is a Spring class that simplifies JDBC operations.
       It handles the creation and release of resources, which helps to avoid common errors such as forgetting to close database connections.
       It also provides methods for executing SQL queries, updates, and for retrieving results.
    */
    private JdbcTemplate jdbcTemplate;

    /*
         The @Autowired annotation is used for automatic dependency injection.
         In this case, it tells Spring to inject an instance of JdbcTemplate into the StudentRepository class when it is created.
         This allows the StudentRepository to use the JdbcTemplate for database operations without having to manually create an instance of it.
     */
    @Autowired
    public StudentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student s) {
        String sql = "Insert into Students values(?,?,?)";
        int count = jdbcTemplate.update(sql, s.getRoll(), s.getName(), s.getPer());
        System.out.println("rec inserted:" + count);
    }

    public int getCount() {
        String sql = "Select count(*) from Students";
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    public String findById(int roll) {
        String name = "";
        String sql = "Select name from Students where roll=?";
        try {
            name = jdbcTemplate.queryForObject(sql, String.class, roll);
        } catch (EmptyResultDataAccessException ex) {
            System.out.println("No record found!");
            name = null;
        } finally {
            return name;
        }
    }

    public Student findStudentById(int roll){
        Student s = null;
        String sql = "Select * from Students where roll=?";
        try {
            s = jdbcTemplate.queryForObject(sql, (rs, rowNum) -> new Student(
                    rs.getInt("roll"),
                    rs.getString("name"),
                    rs.getDouble("per")
            ), roll);
        } catch (EmptyResultDataAccessException ex) {
            s = null;
        } finally {
            return s;
        }
    }

    public void deleteAll(){
        String sql = "Delete from Students";
        int count = jdbcTemplate.update(sql);
        System.out.println("rec deleted:" + count);
    }

}
