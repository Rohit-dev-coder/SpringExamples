package springTest.springjdbc_CRUD.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springTest.springjdbc_CRUD.models.Employee;
import springTest.springjdbc_CRUD.repository.EmployeeRepository;

import java.util.List;
import java.util.Scanner;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;
    private Scanner scanner = new Scanner(System.in);

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void run() {
        while (true) {
            System.out.println("\n1. Create Employee");
            System.out.println("2. Read Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter option: ");

            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1 -> createEmployee();
                case 2 -> readEmployees();
                case 3 -> updateEmployee();
                case 4 -> deleteEmployee();
                case 5 -> { System.exit(0); }
                default -> System.out.println("Invalid option!");
            }
        }
    }

    private void createEmployee() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Department: ");
        String dept = scanner.nextLine();
        System.out.print("Salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        employeeRepository.create(new Employee(0, name, dept, salary));
        System.out.println("Employee created!");
    }

    private void readEmployees() {
        List<Employee> employees = employeeRepository.readAll();
        employees.forEach(emp -> System.out.printf("%d | %s | %s | %.2f%n",
                emp.getId(), emp.getName(), emp.getDepartment(), emp.getSalary()));
    }

    private void updateEmployee() {
        System.out.print("Employee ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("New Name: ");
        String name = scanner.nextLine();
        System.out.print("New Department: ");
        String dept = scanner.nextLine();
        System.out.print("New Salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        employeeRepository.update(new Employee(id, name, dept, salary));
        System.out.println("Employee updated!");
    }

    private void deleteEmployee() {
        System.out.print("Employee ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());

        employeeRepository.delete(id);
        System.out.println("Employee deleted!");
    }
}
