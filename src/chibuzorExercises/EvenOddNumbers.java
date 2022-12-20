package chibuzorExercises;

import java.util.Scanner;

//collect input from user and check if it's an even or odd

public class EvenOddNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();

        if (num % 2  ==0){
            System.out.println("It's an even number");
        }
        else{
            System.out.println("It's an odd number");
        }


    }
}