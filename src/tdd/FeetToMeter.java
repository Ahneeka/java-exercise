package tdd;

import java.io.PrintStream;
import java.util.Scanner;

public class FeetToMeter {
    public static void main(String[] args)

    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value in feet");
        double number = input.nextDouble();
        double value = number * 0.305;

        System.out.printf("%f feet is %f meters", number, value);
    }
}




