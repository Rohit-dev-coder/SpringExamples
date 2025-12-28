package springTest.springjdbc_CRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springTest.springjdbc_CRUD.services.EmployeeService;

@SpringBootApplication
public class SpringjdbcCrudApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringjdbcCrudApplication.class, args);
		EmployeeService employeeService = context.getBean(EmployeeService.class);
		employeeService.run();
	}

}
