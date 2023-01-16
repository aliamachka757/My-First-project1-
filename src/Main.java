public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("John Doe", 1, 50000);
        employees[1] = new Employee("Jane Smith", 2, 60000);
        employees[2] = new Employee("Bob Smith", 3, 55000);
        employees[3] = new Employee("Mary Johnson", 4, 65000);
        employees[4] = new Employee("Mike Williams", 5, 75000);

        printAllEmployees(employees);
        printAllEmployees(employees);
        System.out.println("Average Salary: " + averageSalary(employees));
        System.out.println("Min Salary : " + findMinSalaryEmployee(employees));
        System.out.println("Max Salary:"+findMaxSalaryEmployee(employees));
    }


    public static void printAllEmployees(Employee[] employees) {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e.toString());
            }
        }
    }
    public static Employee findMinSalaryEmployee(Employee[] employees) {
        Employee minSalaryEmployee = null;
        double minSalary = Double.MAX_VALUE;
        for (Employee e : employees) {
            if (e != null && e.getSalary() < minSalary) {
                minSalary = e.getSalary();
                minSalaryEmployee = e;
            }
        }
        return minSalaryEmployee;
    }


    public static Employee findMaxSalaryEmployee(Employee[] employees) {
        Employee maxSalaryEmployee = null;
        double maxSalary = Double.MIN_VALUE;
        for (Employee e : employees) {
            if (e != null && e.getSalary() > maxSalary) {
                maxSalary = e.getSalary();
                maxSalaryEmployee = e;
            }
        }
        return maxSalaryEmployee;
    }
    public static double averageSalary(Employee[] employees) {
        double sum = 0;
        int count = 0;
        for (Employee e : employees) {
            if (e != null) {
                sum += e.getSalary();
                count++;
            }
        }
        return sum / count;
    }


}







