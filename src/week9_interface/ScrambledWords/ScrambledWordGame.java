package week9_interface.ScrambledWords;

import java.util.Scanner;

public class ScrambledWordGame {

    static Scanner sc = new Scanner(System.in);
    static String pName;
    static boolean rep = true;
    
    public static void exit() {
        try {
            for (int i = 3; i > 0; i--) {
                System.out.println("Exiting " + i + "...");
                Thread.sleep(1000);
            }
            System.out.println("Thanks for playing!");
            rep = false;
        } catch (InterruptedException e) {
            System.out.println("Error: Exit Interrupted.");
        }
    }

    public static void displayMenu() {
        System.out.print("Enter your name: ");
        pName = sc.nextLine();
        GameDiffs gameD = new GameDiffs(pName);

        do {
            System.out.println("""
                           \nWelcome to: Un-scrubble !!!
                           Select Difficulty Options:
                           1 - Easy
                           2 - Moderate
                           3 - Hard
                           4 - Extreme
                           5 - Exit""");
            System.out.print(": ");
            int gMode = sc.nextInt(); sc.nextLine();
            switch (gMode) {
                case 1 ->
                    gameD.diffEasy();
                case 2 ->
                    gameD.diffModerate();
                case 3 ->
                    gameD.diffHard();
                case 4 ->
                    gameD.diffExtreme();
                case 5 ->
                    exit();
                default ->
                    System.out.println("Please select a game mode.");
            }
        } while (rep == true);
        
        
    }

    public static void main(String[] args) {
        displayMenu();
    }
}
