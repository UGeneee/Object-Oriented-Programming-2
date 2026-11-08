package Practice;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            FileWriter create = new FileWriter(sc.nextLine()+ ".txt", false);
            
            System.out.println("Enter text file name: ");
            create.write("3. Meow 3\n");
            create.write("4. Meow 4");
            
            create.close();
            
        } catch (IOException e) {
            System.out.println("meow");
        }

    }
}
