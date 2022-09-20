package chapter2;

import java.util.Scanner;
public class ArithmeticSmallAndLarge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1");
        int value = input.nextInt();

        System.out.println("Enter number 2");
        int number = input.nextInt();

        System.out.println("Enter number 3");
        int product = input.nextInt();

        int sum = value + number + product;
        System.out.printf("sum is %d ", sum );

        int average = sum / 3;
        System.out.printf("average is %d ", average);

        int multiplication = value * number * product;
        System.out.printf("multiplication is %d " , multiplication);

        int largest;
        largest = product;
        if(value > largest){
            largest = value;
        }
        System.out.println();

        if(number > largest){
            largest = number;

        }
        int smallest;
        smallest = product;
        if(value < smallest){
            smallest = value;
        }
        System.out.println();

        if(number < smallest){
            smallest = number;
        }
        System.out.println("the largest number is: "+ largest);
        System.out.println("the smallest number is: "+ smallest);

    }
}
