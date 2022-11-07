package chapter3;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateCalculatorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         HeartRateCalculator myHeartRateCalculator = new HeartRateCalculator("Ahneeka", "Jaz","May", 27, 2001, 21);

        System.out.println("Enter your firstName: ");
        String firstName = input.nextLine();
        myHeartRateCalculator.setFirstName(firstName);

        System.out.println("Enter your lastName: ");
        String lastName = input.nextLine();
        myHeartRateCalculator.setLastName(lastName);

        System.out.println("Enter your monthOfBirth: ");
        String monthOfBirth = input.nextLine();
        myHeartRateCalculator.setMonthOfBirth(monthOfBirth);

        System.out.println("Enter your dayOfBirth: ");
        int dayOfBirth = input.nextInt();
        myHeartRateCalculator.setDayOfBirth(dayOfBirth);

        System.out.println("Enter your yearOfBirth:  ");
        int yearOfBirth = input.nextInt();
        myHeartRateCalculator.setYearOfBirth(yearOfBirth);

        System.out.println("Enter your age");
        int age = input.nextInt();
        myHeartRateCalculator.setAge(age);

        displayProfile(myHeartRateCalculator);
    }

    private static void displayProfile(HeartRateCalculator myHeartRateCalculator) {
        System.out.println("The patient name is: "+ myHeartRateCalculator.getFirstName());
        System.out.println();

        System.out.println("The patient name is: "+ myHeartRateCalculator.getLastName());
        System.out.println();

        System.out.println("The patient month is: "+ myHeartRateCalculator.getMonthOfBirth());
        System.out.println();

        System.out.println("The ");

    }

}