package Chapter4;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five digit numbers ");
        int num = input.nextInt();
        int reverse = 0;
        for(int i = num; i > 0;i++){
            int palindromes = 0;
            if (num != palindromes){
                System.out.println("it's a palindrome");
            }else {
                System.out.println("it's not a palindrome");
            }
        }
    }
}
