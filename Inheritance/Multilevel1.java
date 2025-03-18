class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String displayInfo() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Employee extends Person {
    String employeeId;
    double baseSalary;

    public Employee(String name, int age, String employeeId, double baseSalary) {
        super(name, age);
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

   
    public String displayInfo() {
        return super.displayInfo() + ", Employee ID: " + employeeId + ", Base Salary: " + baseSalary;
    }
}

class Manager extends Employee {
    double bonusPercentage;

    public Manager(String name, int age, String employeeId, double baseSalary, double bonusPercentage) {
        super(name, age, employeeId, baseSalary);
        this.bonusPercentage = bonusPercentage;
    }

    
    public double calculateSalary() {
        return super.calculateSalary() + (super.calculateSalary() * bonusPercentage / 100);
    }

 
    public String displayInfo() {
        return super.displayInfo() + ", Total Salary (with bonus): " + calculateSalary();
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 35, "M1001", 60000, 15);
        System.out.println(manager.displayInfo());
    }
}
