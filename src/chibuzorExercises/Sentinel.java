package chibuzorExercises;

import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        // todo a small app like jumia that collects 10 valid score and output sum
    int scoreCount = 0;
        Scanner scanner = new Scanner(System.in);

    // todo do all of these till scoreCount = 10
    int totalScore = 0;
    while (scoreCount != 10){

        // todo collect scores
        System.out.println("Enter a score " + (scoreCount +1));
        int score = scanner.nextInt();
        int totalscore = 0;

        // todo check if score is valid
        if (score >= 0 && score <= 100) {

            // todo add to total valid score
            totalscore += score;

            // todo increment scoreCount
            scoreCount++;
        }
        }
        System.out.println("total score is " + totalScore);
    }
}
