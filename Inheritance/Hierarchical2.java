class Employee {
    String name;
    String employeeId;
    double salary;

    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String displayInfo() {
        return "Name: " + name + ", ID: " + employeeId + ", Salary: " + salary;
    }
}

class PermanentEmployee extends Employee {
    double bonusPercentage;

    public PermanentEmployee(String name, String employeeId, double salary, double bonusPercentage) {
        super(name, employeeId, salary);
        this.bonusPercentage = bonusPercentage;
    }

    public double calculateAnnualBonus() {
        return salary * (bonusPercentage / 100);
    }

    public double calculateTax() {
        if (salary <= 50000) {
            return salary * 0.1; // 10% tax
        } else if (salary <= 100000) {
            return salary * 0.2; // 20% tax
        } else {
            return salary * 0.3; // 30% tax
        }
    }

 
    public String displayInfo() {
        return super.displayInfo() + ", Annual Bonus: " + calculateAnnualBonus() + ", Tax: " + calculateTax();
    }
}

class ContractEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    public ContractEmployee(String name, String employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId, hourlyRate * hoursWorked);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

   
    public String displayInfo() {
        return super.displayInfo() + ", Contract Employee Salary: " + salary;
    }
}

public class Main {
    public static void main(String[] args) {
        PermanentEmployee permEmp = new PermanentEmployee("John", "P123", 70000, 10);
        ContractEmployee contractEmp = new ContractEmployee("Jane", "C456", 50, 160);

        System.out.println(permEmp.displayInfo());
        System.out.println(contractEmp.displayInfo());
    }
}
