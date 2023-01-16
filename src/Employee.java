public class Employee {

    private String name;
    private int department;
    private double salary;
    private int id;
    private static int counter = 1;

    public Employee(String name, int department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }
    public String getName() {
        return name;
    }
    public int getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }

    public String toString() {
        return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + ", id=" + id + "]";
    }

}


