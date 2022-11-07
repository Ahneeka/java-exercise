package JavaPractice;

public class ForClass {
    public static void main(String[] args) {
        for(int counter =1; counter <= 20; counter++){
            for(int num = 1; num<= counter; num++){
                System.out.printf("%d ", num);
            }
            System.out.println();
        }
    }
}
