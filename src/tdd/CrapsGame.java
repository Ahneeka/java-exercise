package tdd;

import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsGame {
    private static final SecureRandom randomNumbers = new SecureRandom();
    static Scanner input = new Scanner(System.in);


    private enum Status {CONTINUE, WON, LOST}

    ;

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

        return sum;
    }

    public static void main(String[] args) {
        int myPoint = 0;
        Status gameStatus;

        System.out.print("Welcome to the game of Craps. please, Place your Bet and Enter 1: ");
        int start = input.nextInt();

        while (start != 1){
            System.out.println("Invalid entry, try again!");
            start = input.nextInt();
        }
        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN, YO_LEVEN -> gameStatus = Status.WON;
            case SNAKE_EYES, TREY, BOX_CARS -> gameStatus = Status.LOST;
            default -> {
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
            }
        }
        if (gameStatus == Status.CONTINUE) {
            do {
                sumOfDice = rollDice();

                if (sumOfDice == myPoint) {
                    gameStatus = Status.WON;
                } else {
                    if (sumOfDice == SEVEN) {
                        gameStatus = Status.LOST;
                    }
                }
            } while (gameStatus == Status.CONTINUE);
        }

        if (gameStatus == Status.WON) {
            System.out.println("Player Wins");
        } else {
            System.out.println("Player loses");
        }

    }
}

