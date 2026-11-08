package week11_abstract;

import java.util.Scanner;

public class ChinaBank extends Payment {

    public ChinaBank(double amount) {
        super(amount);
    }

    Scanner sc = new Scanner(System.in);

    static double owned = 0;
    static double pin;

    public void creditPaymentProcess() {
        System.out.println("\nWelcome to ChinaBank");
        System.out.println("Please enter exact amount from total.\n");
        System.out.print("Enter Amount: Php ");
        owned = sc.nextDouble(); sc.nextLine();
        if (owned >= 1000) {
            System.out.println("Please show ID");
            System.out.println("Owner? Y/N");
            String opt = sc.nextLine().toUpperCase();
            if (opt.equals("Y")) {
                System.out.println("Thank you.");
            } else {
                System.out.println("Please verify ownership.");
            }
        }
    }

    public void debitPaymentProcess() {
        System.out.println("\nWelcome to ChinaBank");
        System.out.println("Please enter exact amount from total.\n");
        System.out.print("Enter Amount: Php ");
        owned = sc.nextDouble(); sc.nextLine();
        if (owned >= 1000) {
            System.out.println("Please show ID");
            System.out.println("Owner? Y/N");
            String opt = sc.nextLine().toUpperCase();
            if (opt.equals("Y")) {
                System.out.println("Thank you.");
            } else {
                System.out.println("Please verify ownership.");
            }
        }
        System.out.print("Enter PIN: ");
        pin = sc.nextDouble();
    }

    public void salesInvoice() {
        System.out.println("\n----------- APPROVED -----------");
        System.out.println("Sales Amount: " + owned);
        System.out.println("ARQC: 31D06CDD331A3EA");
        System.out.println("ATC: 0004");
        System.out.println("APP LABEL: Debit Mastercard");
        System.out.println("AID: A0000000041010");
    }
}
