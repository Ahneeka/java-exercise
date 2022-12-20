package ArrayPracticeOnChapter7;

public class InitArray3 {
    public static void main(String[] args) {
        int [] array = new int[10];

        System.out.printf("%s%8s%n","Index "," Value");

        for(int i = 0; i < array.length; i++){
            array[i] = 2 + 2 * i;
            System.out.printf("%5d%8d%n",i,array[i]);
        }


    }
}
