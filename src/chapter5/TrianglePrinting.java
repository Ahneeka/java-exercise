package chapter5;

import javax.swing.plaf.IconUIResource;

public class TrianglePrinting {
    public static void main(String[] args) {

        int asterisks = 1;

        while (asterisks <= 10) {

            int pattern = 1;
            while (pattern <= asterisks) {
                System.out.printf("* ");
                pattern++;
            }
            System.out.println();
            asterisks++;
        }
        System.out.println();


            int num = 10;

            while (num >= 1) {

                int star = 10;
                while (star >= num) {
                    System.out.printf("* ");
                    star--;
                }
                System.out.println();
                num--;
            }
        System.out.println();

            int i = 10;
            while (i >=1){

                int j = 10;
                while (j >= i){
                    System.out.printf("* ");
                    j++;
                }
                System.out.println();
                i++;

            }
        }

    }
