import java.util.Scanner;

public class multiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();

        if ( number % 5 ==0){
            System.out.println("multiple ");
        }
        else{
            System.out.println("it's not multiple");
        }
    }
}
