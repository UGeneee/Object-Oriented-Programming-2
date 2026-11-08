package week8_inheritance;

import java.util.Scanner;

public class Student extends Person {

    private String program;
    private int yearLevel;

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public void studentInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type student's name, contact number, program, and year level (1 - 4).");
        System.out.println("Press Enter after every input.");
        setName(sc.nextLine());
        setContactNum(sc.nextLine());
        setProgram(sc.nextLine().toUpperCase());
        
        int year = sc.nextInt();
        if (year <= 4) {
            setYearLevel(year);
        } else {
            System.out.println("Please input only 1-4.");
        }
        
        displayStudentInfo();
    }

    public void displayStudentInfo() {
        System.out.println("-------------------------");
        System.out.println("Name: " + getName());
        System.out.println("Contact Number: " + getContactNum());
        System.out.println("Program: " + getProgram());
        System.out.println("Year Level: " + getYearLevel());
    }
}
