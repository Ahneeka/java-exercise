package chapter7;

import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] numbers = {1,2,3,5,6,7};

        for(int i = 0; i < numbers.length; i++){
            int index = (int)(Math.random() * numbers.length);

            // switch the element from that position to the current one
            int temp = numbers[i];
            numbers[i] = numbers[index];
            numbers[index] = temp;
        }

        for (int x: numbers){
            System.out.print(x );
        }

    }
}
