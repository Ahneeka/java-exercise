

package chapter2;



import java.util.Scanner;

public class LargestAndSmallestIntegers {

    public void str(String name){
        if(name.equals("name"))
            System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter num1");
        int num1 = input.nextInt();

        System.out.println("Enter num2");
        int num2 = input.nextInt();

        System.out.println("Enter num3");
        int num3 = input.nextInt();

        System.out.println("Enter num4");
        int num4 = input.nextInt();

        System.out.println("Enter num5");
        int num5 = input.nextInt();

        int largest;
        largest = num1;
        if(num2 > largest){
            largest = num2;
        }

        if (num3 > largest){
            largest = num3;
        }

        if (num4 > largest){
            largest = num4;
        }

        if (num5 > largest) {
            largest = num5;
        }

        int smallest;
        smallest = num1;
        if (num2 < smallest){
            smallest = num2;
        }

        if (num3 < smallest){
            smallest = num3;
        }

        if (num4 < smallest){
            smallest = num4;
        }

        if (num5 < smallest) {
            smallest = num5;
        }
            System.out.println("The largest num is: " + largest);
            System.out.println("The smallest num is: "+ smallest);

    }
}
