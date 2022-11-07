package JavaPractice;

public class WhilePractice {
    public static void main(String[] args) {

        int counter = 1;

        while (counter <= 10){
            int num = 1;
            while (num <= counter){
                System.out.printf("%d ", num);
                num++;
            }
            System.out.println();
            counter++;
        }
    }
}
