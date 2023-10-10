public class Employee{
    private String name;
    private short age;
    private String department;
    private int salary;

    public Employee(String name, short age, String department, int salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "" +
                "Name='" + name + '\'' +
                ", Age=" + age +
                ", Department='" + department + '\'' +
                ", Salary=" + salary;
    }
}
