package week4_overloading;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunAmountDue {

    static double price = 0;
    static int quantity = 0;
    static double discountAmount = 0;
    static boolean repeat = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AmountDue due = new AmountDue();

        while (repeat) {
            try {
                System.out.println("Press any of the following then enter values separated by spaces: ");
                System.out.println("1 - Price only\n2 - Price and quantity\n3 - Price, quantity, and discount amount\n4 - Exit");
                int option = sc.nextInt();

                switch (option) {
                    case 1:
                        price = sc.nextDouble();
                        if (price == 0) {
                            System.out.println("Cannot use zero. Please enter another input.");
                        } else {
                            due.computeAmountDue(price);
                        }
                        break;
                    case 2:
                        price = sc.nextDouble();
                        quantity = sc.nextInt();
                        if (price == 0 || quantity == 0) {
                            System.out.println("Cannot use zero. Please enter another input.");
                        } else {
                            due.computeAmountDue(price, quantity);
                        }
                            break;
                        
                        case 3:
                        price = sc.nextDouble();
                        quantity = sc.nextInt();
                        discountAmount = sc.nextDouble();
                        if (price == 0 || quantity == 0 || discountAmount == 0) {
                            System.out.println("Cannot use zero. Please enter another input.");
                        } else {
                        due.computeAmountDue(price, quantity, discountAmount);
                        }
                        break;
                    case 4:
                        System.out.println("Thanks for trying.");
                        repeat = false;
                        break;
                    default:
                        System.out.println("Please input only 1, 2 or 3. Try again.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please input a number. Try again.");
                break;
            }
                }
            }

        }
