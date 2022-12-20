package Chapter4;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter num1");
        int num = input.nextInt();


        System.out.println("Enter num2");
        int num2 = input.nextInt();


        System.out.println("Enter num3");
        int num3 = input.nextInt();


        System.out.println("Enter num4");
        int num4 = input.nextInt();


        System.out.println("Enter num5");
        int num5 = input.nextInt();


        System.out.println("Enter num6");
        int num6 = input.nextInt();


        System.out.println("Enter num7");
        int num7 = input.nextInt();


        System.out.println("Enter num8");
        int num8 = input.nextInt();


        System.out.println("Enter num9");
        int num9 = input.nextInt();


        System.out.println("Enter num10");
        int num10 = input.nextInt();


        int largest = 0;
        for (int i = 1; i < 10; i++) {

            if (num > largest) {
                largest = num;
            }
            if (num2 > largest) {
                largest = num2;
            }
            if (num3 > largest) {
                largest = num3;
            }
            if (num4 > largest) {
                largest = num4;
            }
            if (num5 > largest) {
                largest = num5;
            }
            if (num6 > largest) {
                largest = num6;
            }
            if (num7 > largest) {
                largest = num7;
            }
            if (num8 > largest) {
                largest = num8;
            }
            if (num9 > largest) {
                largest = num9;
            }
            if (num10 > largest) {
                largest = num10;

                System.out.println();
            }
        }

        System.out.println("largest: "+ largest);
    }
}
