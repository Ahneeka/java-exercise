import java.util.Scanner;

public class Acceleration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter initial-velocity");
        int u = input.nextInt();
        System.out.println("Enter acceleration");
        int a = input.nextInt();
        System.out.println("Enter time");
        int t = input.nextInt();

        double s= u * t + 0.5 * a * t *t;
        System.out.println(" "+ s);

    }
}

