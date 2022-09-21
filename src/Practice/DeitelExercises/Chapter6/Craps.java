package Practice.DeitelExercises.Chapter6;

import java.security.SecureRandom;

public class Craps {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private enum Level {CONTINUE, WON, LOST};
    private static final int DON = 2;
    private static final int FOID = 5;
    private static final int XIXTY_9 = 6;
    private static final int RED_EYE = 9;
    private static final int TRAUMA = 10;
    private static final int JACKPOT = 12;

    public static void main(String[] args) {
        play();
    }
    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }
    public static void play() {
        int myPoint = 0;
        Level gameStatus;
        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case DON, JACKPOT -> {
                gameStatus = Level.WON;
                break;
            }
            case FOID, XIXTY_9, RED_EYE, TRAUMA -> {
                gameStatus = Level.LOST;
                break;
            }
            default -> {
                gameStatus = Level.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
                break;
            }
        }
        System.out.print("");
    }
}