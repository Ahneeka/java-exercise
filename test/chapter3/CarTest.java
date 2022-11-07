package chapter3;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    public static void main(String[] args){

        Car car1 = new Car("Mercedes", "2012", 1350000.00);
        Car car2 = new Car("Lexus", "2022", 3620000.00);

        System.out.printf("Car 1 model: %s; year: %s; price: %.2f%n",
                car1.getModel(), car1.getYear(), car1.getPrice());

        System.out.printf("Car 2 model: %s; year: %s; price: %.2f%n",
                car2.getModel(), car2.getYear(), car2.getPrice());

        System.out.printf("Car Price after applying discount");
        car1.setPrice(car1.getPrice() * (1 - 0.05));
        car2.setPrice(car2.getPrice() * (1 - 0.07));

        System.out.printf("%n Car 1 model: %s; year: %s; price: %.2f%n",
                car1.getModel(), car1.getYear(), car1.getPrice());

        System.out.printf("Car 2 model: %s; year: %s; price: %.2f%n",
                car2.getModel(), car2.getYear(), car2.getPrice());
    }

}

