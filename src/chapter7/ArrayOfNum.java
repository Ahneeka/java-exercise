package chapter7;

public class ArrayOfNum {
    public static int getsum(int[] numbers) {
        int sum=0;

        for (int i = 0; i < numbers.length;i ++){
            sum += numbers[i];
        }
        return sum;

    }

    public static int getminimum(int[] numbers) {
        int minimum = numbers[0];
        for(int i =0; i < numbers.length; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }
            return minimum;
    }

    public static int getmaximum(int[] numbers) {
        int maximum = numbers[0];
        for(int i =0; i < numbers.length; i++){
            if (numbers[i] > maximum){
                maximum = numbers[i];
            }
        }
        return maximum;
    }

    public static int getsubtraction(int[] numbers) {
    int subtraction = 0;
    for(int i = 0; i < numbers. length; i++ ){
        subtraction +=numbers[i];
    }
        return subtraction;
   }
}
