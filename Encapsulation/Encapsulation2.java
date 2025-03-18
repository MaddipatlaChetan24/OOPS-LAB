
class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive.");
        }
    }

    public void increaseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
            System.out.println("Salary increased by: " + amount);
        } else {
            System.out.println("Increase amount must be positive.");
        }
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", "Manager", 60000);
        emp1.displayEmployeeInfo();
        emp1.increaseSalary(5000);
        emp1.displayEmployeeInfo();
    }
}
