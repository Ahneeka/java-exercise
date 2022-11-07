package JavaPractice;

import java.util.Scanner;

public class PositiveIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int multiplication;
        System.out.println("Enter a positive number");
        int num = input.nextInt();

        System.out.println("print the multiplication table of the number");

        for(int counter = 1; counter <= 20; counter++) {
           //  multiplication *= counter;
            System.out.printf("%d * %d = %d%n", num, counter, num*counter);

        }
       // System.out.printf("%d ", multiplication);

    }
}
