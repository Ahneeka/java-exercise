package chapter7;

import java.util.ArrayList;
import java.util.Arrays;

public class Char {
    public static <ArraysList> void main(String[] args) {
        char[][] alphabets = {{'x','o','x'}, {'x', 'o','x'},{'x','x','o'}};
        for(char row = 0; row < alphabets.length; row++){
            for(char column = 0; column < alphabets.length; column++){
                System.out.print(alphabets[row][column]+ " ");
            }
            System.out.println();
        }

    }
}
