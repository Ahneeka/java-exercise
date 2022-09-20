//public class NumberSum {
  //  public static void main(String[] args){
   //     System.out.println( 74+36);
 //   }

import java.util.Scanner;

//}
public class NumberSum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first digit: ");
        int number1;
        number1 = input.nextInt();

        System.out.println("Enter second digit: ");
        int number2 = input.nextInt();

        System.out.printf("The answer is: %d%n", (number1 / number2));



    }

}