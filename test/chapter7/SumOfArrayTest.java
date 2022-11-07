package chapter7;

import snack.Sum;

import static org.junit.jupiter.api.Assertions.*;

class SumOfArrayTest {
    public static void main(String[] args) {
        //new instance of the class
        SumOfArray myArray = new SumOfArray();
        //method calling
        int[] numbers = {5, 10, 15, 20};

        System.out.println("the sum is: " + myArray.addNumbers(numbers));


    }
}