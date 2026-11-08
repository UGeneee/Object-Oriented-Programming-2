package week5_store;

import java.util.Scanner;

public class Store {

    public static void main(String[] args) {
        Manager createProduct = new Manager();
        Store store = new Store();
        Scanner sc = new Scanner(System.in);

//        for(int i = 0; 5 < createProduct.length; i++) {
//            
//        }
//        while (true) {
//            createProduct.addProduct();
//            
//            
//        }
//        System.out.print("How many products do you want to add? ");
//        int productAmount = sc.nextInt();
//        for (int i = 0; i < productAmount; i++) {
//            createProduct.addProduct();
//
//            System.out.println();
//        }
//        \t Php 100.00
        String addmore = "";
        do {
            createProduct.addProduct();
            System.out.println("Do you want to continue? Y/N");
            addmore = sc.nextLine();
        } while (addmore.equals("y"));
        store.open(createProduct);
        // System.out.println("Done.");
    }

    private void open(Manager mgr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ano bibilhin mo?");
        for (Product product : mgr.productList) {
            System.out.println(product.getItemName() + "\t Php " + product.getBasePrice());
        }
        String order = sc.nextLine();

        for (Product product : mgr.productList) {
            if (order.equalsIgnoreCase(product.getItemName())) {
                System.out.println("Price: Php " + product.getBasePrice());
            }
        }
//        String order = sc.nextLine();
//
//        for (Product product : mgr.productList) {
//
//            if (product.getItemName().equalsIgnoreCase(order)) {
//
//                System.out.println("Product: " + product.getItemName());
//                System.out.println("Price: Php " + product.getBasePrice());
//
//                System.out.println("Select Payment Method:");
//                System.out.println("1. Cash");
//                System.out.println("2. GCash");
//                System.out.println("3. Credit Card");
//
//                int payment = sc.nextInt();
//
//                switch (payment) {
//                    case 1:
//                        System.out.println("You selected Cash.");
//                        break;
//                    case 2:
//                        System.out.println("You selected GCash.");
//                        break;
//                    case 3:
//                        System.out.println("You selected Credit Card.");
//                        break;
//                    default:
//                        System.out.println("Invalid payment method.");
//                }
//
//                return; // stop searching once found
//            }
//        }
//
//        System.out.println("Product not found.");
    }
}
