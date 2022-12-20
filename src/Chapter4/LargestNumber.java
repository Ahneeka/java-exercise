package Chapter4;


public class LargestNumber {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};

        int x = largestNumber(numbers);
        System.out.println(x);
    }

    public static int largestNumber(int[] number) {
        int largest = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];

            }
        }
        return largest;
    }

}

