class Employee {

    private String name;
    private String department;
    private double salary;

   
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.department = "Not assigned";
    }

   
    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
       
        Employee emp1 = new Employee("John", 50000);
        emp1.displayEmployeeDetails();
        
      
        Employee emp2 = new Employee("Alice", 60000, "Finance");
        emp2.displayEmployeeDetails();
    }
}

