package week9_interface.TaskPerformance;

import java.util.Scanner;

public class Main extends Jan_Ken_Poi {
    public static void main(String[] args) {
        Main game = new Main();
        Scanner sc = new Scanner(System.in);

        String input;

        do {
            game.playerChoice();
            game.computerChoice();
            game.determineWinner();

            System.out.println("\nAgain? Y/N");
            input = sc.nextLine().toLowerCase();
        } while (input.equals("y"));
        System.out.println("\nThanks for playing!");
    }
}
