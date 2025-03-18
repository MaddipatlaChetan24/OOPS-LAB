interface Person {
    void displayInfo();
}

interface Customer extends Person {
    double calculateDiscount();
}

interface Employee extends Person {
    double calculateSalary();
}

class PersonImpl implements Person {
    String name;
    int age;

    public PersonImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class EmployeeImpl extends PersonImpl implements Employee {
    String employeeId;
    double salary;

    public EmployeeImpl(String name, int age, String employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary; 
    }

   
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeId + ", Salary: " + salary);
    }
}

class CustomerImpl extends PersonImpl implements Customer {
    String customerId;
    double totalPurchases;

    public CustomerImpl(String name, int age, String customerId, double totalPurchases) {
        super(name, age);
        this.customerId = customerId;
        this.totalPurchases = totalPurchases;
    }

    public double calculateDiscount() {
        if (totalPurchases > 1000) {
            return 0.10; 
        }
        return 0.05; 
    }

 
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Customer ID: " + customerId + ", Total Purchases: " + totalPurchases);
    }
}

class VIPCustomerImpl extends EmployeeImpl implements Customer {
    String vipLevel;
    double totalPurchases;

    public VIPCustomerImpl(String name, int age, String employeeId, double salary, String customerId, double totalPurchases, String vipLevel) {
        super(name, age, employeeId, salary);
        this.vipLevel = vipLevel;
        this.totalPurchases = totalPurchases;
    }

 
    public double calculateDiscount() {
        double discount = (totalPurchases > 1000) ? 0.10 : 0.05;
        if ("Gold".equals(vipLevel)) {
            discount += 0.05; 
        }
        return discount;
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("VIP Level: " + vipLevel + ", Total Purchases: " + totalPurchases + ", Discount: " + calculateDiscount() * 100 + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        VIPCustomerImpl vipCustomer = new VIPCustomerImpl("John Doe", 30, "E123", 50000, "C456", 1500, "Gold");
        vipCustomer.displayInfo();
        System.out.println("Salary: " + vipCustomer.calculateSalary());
    }
}
