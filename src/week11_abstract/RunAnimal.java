package week11_abstract;

import java.util.Scanner;

public class RunAnimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Bird bird = new Bird();
//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        Animal bird = new Bird();
//        Animal cat = new Cat();
//        Animal dog = new Dog();

        Animal animal = null;

        System.out.println("Choose an animal. \nPress B for Bird\nPress C for Cat\nPress D for Dog");
        System.out.print("Option: ");
        String opt = sc.nextLine();
        if (opt.equalsIgnoreCase("B")) {
            animal = new Bird();
        } else if (opt.equalsIgnoreCase("C")) {
            animal = new Cat();
        } else if (opt.equalsIgnoreCase("D")) {
            animal = new Dog();
        }
        
        if (animal != null) {
            animal.eat();
            animal.sleep();
            animal.makeSound();
        } else {
            System.out.println("Please select an animal.");
        }
    }
}
