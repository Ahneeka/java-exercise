package chibuzorExercises;

import java.util.Scanner;

public class MinimumMax {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int [] numbers = new int[5];
    int i = 0;
    while ( i < 5){
        System.out.println("Enter valid number between 0 to 100");
        int num = input.nextInt();
        if(num >= 0 && num <= 100) {
            numbers[i] = num;
            i++;
        }else {
            System.out.println("Wrong, enter correct number");
        }

    }
    int x = getMinimum(numbers);
    System.out.println("The minimum is: "+ x);

    int z = getMaximum(numbers);
    System.out.println("The Maximum is: " +z);

}
  public static int getMinimum(int[] nums) {
            int minimum = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] < minimum){
                    minimum = nums[i];
                }
            }
            return minimum;
    }

            public static int getMaximum(int[] numbers) {
                int maximum = numbers[0];
                for(int index = 0; index < numbers.length; index++)
                    if(numbers[index] > maximum){
                        maximum = numbers[index];
                    }
                return maximum;
            }


    }
