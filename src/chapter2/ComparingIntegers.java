package chapter2;//import java.util.Scanner;6 (Comparing Integers) Write an application that asks the user to enter one integer, obtains
//        it from the user and displays whether the number and its square are greater than, equal to, not equal
//        to, or less than the number 100. Use the techniques shown in


import java.util.Scanner;

public class ComparingIntegers {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

       System.out.println("enter number");
      int value = input.nextInt();

      int square = value * 2;

      if ((value + square) > 100) {
          System.out.printf("let it show that value %d and it's square %d is greater than 100", value, square);
      }
      System.out.println();

      if((value + square) == 100) {
          System.out.printf("the number %d is equal to it's square %d ", value, square);
      }
      System.out.println();

      if((value + square) != 100) {
          System.out.printf("the value %d is not equal to it's square %d", value, square);
      }
      System.out.println();

      if((value + square) < 100){
          System.out.printf("the answer %d and it's square %d is less than 100 ", value, square);
      }

  }
}
