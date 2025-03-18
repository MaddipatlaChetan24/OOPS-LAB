class Employee {
    String name;
    String employeeId;
    String position;
    double salary;

    public Employee(String name, String employeeId, String position, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
        this.salary = salary;
    }

    public String displayInfo() {
        return "Employee Name: " + name + ", ID: " + employeeId + ", Position: " + position + ", Salary: " + salary;
    }
}

class Manager extends Employee {
    String department;
    String[] projects;

    public Manager(String name, String employeeId, String position, double salary, String department, String[] projects) {
        super(name, employeeId, position, salary);
        this.department = department;
        this.projects = projects;
    }

    public void assignProject(String project) {
        System.out.println("Assigned project: " + project + " to the team.");
    }

  
    public String displayInfo() {
        String projectList = String.join(", ", projects);
        return super.displayInfo() + ", Department: " + department + ", Projects: " + projectList;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] projects = {"Website Revamp", "App Development"};
        Manager manager = new Manager("Alice", "M1001", "Manager", 75000, "IT", projects);
        manager.assignProject("Website Revamp");
        System.out.println(manager.displayInfo());
    }
}
