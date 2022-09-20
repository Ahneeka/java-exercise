import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int value = input.nextInt();
        System.out.println("enter second number");
        int number = input.nextInt();
        int x = value *number;
        System.out.printf("answer is %d ", x);
    }
}
