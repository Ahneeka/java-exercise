package Chapter4;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int firstNum = scanner.nextInt();

        System.out.println("Enter the second number");
        int secondNum = scanner.nextInt();


        if( firstNum == secondNum){
            System.out.println("0");
        }
        else if(firstNum > secondNum) {
            System.out.println("1");
        }
        else {
            System.out.println("-1");
        }
    }
}
