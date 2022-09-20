package codesDopePractice;

import java.util.Scanner;

public class ShopDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter quantity");
        int quantity = input.nextInt();
        int totalCost = quantity * 100;
        if(totalCost > 1000) {
            System.out.println("you are eligible for discount");
        }
        else {
            System.out.println("you are not eligible for discount");
        }
    }
}
