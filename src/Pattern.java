public class Pattern {
    public static void main(String[] args) {

        for(int counter = 1; counter <= 6; counter++) {
            for(int number = 1; number <= counter ; number++){
                System.out.print(number);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int counter =6; counter >= 1; counter--) {
            for (int number = 1; number <= counter; number++){
                System.out.print(number );
            }
            System.out.println();
        }

       for (int counter =1; counter <= 6; counter++){
            System.out.print(" ".repeat(6-counter));
        for (int number = counter; number >= 1; number--) {
            System.out.print(number);
        }
           System.out.println();
    }
        System.out.println();

       for(int counter = 1; counter <= 6; counter--){
           for (int number = 1; number <= counter ; number++) {
               System.out.println(number);
           }
           System.out.println();
       }

    }
}
