import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num1 = input.nextInt();
        System.out.println("enter another number");
        int num2 = input.nextInt();
        int x = num1 + num2;
        System.out.printf(" the answer is %d",x);
    }
}
