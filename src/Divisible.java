import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        double value = input.nextDouble();



        boolean divisible = (value / 3) ==0;
        System.out.printf("the answer is ", divisible);

    }
}
