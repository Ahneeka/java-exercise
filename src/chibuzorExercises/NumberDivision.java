package chibuzorExercises;

import java.util.Scanner;

public class NumberDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a value");
        int number = input.nextInt();
        System.out.println("enter a different number");
        int count = input.nextInt();
        int y = number / count;
        System.out.printf("the answer is %d", y);
    }
}
