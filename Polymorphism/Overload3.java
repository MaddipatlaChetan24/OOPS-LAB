class Employee {

    private String name;
    private double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

 
    public double calculateSalary() {
        return basicSalary;
    }

    
    public double calculateSalary(double taxPercentage) {
        return basicSalary - (basicSalary * taxPercentage / 100);
    }

 
    public double calculateSalary(double taxPercentage, double bonus) {
        return basicSalary - (basicSalary * taxPercentage / 100) + bonus;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 50000);
        
       
        System.out.println(emp1.getName() + "'s Salary: " + emp1.calculateSalary());
        
      
        System.out.println(emp1.getName() + "'s Salary after 10% tax: " + emp1.calculateSalary(10));
        
     
        System.out.println(emp1.getName() + "'s Salary after 10% tax and $500 bonus: " + emp1.calculateSalary(10, 500));
    }
}

