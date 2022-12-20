package chapter11ExeceptionHandling;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionByZero {
    private static Scanner keyboardInput = new Scanner(System.in);
    public static void main(String[] args) {

        while (true) {
            int numerator = input("Enter a numerator");
            int denominator = input("Enter a denominator");
          /*  System.out.println("\n".repeat(50));
            System.out.println("your integer quotient is" +numerator/denominator);*/

            try {
                int quotient = numerator / denominator;
                display("Your integer quotient is " + quotient);
                display(("\n your integer quotient is " + numerator / denominator));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void display(String s) {
    }

    private static int input(String prompt) {
        System.out.println(prompt);

        try{
            return Integer.parseInt(JOptionPane.showInputDialog(prompt));
        }
        catch (InputMismatchException amirah){
            System.out.println("Wrong input type");
            return input (prompt);
        }
    }
}
