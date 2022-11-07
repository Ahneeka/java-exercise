package JavaPractice;

import java.util.Scanner;

public class WhileClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int magicNumber = 40;


        int number = 0;
        while (number != magicNumber) {
            System.out.println("Enter a number");
            number = input.nextInt();

        }
    }
}
