import java.security.SecureRandom;
import java.util.Scanner;

public class RandomMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = scanner.nextInt();

        int x =  multiplication(num);
        System.out.println(x);
    }

    public static int multiplication(int number){
        SecureRandom secureRandom = new SecureRandom();
        return (1+secureRandom.nextInt(10)) * number;

    }
}
