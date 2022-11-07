package CheckOut;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckOutApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> itemList = new ArrayList<>();
        ArrayList<Integer> quantityList = new ArrayList<>();
        ArrayList<Double> priceList = new ArrayList<>();

        System.out.println("Enter name");
        String name = scanner.nextLine();
        while(true){
            System.out.println("Enter item ");
            String item = scanner.nextLine();
            itemList.add(item);

            System.out.println("Enter quantity ");
            int quantity = scanner.nextInt();
            quantityList.add(quantity);

            System.out.println("Enter price ");
            double price = scanner.nextDouble();
            priceList.add(price);

            scanner.nextLine();
            System.out.println("Add more items: ");
            String input = scanner.nextLine().toLowerCase();

            if(!input.equals("yes")){
                System.out.printf("Your name %s%n",name);
                CheckOutMethodApp.displayOutCome(itemList, quantityList, priceList);
                break;
            }


        }
    }

}
