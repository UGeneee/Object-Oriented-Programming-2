package week2_methods;

import java.util.Scanner;

public class LabExer1 {

    // 4 methods
    // plusFive
    // timeTwo
    // showSquared
    // computePercent
    public static double num1;
    public static double num2;
    
    // call = 

    public static void plusFive(double addNum1, double addNum2) {
        addNum1 += 5;
        addNum2 += 5;

        System.out.println(addNum1 + " and " + addNum2);
    }

    public static void timesTwo(double timesNum1, double timesNum2) {
        timesNum1 *= 2;
        timesNum2 *= 2;

        System.out.println(timesNum1 + " and " + timesNum2);
    }

    public static void showSquared(double sqNum1, double sqNum2) {
        sqNum1 *= num1;
        sqNum2 *= num2;

        System.out.println(sqNum1 + " and " + sqNum2);

    }

    public static void computePercent(double computeNum1, double computeNum2) {
        num1 = computeNum1;
        num2 = computeNum2;

        int computation = (int) (computeNum1 / computeNum2 * 100);
        System.out.println(num1 + " is " + computation + " percent of " + num2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter two numbers.");
            System.out.print("First number: ");
            num1 = sc.nextDouble();
            System.out.print("Second number: ");
            num2 = sc.nextDouble();
            if (num2 == 0) {
                System.out.println("Cannot use zero. Please enter another input.");
                return;
            }

            plusFive(num1, num2);
            timesTwo(num1, num2);
            showSquared(num1, num2);
            computePercent(num1, num2);
            
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }

}
