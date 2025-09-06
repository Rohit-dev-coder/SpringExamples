package springTest.springjdbc_CRUD.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import springTest.springjdbc_CRUD.models.Employee;

import java.util.List;
import java.util.Map;

@Repository
public class EmployeeRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public EmployeeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void create(Employee emp) {
        String sql = "INSERT INTO EMPLOYEES (name, department, salary) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, emp.getName(), emp.getDepartment(), emp.getSalary());
    }

    public List<Employee> readAll() {
        String sql = "SELECT * FROM EMPLOYEES";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Employee(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("department"),
                rs.getDouble("salary")
        ));
    }

    public void update(Employee emp) {
        String sql = "UPDATE EMPLOYEES SET name = ?, department = ?, salary = ? WHERE id = ?";
        jdbcTemplate.update(sql, emp.getName(), emp.getDepartment(), emp.getSalary(), emp.getId());
    }

    public void delete(int id) {
        String sql = "DELETE FROM EMPLOYEES WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }


}
