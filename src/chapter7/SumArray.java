package chapter7;

public class SumArray {
    public static void main(String[] args) {
        int [] numbers = new int[3];
        try{
            numbers [0] = 5;
            numbers [1] = 3;
            numbers [2] = 2;
            numbers [3] = 1;
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("You are going out of bounds!!!!!!!");

            for (int number : numbers){
                System.out.println(number);
            }
        }
    }
}
