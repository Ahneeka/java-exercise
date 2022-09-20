import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int ahneeka = input.nextInt();

        int factorial = 1;
        for( int counter = 1; counter <= ahneeka;  counter++){
            factorial = counter * factorial;
        }

        System.out.printf("the factorial is %d", factorial);
    }
}
