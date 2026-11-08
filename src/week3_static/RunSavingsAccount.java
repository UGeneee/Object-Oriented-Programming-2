package week3_static;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunSavingsAccount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount savings = new SavingsAccount();

        boolean repeat = true;
        double interestAmount = 0;
        double depositAmount = 0;
        double withdrawAmount = 0;

        try {

//            System.out.print("Enter Interest Rate: ");
//            interestAmount = sc.nextDouble();
//            savings.setInterestRate(interestAmount);
//            System.out.print("Enter Deposit Amount: ");
//            depositAmount = sc.nextDouble();
//            savings.deposit(depositAmount);
//            if (depositAmount <= 0) {
//                System.out.println("Please enter a valid amount.");
//            }
//
//            SavingsAccount.showBalance(savings);

            while (repeat) {
                System.out.print("Enter Interest Rate: ");
                interestAmount = sc.nextDouble();
                savings.setInterestRate(interestAmount);
                System.out.print("Enter Deposit Amount: ");
                depositAmount = sc.nextDouble();
                savings.deposit(depositAmount);
                if (depositAmount <= 0) {
                    System.out.println("Please enter a valid amount.");
                }

                SavingsAccount.showBalance(savings);
                System.out.println("What do you want to do next?");
                System.out.println("[D] Deposit\n[W] Withdraw\n[X] Exit");
                System.out.print("Entry: ");
                String input = sc.next().toUpperCase();
                if (input.equals("D")) {
                    System.out.print("Enter Deposit Amount: ");
                    depositAmount = sc.nextDouble();
                    if (depositAmount <= 0) {
                        System.out.println("Please enter a valid amount.");
                    } else if (depositAmount >= 1000) {
                        savings.deposit(depositAmount);
                        savings.addInterest();
                        SavingsAccount.showBalance(savings);
                    } else {
                        savings.deposit(depositAmount);
                        SavingsAccount.showBalance(savings);
                    }

                } else if (input.equals("W")) {
                    System.out.print("Enter Withdraw Amount: ");
                    withdrawAmount = sc.nextDouble();
                    savings.withdraw(withdrawAmount);
                    SavingsAccount.showBalance(savings);
                } else if (input.equals("X")) {
                    repeat = false;
                } else {
                    System.out.println("Invalid Input. Please enter a valid input.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid amount. Please enter a valid amount.");
        }

    }
}
