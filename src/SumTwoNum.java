public class SumTwoNum {
    public static void main(String[] args) {
        int x = calculateNum(3, 3);
        System.out.println(x);

        int y = calculateNum(1,4,5,6,3);
        System.out.println(y);

        String z = name("Ahneeka");
        System.out.println(z);


    }
        private static int calculateNum(int num1, int num2){
        int sum = num1 + num2;
            return sum;
    }
         private static int calculateNum(int num1, int num2, int num3, int num4, int num5){
        int total = num1 + num2 + num3 + num4 + num5;
        return total;
         }

         private static String name(String name){
        String greet= "Hello " + name;
        return greet;
         }
}

