import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
    //	Filter employees from the IT department who are older than 25.
        EmployeeDAO employeeDAO = new EmployeeDAO();

        List<Employee> employeesOver25=  employeeDAO.getEmployees()
                .stream()
                .filter((employee -> employee.getAge()>25 && employee.getDepartment().equals("IT")))
                .toList();
        System.out.println("Employees of IT and over 25 age:");
        employeesOver25.forEach(employee -> System.out.println(employeeDAO.getEmployeeDetails(employee)));

    //	Calculate the average salary of all employees.
        double averageSalary = employeeDAO.getEmployees()
                .stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);
        System.out.println("\nAverage Salary among 5 employees: "+averageSalary);

    //	Find the highest paid employee's details.
        Optional<Employee> highestPaidEmployee = employeeDAO.getEmployees()
                .stream()
                .max(Comparator.comparingInt(Employee::getSalary));
        highestPaidEmployee.ifPresent(employee -> System.out.println("\nHighest paid employee: \n" + employee));

    //	Sort employees by age in ascending order
        List<Employee> employeeSorted=  employeeDAO.getEmployees()
                .stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .toList();
        System.out.println("\nEmployees' Age sorted by ascending order:");
        employeeSorted.forEach(employee -> System.out.println(employeeDAO.getEmployeeDetails(employee)));

//        and then by salary in descending order.
        employeeSorted = employeeDAO.getEmployees()
                .stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .toList();
        System.out.println("\nEmployees' Salary sorted by descending order:");
        employeeSorted.forEach(employee -> System.out.println(employeeDAO.getEmployeeDetails(employee)));
    }
}