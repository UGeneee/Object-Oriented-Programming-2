package week11_abstract;

import java.util.Scanner;

public class POS {
    
    public static double n = 503.25;
    
    public static void main(String[] args) {
        ChinaBank payment = new ChinaBank(n);
        
        payment.displayAmountDue();
        
        paymentMethod();
        
        payment.salesInvoice();
    }
    
    public static void paymentMethod() {
        Scanner sc = new Scanner(System.in);
        ChinaBank payment = new ChinaBank(n);
        System.out.println("Select card payment method: \n1. Credit\n2. Debit");
        System.out.print("Option: ");
        int select = sc.nextInt();
        if (select == 1) {
            payment.creditPaymentProcess();
        } else if (select == 2) {
            payment.debitPaymentProcess();
        } else {
            System.out.println("Please select 1 or 2.");
        }
    }
    
}
