package week9_interface.TaskPerformance;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

abstract class Jan_Ken_Poi implements PlayerMove, ComputerMove, GameResult {

    String playerMove;
    String computerMove;
    String winner;

    @Override
    public void playerChoice() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("""
                           Choose your move:
                           1. Rock
                           2. Paper
                           3. Scissors
                           """);

            System.out.print("Your choice is: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 ->
                    playerMove = "Rock";
                case 2 ->
                    playerMove = "Paper";
                case 3 ->
                    playerMove = "Scissors";
                default -> {
                    System.out.println("Invalid choice!");
                    playerChoice();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Please choose between 1-3 only.");
        }

    }

    @Override
    public void computerChoice() {
        Random rand = new Random();

        int choice = rand.nextInt(3) + 1;

        switch (choice) {
            case 1 ->
                computerMove = "Rock";
            case 2 ->
                computerMove = "Paper";
            case 3 ->
                computerMove = "Scissors";
        }
    }

    @Override
    public void determineWinner() {
        if (playerMove.equals(computerMove)) {
            winner = "Draw";
        } else if (playerMove.equals("Rock") && computerMove.equals("Scissors")) {
            winner = "Player";
        } else if (playerMove.equals("Paper") && computerMove.equals("Rock")) {
            winner = "Player";
        } else if (playerMove.equals("Scissors") && computerMove.equals("Paper")) {
            winner = "Player";
        } else {
            winner = "Computer";
        }

        System.out.println("\n----- GAME RESULT -----");
        System.out.println("Your play: " + playerMove);
        System.out.println("Computer's play: " + computerMove);

        switch (winner) {
            case "Draw" ->
                System.out.println("It's a draw!");
            case "Player" ->
                System.out.println("Winner: Player \nCongratulations!");
            default ->
                System.out.println("Winner: Computer \nBetter luck next time!");
        }
    }

}
