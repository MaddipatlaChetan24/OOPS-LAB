abstract class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

   
    public double calculateSalary() {
        return getBaseSalary(); 
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("John", 5000);
        Employee partTimeEmployee = new PartTimeEmployee("Jane", 3000, 50, 20);

        System.out.println(fullTimeEmployee.getName() + " Salary: $" + fullTimeEmployee.calculateSalary());
        System.out.println(partTimeEmployee.getName() + " Salary: $" + partTimeEmployee.calculateSalary());
    }
}

