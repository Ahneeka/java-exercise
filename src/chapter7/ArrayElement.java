package chapter7;

import java.util.Arrays;

public class ArrayElement {
    public static void main(String[] args) {
        int [] numbers = new int[10];
        int i;
        for( i = 0; i < numbers.length;i++ ){
            numbers[i] = i+1;
        }
       for(int j = 0; j < i; j++){
           System.out.print(numbers[j] + " ,");

       }
       //Arrays.stream(numbers).parallel().forEach(number-> System.out.println(numbers + ","));


        // System.out.println(Arrays.toString(numbers));



    }
}
