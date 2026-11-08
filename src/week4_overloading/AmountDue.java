package week4_overloading;

class AmountDue {

    static double tax = 0.12;

    public static void computeAmountDue(double price) {
        double amountDue = price * (1 + (tax));
        System.out.println("Amount due is " + String.format("%.2f", amountDue) +  "\n");
    }

    public static void computeAmountDue(double price, int quantity) {
        double amountDue = price * quantity * (1 + tax);
        System.out.println("Amount due is " + String.format("%.2f", amountDue) +  "\n");
    }

    public static void computeAmountDue(double price, int quantity, double discount) {
        double total = price * quantity;     
        double appliedDiscount = total - discount;
        double amountDue = appliedDiscount * (1 + (tax));
        System.out.println("Amount due is: " + String.format("%.2f", amountDue) +  "\n");
    }
}
