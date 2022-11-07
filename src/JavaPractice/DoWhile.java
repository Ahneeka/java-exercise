package JavaPractice;

public class DoWhile {
    public static void main(String[] args) {
        int counter = 1;

        do{
            int num = 1;

            do{
                System.out.printf("%d ", num);
                num++;
            }while (num <= counter);
            System.out.println();
            counter++;
        }while(counter <= 20);
    }
}
