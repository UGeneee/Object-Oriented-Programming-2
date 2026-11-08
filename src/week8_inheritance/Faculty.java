package week8_inheritance;

import java.util.Scanner;

public class Faculty extends Employee {

    private boolean status;

    public boolean isRegular() {
        return status;
    }

    public void facultyInfo() {
        Scanner sc = new Scanner(System.in);
        employeeInfo();

        System.out.print("Is the faculty member a regular/tenured? (Y/N): ");
        String input = sc.nextLine().toUpperCase();
        if ("Y".equals(input)) {
            displayInfo();
            status = true;
        } else if ("N".equals(input)) {
            displayInfo();
            status = false;
        } else {
            System.out.println("Please input Y or N only.");
        }
        
        System.out.println("Regular: " + isRegular());
    }

}
