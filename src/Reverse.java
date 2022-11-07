import java.io.OptionalDataException;

public class Reverse {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        reverse(array);
    }
    public  static void reverse(int [] array){
        System.out.println("array in reverse order");
        for(int i = array.length-1; i >= 0; i--) {
            System.out.print(" " + array[i]);
        }

    }
}
