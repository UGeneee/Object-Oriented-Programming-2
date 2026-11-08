package week11_abstract;


public abstract class Payment {
    double amountDue;
    
    public Payment(double amount) {
        this.amountDue = amount;
    }
    
    public void displayAmountDue() {
        System.out.println("Amount Due: " + amountDue);
    }
    
    public abstract void creditPaymentProcess();
    public abstract void debitPaymentProcess();
    public abstract void salesInvoice();
}
