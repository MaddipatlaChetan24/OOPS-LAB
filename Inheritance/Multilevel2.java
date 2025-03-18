class BankAccount {
    String accountHolder;
    double balance;
    
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * (interestRate / 100); 
    }

   
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%, Interest Earned: " + calculateInterest());
    }
}

class FixedDepositAccount extends SavingsAccount {
    int tenure; 

    public FixedDepositAccount(String accountHolder, double balance, double interestRate, int tenure) {
        super(accountHolder, balance, interestRate);
        this.tenure = tenure;
    }

    public double calculateMaturityAmount() {
        return balance + (calculateInterest() * tenure); 
    }

  
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Tenure: " + tenure + " years, Maturity Amount: " + calculateMaturityAmount());
    }
}

public class Main {
    public static void main(String[] args) {
        FixedDepositAccount fdAccount = new FixedDepositAccount("John Doe", 50000, 5, 10);
        fdAccount.displayAccountInfo();
    }
}

