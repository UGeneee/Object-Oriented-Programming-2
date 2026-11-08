package week7_encap;

import java.util.Scanner;

public class Student {

    private String name;
    private int age;

    public Student() {
        name = "No Name yet.";
        age = 0;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public static void main(String[] args) {
        // display name and age
        // display seatmate name and age
        // Student stdnt = new Student("Von", 20);
//        Scanner sc = new Scanner(System.in);
//
//        Student stdnt = new Student();
//        System.out.print("Enter name: ");
//        stdnt.setName(sc.nextLine());
//        System.out.print("Enter age: ");
//        stdnt.setAge(sc.nextInt());
//        System.out.println("");
//
//        System.out.println("Seatmate's Name: " + stdnt.getName());
//        System.out.println("Seatmate's Age: " + stdnt.getAge() + "\n");
        
        Student stdnt1 = new Student("Ephraim", 19);
        System.out.println("Seatmate's Name: " + stdnt1.name);
        System.out.println("Seatmate's Age: " + stdnt1.age + "\n");

        Student stdnt2 = new Student("Von", 20);
        System.out.println("Seatmate's Name: " + stdnt2.name);
        System.out.println("Seatmate's Age: " + stdnt2.age);
    }

}
