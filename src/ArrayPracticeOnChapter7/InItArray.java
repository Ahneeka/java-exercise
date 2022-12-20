package ArrayPracticeOnChapter7;

public class InItArray {
    public static void main(String[] args) {
        int [] array = new int[10];
        System.out.printf("%5s%8s\n" , "index " , "  value");

        for (int i = 0; i < array.length; i++){
            System.out.printf("%5d%8d\n", i , array[i]);
        }

    }

}
