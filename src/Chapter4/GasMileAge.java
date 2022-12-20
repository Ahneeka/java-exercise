package Chapter4;

import java.util.Scanner;

public class GasMileAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalMile = 0;
        int totalGallon = 0;

        while(true){
            System.out.println("enter mile covered ");
            int mile = input.nextInt();

            System.out.println("enter gallon used");
            int gallon = input.nextInt();

            totalMile = mile + totalMile;
            totalGallon = gallon + totalGallon;

            System.out.println("do u want to continue another trip press 1 to continue and 0 to quit");
            int response = input.nextInt();

            if(response ==1){
                continue;

            }else{
                break;
            }




        }

        double average = totalMile / totalGallon;
        System.out.printf("the total mile is %d and total gallon is %d, the average is %f", totalMile, totalGallon, average);

    }
}
