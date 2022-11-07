package chapter7;

public class ChibuzoAssignment {
    public static int largestNumber(int[] numbers) {
        int largest = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static  int [] reverseNumbers(int[] numbers) {
        int[] reverseNumbers = new int[numbers.length];
        for (int arrayCounter = 1; arrayCounter <= numbers.length; arrayCounter++) {
            reverseNumbers[numbers.length - arrayCounter] = numbers[arrayCounter - 1];
        }
        return reverseNumbers;
    }

    public static boolean occurenceNumber(int[] numbers, int number) {
        boolean isIn = false;
        for( int counter = 1; counter < numbers.length;counter++){
            if (number == numbers[counter]) {
                isIn = true;
                break;
            }
        }

        return isIn;
    }

    public static int[] oddNumber(int[] numbers) {
        int [] number = new int[numbers.length / 2];
        int counter = 0;
        for(int arrayCounter = 1; arrayCounter < numbers.length; arrayCounter+=2){
            number[counter] = numbers[arrayCounter];
            counter++;
        }
        return number;

    }

    public static int[] evenNumber(int[] numbers) {
        int lengthOfArray = 0;
        if (numbers.length % 2 == 0) lengthOfArray = numbers.length / 2;
        else lengthOfArray = (numbers.length / 2) + 1;
        int [] number = new int[lengthOfArray];
        int counter = 0;
        for(int arrayCounter = 0; arrayCounter < numbers.length; arrayCounter+=2){
            number[counter] = numbers[arrayCounter];
            counter++;
        }
        return number;
    }

    public static int totalNumbers(int[] numbers) {
        int sum = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }

    public static int sumTwoLargest(int[] numbers) {
        int largest = numbers[0];
        int index = 0;
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
                index = i;
            }
        }
        numbers[index] = 0;

        int largest2 = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] > largest2){
                largest2 = numbers[i];
            }
        }
        int sum = 0;
        sum = largest + largest2;
        return sum;
    }

}
