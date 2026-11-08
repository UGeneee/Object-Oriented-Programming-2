package week9_interface.ScrambledWords;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameDiffs implements DifficultyEasy, DifficultyModerate, DifficultyHard, DifficultyExtreme {

    String pName;
    int guess;

    public GameDiffs(String pName) {
        this.pName = pName;
    }

    public void gameLoad() {
        try {
            for (int i = 3; i > 0; i--) {
                System.out.println("Game Starting in " + i + "...");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Error: Exit Interrupted.");
        }
    }

    public void guess(int guess) {
        this.guess = guess;
    }

    public void gameRules() {
        System.out.println("\nRules: \n1. You only have " + guess + " guesses.\n2. Have Fun!\n3. Rule number 2.");
    }

    public void gameDisplay(String difficulty, int attemps) {
        System.out.println("----- " + difficulty + " -----");
        System.out.println("Good luck, " + pName + "!\n");
        guess(attemps);
        gameLoad();
        gameRules();
    }

    public ArrayList<String> wordList(String difficulty) {
        ArrayList<String> words = new ArrayList<>();

        switch (difficulty.toLowerCase()) {
            case "easy" -> {
                words.add("APPLE");
                words.add("HOUSE");
                words.add("PLANT");
                words.add("WATER");
                words.add("CHAIR");
            }
            case "moderate" -> {
                words.add("GARDEN");
                words.add("MONKEY");
                words.add("PLANET");
                words.add("ORANGE");
                words.add("BOTTLE");
            }
            case "hard" -> {
                words.add("ELEPHANT");
                words.add("COMPUTER");
                words.add("MOUNTAIN");
                words.add("NOTEBOOK");
                words.add("HOSPITAL");
            }
            case "extreme" -> {
                words.add("ASTRONOMY");
                words.add("ADVENTURE");
                words.add("KNOWLEDGE");
                words.add("EARTHQUAKE");
                words.add("PHOTOGRAPHY");
            }
            default ->
                System.out.println("Invalid difficulty!");
        }
        return words;
    }

    public String scrambleWord(String word) {

        char[] letters = word.toCharArray();
        Random rand = new Random();

        for (int i = letters.length - 1; i > 0; i--) {

            int j = rand.nextInt(i + 1);

            char temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;
        }

        return new String(letters);
    }

    public String getRandomWord(String difficulty) {
        ArrayList<String> words = wordList(difficulty);

        Random rand = new Random();

        return words.get(rand.nextInt(words.size()));
    }

    public void checkGuess(String originalWord, int attempts) {
        Scanner sc = new Scanner(System.in);
        boolean correct = false;

        for (int i = 1; i <= attempts; i++) {

            System.out.print("Your Guess: ");
            String playerGuess = sc.nextLine().trim();

            if (playerGuess.equalsIgnoreCase(originalWord)) {
                System.out.println("\nCorrect! You guessed the word!");
                correct = true;
                break;
            } else {
                System.out.println("Incorrect guess!");

                int remaining = attempts - i;

                if (remaining > 0) {
                    System.out.println("Attempts remaining: " + remaining);
                }
            }
        }

        if (!correct) {
            System.out.println("\nGame Over!");
            System.out.println("The correct word was: " + originalWord);
        }
    }

    @Override
    public void diffEasy() {
        gameDisplay("EASY", 8);
        String originalWord = getRandomWord("easy");
        String scrambledWord = scrambleWord(originalWord);
        System.out.println("Scrambled Word: " + scrambledWord);
        checkGuess(originalWord, guess);
    }

    @Override
    public void diffModerate() {
        gameDisplay("MODERATE", 6);
        String originalWord = getRandomWord("moderate");
        String scrambledWord = scrambleWord(originalWord);
        System.out.println("Scrambled Word: " + scrambledWord);
        checkGuess(originalWord, guess);
    }

    @Override
    public void diffHard() {
        gameDisplay("HARD", 4);
        String originalWord = getRandomWord("hard");
        String scrambledWord = scrambleWord(originalWord);
        System.out.println("Scrambled Word: " + scrambledWord);
        checkGuess(originalWord, guess);
    }

    @Override
    public void diffExtreme() {
        gameDisplay("EXTREME", 3);
        String originalWord = getRandomWord("extreme");
        String scrambledWord = scrambleWord(originalWord);
        System.out.println("Scrambled Word: " + scrambledWord);
        checkGuess(originalWord, guess);
    }

}
