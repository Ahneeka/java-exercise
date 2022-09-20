public class ArrayPractices {
    public static void main(String[] args) {
        // when naming an array u use plural, [] is the array.
        int[] numbers;
        //line 6 is just showing the amount of space or length
        // our index 0 1 2 3 4
        numbers = new  int[5];
        numbers[0] = 2;
        numbers[3] = 4;
        numbers[2] = 8;
        numbers[1] = 10;
        numbers[4] = 7;

       // or we write our arrqy like this
       // int [] number = {2,4,8,10,7};

        for(int index = 0; index < numbers.length; index ++){
            System.out.println(numbers[index]);
        }


    }
}
