package chapter7;

public class Largest {
    public static void main(String[] args) {
        int [] numbers = {3,20,4,93,69};
        int x = largestNumbers(numbers);
        System.out.println(x);
    }

    private static int largestNumbers(int[] numbers) {
        int largest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
            return largest;

    }
}
