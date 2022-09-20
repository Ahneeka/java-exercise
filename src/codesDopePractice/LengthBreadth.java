package codesDopePractice;

import java.util.Scanner;

public class LengthBreadth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length ");
        int length = input.nextInt();
        System.out.println("Enter breadth");
        int breadth = input.nextInt();
        if (length != breadth){
            System.out.println("it's a rectangle");
        }
        else {
            System.out.println("it's a square");
        }


    }
}
