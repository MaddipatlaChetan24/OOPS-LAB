class Customer {
    private String name;
    private double purchaseAmount;

    public Customer(String name, double purchaseAmount) {
        this.name = name;
        this.purchaseAmount = purchaseAmount;
    }

    public double calculateDiscount() {
        return purchaseAmount * 0.05; 
    }

    public void displayDetails() {
        System.out.println("Customer: " + name);
        System.out.println("Purchase Amount: $" + purchaseAmount);
        System.out.println("Discount: $" + calculateDiscount());
    }
}

class PremiumCustomer extends Customer {
    public PremiumCustomer(String name, double purchaseAmount) {
        super(name, purchaseAmount);
    }


    public double calculateDiscount() {
        return getPurchaseAmount() * 0.10; 
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("This is a premium customer with a higher discount!");
    }
}

public class Main {
    public static void main(String[] args) {
        Customer regularCustomer = new Customer("John", 200);
        PremiumCustomer premiumCustomer = new PremiumCustomer("Jane", 300);

        regularCustomer.displayDetails();  
        System.out.println();
        premiumCustomer.displayDetails(); 
    }
}

