package tdd;

public class MinMaxArray {

    public int getMinimum(int[] nums) {
        int minimum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < minimum){
                minimum = nums[i];
            }
        }
        return minimum;
    }

    public int getMaxinum(int[] numbers) {
        int maximum = numbers[0];
        for(int index = 0; index < numbers.length; index++)
            if(numbers[index] > maximum){
                maximum = numbers[index];
            }
        return maximum;
    }

    public  int getSum(int[] nums) {
        int sum =nums [0];
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];

        }
        return sum;


    }

}
