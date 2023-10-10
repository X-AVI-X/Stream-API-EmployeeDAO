import java.util.List;

public interface EmployeeOperations {
    default String getEmployeeDetails(Employee employee){
        return employee.toString();
    }
}
