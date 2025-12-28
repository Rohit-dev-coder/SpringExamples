package com.springTest.SpringJDBC_BatchUpdate.repository;

import com.springTest.SpringJDBC_BatchUpdate.models.Student;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentBatchSetter implements BatchPreparedStatementSetter {

    private List<Student> studentList;

    public StudentBatchSetter(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public void setValues(PreparedStatement ps, int i) throws SQLException {
        Student st=studentList.get(i);
        ps.setInt(1, st.getRoll());
        ps.setString(2, st.getName());
        ps.setDouble(3, st.getPer());
    }
    @Override
    public int getBatchSize() {
        return studentList.size();
    }

}
