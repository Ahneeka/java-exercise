package codesDopePractice;

import java.util.Scanner;

public class CompanyPlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter salary");
        int salary = input.nextInt();
        System.out.println("Enter year");
        int totalYear = salary * 5;
        if (totalYear > 5){
            System.out.println("u are eligible for the salary");
        }
        else {
            System.out.println(" u are not eligible for the salary");
        }

    }
}
