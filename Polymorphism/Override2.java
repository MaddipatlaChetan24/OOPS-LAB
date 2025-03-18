class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateBonus() {
        return salary * 0.05; // 5% bonus for employees
    }

    public void displayDetails() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Bonus: $" + calculateBonus());
    }
}

class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

  
    public double calculateBonus() {
        return getSalary() * 0.10; // 10% bonus for managers
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Manager gets a higher bonus!");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000);
        Manager mgr = new Manager("Bob", 70000);

        emp.displayDetails();  
        System.out.println();
        mgr.displayDetails(); 
    }
}

