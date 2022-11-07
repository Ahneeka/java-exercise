package JavaPractice;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int counter = 1; counter <= 10; counter++ ){
             sum = sum + counter;
        }
        System.out.printf("%d ",  sum);
    }
}
