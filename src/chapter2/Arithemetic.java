package chapter2;

import java.util.Scanner;//(Arithmetic) Write an application that asks the user to enter two integers, obtains them from
       // the user and prints the square of each, the sum of their squares, and the difference of the squares (first
       // number squared minus the second number squared). Use the techniques shown in Fig. 2.7


public class Arithemetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int value = input.nextInt();

        System.out.println("Enter second number");
        int number = input.nextInt();

        int square1 = value * value;
        int square2 = number * number;
        System.out.printf("the square are " + square1 + square2);
        System.out.println();

        int sum = square1 + square2;
        System.out.printf("the sum " + sum);
        System.out.println();

        int difference = square1 - square2;
        System.out.printf("the difference " + difference);
        System.out.println();


    }
}
