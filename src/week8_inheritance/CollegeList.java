package week8_inheritance;

import java.util.Scanner;

public class CollegeList {

    public static void main(String[] args) {
        prompt();
    }

    public static void prompt() {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        Student s = new Student();
        Faculty f = new Faculty();

        System.out.print("Type E for Employee, F for Faculty, or S for Student: ");
        String input = sc.nextLine().toUpperCase();

        switch (input) {
            case "E" ->
                e.employeeInfo();
            case "F" ->
                f.facultyInfo();
            case "S" -> 
                s.studentInfo();
            default ->
                System.out.println("Please select only the given types.");
        }
    }
}
