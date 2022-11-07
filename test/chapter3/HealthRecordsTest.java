package chapter3;

import chapter3.HealthRecords;

import java.util.Scanner;

class HealthRecordsTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HealthRecords myHealthRecord = new HealthRecords("chinwoke", "obinna", "male",5,10, 1987, 165, 70, 25 );

        System.out.println("Enter your firstName: ");
        String name = input.nextLine();
       myHealthRecord.setFirstName(name);

        System.out.println();

        System.out.println("Enter your lastName:  ");
        String lastname = input.nextLine();
        myHealthRecord.setLastName(name);

        System.out.println();

        System.out.println("Enter your gender:  ");
        String gender = input.nextLine();
        myHealthRecord.setGender(gender);

        System.out.println();

        System.out.println("Enter your monthOfBirth:  ");
        int birth = input.nextInt();
        myHealthRecord.setMonthOfBirth(birth);

        System.out.println();

        System.out.println("Enter your dayOfBirth:  ");
        int day = input.nextInt();
        myHealthRecord.setDayOfBirth(day);

        System.out.println();

        System.out.println("Enter your yearOfBirth:  ");
        int year = input.nextInt();
        myHealthRecord.setYearOfBirth(year);

        System.out.println();

        System.out.println("Enter your height:  ");
        int height = input.nextInt();
        myHealthRecord.setHeight(height);

        System.out.println();

        System.out.println("Enter your weight:  ");
        int weight = input.nextInt();
        myHealthRecord.setWeight(weight);


        ShowPatientDetails(myHealthRecord);




    }

    private static void ShowPatientDetails(HealthRecords myHealthRecord) {
        System.out.printf("your firstName is: %s", myHealthRecord.getFirstName());
        System.out.println();

    }
}