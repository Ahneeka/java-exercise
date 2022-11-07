package CheckOut;

import java.util.ArrayList;

public class CheckOutMethodApp {
    public static void displayOutCome(ArrayList<String> itemList, ArrayList<Integer> quantityList, ArrayList<Double> priceList) {
        System.out.printf("%n%10s%15s%15s%15s%n ", "Item", "Quantity", "Price", "Total" );
        for(int index = 0; index < itemList.size(); index++){
            System.out.printf("%10s%15d%15.2f%15.2f%n ", itemList.get(index), quantityList.get(index),
                    priceList.get(index), quantityList.get(index) * priceList.get(index) );
            if(index == itemList.size()-1){
                System.out.printf("%40s%15.2f", "total price", getTotal(quantityList, priceList));
            }
        }
    }

    private static double getTotal(ArrayList<Integer> quantityList, ArrayList<Double> priceList) {
        double totalPrice = 0;
        for(int index = 0; index < quantityList.size(); index++){
            totalPrice = totalPrice + quantityList.get(index) * priceList.get(index);
        }
        return totalPrice;
    }
}

