package week5_store;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    ArrayList<Product> productList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void addProduct() {
        Product newProduct = new Product();
        
        System.out.print("Enter Product Name: ");
        newProduct.setItemName(sc.nextLine());
        System.out.print("Enter Product Price of: " + newProduct.getItemName() + " ");
        newProduct.setBasePrice(sc.nextInt()); sc.nextLine();
        
        productList.add(newProduct);
        
    }
    
}
