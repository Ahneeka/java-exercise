package ArrayPracticeOnChapter7;

public class ArraySum {
    public static void main(String[] args) {
        int [] array = new int[10];
        array [0] = 87;
        array [1] = 68;
        array [2] = 94;
        array [3] = 100;
        array [4] = 83;
        array [5] = 78;
        array [6] = 85;
        array [7] = 91;
        array [8] = 76;
        array [9] = 87;
        int total = 0;
        for(int counter = 0; counter < array.length; counter++){
            total += array[counter];
        }
        System.out.printf("The total is: %d%n ",total );
    }
}
