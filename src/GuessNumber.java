
import java.util.Scanner;

public class GuessNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

       int magicnumber = 50;
       for (int counter = 5; counter>0; counter++){

           System.out.println("get input");
           int number = input.nextInt();
           if (number > magicnumber) {
               System.out.println("too high");
           }
               else if (  number < magicnumber ){
               System.out.println("too low");
           }
               else {
               System.out.println("enter perfect");
               break;
           }







       }

    }
}

