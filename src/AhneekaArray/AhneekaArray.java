package AhneekaArray;

import chapter2.Calculator;

public class AhneekaArray {
    public static void main(String[] args) {
        int[] ages = {4, 7, 5, 3, 9};
        String[] names = {"Ade", "Bisi"};
        Calculator[] calculators = {};

        int[] amounts = new int[5];
        Calculator[] myCalc = new Calculator[5];

        Calculator casio = new Calculator();
        myCalc[0] = casio;

        for (int age : ages){
            System.out.println(age);
        }
    }
}
