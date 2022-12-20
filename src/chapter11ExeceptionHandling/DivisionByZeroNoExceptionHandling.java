package chapter11ExeceptionHandling;

import java.util.Scanner;

public class DivisionByZeroNoExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numerator");
        int numerator = input.nextInt();

        System.out.println("Enter the denominator");
        int denominator = input.nextInt();

        int result = quotient(numerator, denominator);

        System.out.printf("Result: %d / %d = %d%n ",numerator,denominator,result);
    }
    public static int quotient(int numerator, int denominator) {
        return numerator / denominator;
    }

}
