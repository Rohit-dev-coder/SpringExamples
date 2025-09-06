package com.springTest.springjdbcEx2_mysql.repository;

import com.springTest.springjdbcEx2_mysql.models.Student;
import org.springframework.jdbc.core.RowMapper;


public class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
        return new Student(
                rs.getInt("roll"),
                rs.getString("name"),
                rs.getDouble("per")
        );
    }

}
