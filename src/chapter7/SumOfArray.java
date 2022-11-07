package chapter7;

public class SumOfArray {
   public int addNumbers(int [] numbers){
       int sum = 0;
       for (int index =0; index < numbers.length; index++){
           sum = sum + numbers[index];
       }
       return sum;
   }

}



