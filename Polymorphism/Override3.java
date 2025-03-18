abstract class Payment {
    public abstract void processPayment(double amount); 
}

class CreditCardPayment extends Payment {
   
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PaypalPayment extends Payment {

    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        Payment paypalPayment = new PaypalPayment();

        creditCardPayment.processPayment(100.50);  
        paypalPayment.processPayment(250.75);      
    }
}


