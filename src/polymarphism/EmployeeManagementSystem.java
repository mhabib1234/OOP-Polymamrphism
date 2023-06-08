package polymarphism;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.List;


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create a list to store employees
        List<Employee> employees = new ArrayList<>();

        // Add different types of employees to the list
        employees.add(new FullTimeEmployee(1, "John", 5000, 20, 200));
        employees.add(new PartTimeEmployee(2, "Mary", 15, 40));
        employees.add(new ContractEmployee(3, "Mike", 6, 25));

        // Calculate and display salaries for all employees
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println("Calculated Salary: $" + employee.calculateSalary());
            System.out.println();
        }
    }
}
