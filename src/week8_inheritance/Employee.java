package week8_inheritance;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee extends Person {

    private double salary;
    private String department;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void employeeInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type employee's name, contact number, salary, and department.");
        System.out.println("Press Enter after every input.");
        setName(sc.nextLine());
        setContactNum(sc.nextLine());
        try {
            setSalary(sc.nextDouble());
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Please enter numbers only.");
            return;
        }
        setDepartment(sc.nextLine());

        displayInfo();
    }

    public void displayInfo() {
        System.out.println("-------------------------");
        System.out.println("Name: " + getName());
        System.out.println("Contact Number: " + getContactNum());
        System.out.println("Salary: Php " + String.format("%.2f", getSalary()));
        System.out.println("Department: " + getDepartment());
    }

}
