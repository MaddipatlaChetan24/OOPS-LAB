abstract class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public abstract void withdraw(double amount);  // Abstract method for withdrawal
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountHolderName, double balance, double interestRate) {
        super(accountHolderName, balance);
        this.interestRate = interestRate;
    }


    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            System.out.println("Withdrawing from savings account: $" + amount);
        } else {
            System.out.println("Insufficient funds in savings account.");
        }
    }

    public void calculateInterest() {
        double interest = getBalance() * interestRate;
        System.out.println("Interest earned: $" + interest);
    }
}

class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountHolderName, double balance) {
        super(accountHolderName, balance);
    }

  
    public void withdraw(double amount) {
        System.out.println("Withdrawing from current account: $" + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("Alice", 5000, 0.03);
        BankAccount current = new CurrentAccount("Bob", 10000);

        savings.deposit(200);
        savings.withdraw(100);
        ((SavingsAccount) savings).calculateInterest();

        current.withdraw(500);
    }
}

