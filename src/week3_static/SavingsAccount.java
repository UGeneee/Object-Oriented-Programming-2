package week3_static;

public class SavingsAccount {

    private double balance;
    public static double interestRate = 0;

    public SavingsAccount() {
        balance = 0;
    }

    public static void setInterestRate(double newRate) {
        SavingsAccount.interestRate = newRate;
    }

    public static double getInterestRate() {
        return interestRate;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public double deposit(double amount) {
        balance += amount;
        
        return balance;
    }
    
    public double withdraw(double amount) {
        if(balance >= amount) {
            balance-= amount;
        } else {
            System.out.println("Invalid Withdraw Amount.");
            System.out.println("Available Amount: " + balance);
        }
        return balance;
    }
    
    public void addInterest() {
        double interest = balance * interestRate;
        
        balance += interest;
    }
    
    public static void showBalance(SavingsAccount account) {
        System.out.println("Your new balance is: " + account.getBalance());
    }

}
