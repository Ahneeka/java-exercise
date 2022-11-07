import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number");
        int number = input.nextInt();

        int i = 1;
        int sum = 0;
        while (i < number) {

            if (number % i == 0) {
                System.out.println("The factors of the number: " + i);
                sum += i;
            }
            i++;
        }
        System.out.println();
        System.out.println("The sum of the factor is: " + sum);

        if (sum == number) {
            System.out.println("The number is a perfect number");
        }else{
            System.out.println();
            System.out.println("The number is not a perfect number");
        }
    }
}