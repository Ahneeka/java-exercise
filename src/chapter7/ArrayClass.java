package chapter7;

import java.time.chrono.MinguoDate;

public class ArrayClass {
    public static void main(String[] args) {
        //0 1 2 3 4 5
        int [] addNumbers = new int[6];
        addNumbers [0] = 2;
        addNumbers [1] = 4;
        addNumbers [2] = 6;
        addNumbers [3] = 8;
        addNumbers [4] = 5;
        addNumbers [5] = 9;

        int sum = 0;

        for(int index = 0; index < addNumbers.length; index++){
            sum = sum + addNumbers[index];
        }
            System.out.printf("the sum of the array is %d", sum);
    }
}
// The pseudocode
//declare a class
//initialize array addNumbers
//initialize sum to 0
//for each of the number
// add the number to sum
//display result
