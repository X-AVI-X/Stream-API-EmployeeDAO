import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO implements EmployeeOperations{
    private List<Employee> employees;

    public EmployeeDAO() {
        this.employees = new ArrayList<>();
        employees.add(new Employee("John Snow",(short)24,"IT", 50000));
        employees.add(new Employee("Mark Zuck",(short)30,"IT", 100000));
        employees.add(new Employee("Steve Dickson",(short)24,"HR", 30000));
        employees.add(new Employee("Daenerys Targaryen",(short)23,"Management", 150000));
        employees.add(new Employee("Ana De Armas", (short)26, "Marketing", 80000));
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployee(List<Employee> employees) {
        this.employees = employees;
    }
}
