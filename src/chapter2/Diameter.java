package chapter2;

import java.util.Scanner;

public class Diameter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius");
        int radius = input.nextInt();

        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("Diameter is: %f\nCircumference is: %f\nArea is: %f ", diameter,circumference,area);




    }
}
