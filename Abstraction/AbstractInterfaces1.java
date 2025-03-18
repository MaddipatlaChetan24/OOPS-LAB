interface Payment {
    void processPayment(double amount);
}

class CreditCardPayment implements Payment {
  
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount);
    }
}

class PayPalPayment implements Payment {
 
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment paypal = new PayPalPayment();

        creditCard.processPayment(100.50);
        paypal.processPayment(250.75);
    }
}

