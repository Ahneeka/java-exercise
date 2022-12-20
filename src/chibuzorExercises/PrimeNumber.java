package chibuzorExercises;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        boolean isPrime = false;
        System.out.println("enter a number");
        int number = input.nextInt();
        for ( int counter = 2; counter < number; counter++){
           if( number % counter == 0) {
               isPrime = false;
               break;
           }else {
               isPrime = true;
           }
        }

        if (isPrime ==true ){
            System.out.println("it is a prime number");

        } else{
            System.out.println("it is not a prime number");
        }

    }
}
