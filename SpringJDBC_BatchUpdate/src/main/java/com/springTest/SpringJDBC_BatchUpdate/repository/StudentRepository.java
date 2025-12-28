package com.springTest.SpringJDBC_BatchUpdate.repository;

import com.springTest.SpringJDBC_BatchUpdate.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate nmTemp;

    @Autowired
    public StudentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;

    }

    @Autowired
    public StudentRepository(NamedParameterJdbcTemplate nmTemp) {
        this.nmTemp = nmTemp;
    }


    public void save() {
        String sql1 = "Insert into Students values(1001,'Ravi',67.8)";
        String sql2 = "Insert into Students values(1002,'Jai',54.2)";
        String sql3 = "Insert into Students values(1003,'Pawan',87.1)";

        int[] results = jdbcTemplate.batchUpdate(sql1, sql2, sql3);

        for (int r : results) {
            System.out.println("rec ins:" + r);
        }
    }

    public int[] save(List<Student> studentList) {
        String sql="Insert into Students values(?,?,?)";
        int[]results;
        results=jdbcTemplate.batchUpdate(sql, new StudentBatchSetter(studentList));
        return results;
    }

//    public int[] save(List<Student>studentList) {
//        String sql="Insert into Students values(:roll,:name,:per)";
//        MapSqlParameterSource[] batch = new
//                MapSqlParameterSource[studentList.size()];
//        for(int i=0;i<studentList.size();i++) {
//            MapSqlParameterSource obj=new MapSqlParameterSource();
//            Student st=studentList.get(i);
//            obj.addValue("roll", st.getRoll());
//            obj.addValue("name", st.getName());
//            obj.addValue("per", st.getPer());
//            batch[i]=obj;
//        }
//        int[]results=nmTemp.batchUpdate(sql, batch);
//        return results;
//    }

    public int rollNumExist(int roll) {
        String sql="Select count(*) from Students where roll=?";
        int count=jdbcTemplate.queryForObject(sql, Integer.class, roll);
        if(count>0) {
            System.out.println("Roll num already exist");
            return -1;
        }else {
            System.out.println("You can proceed");
            return 1;
        }
    }

    public void printAllStudents() {
        String sql="Select * from Students";
        List<Student> studentList=jdbcTemplate.query(sql, (rs, rowNum) -> {
            Student s=new Student();
            s.setRoll(rs.getInt("roll"));
            s.setName(rs.getString("name"));
            s.setPer(rs.getDouble("per"));
            return s;
        });
        for(Student s:studentList) {
            System.out.println(s.getRoll()+" "+s.getName()+" "+s.getPer());
        }
    }
}
