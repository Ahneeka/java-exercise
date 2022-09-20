package codesDopePractice;

import java.util.Scanner;

public class ValueOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value");
        int value = input.nextInt();
        System.out.println("Enter Number");
        int number = input.nextInt();

        if(value > number){
            System.out.printf("%d is the greatest%n", value);
        }
        else{
            System.out.printf("%d is the greatest%n", number);
        }
    }
}
