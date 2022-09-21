package chapter7;

public class ArrayOfColour {
    public static void main(String[] args) {
        // 0 1 2 3 4 5 6
        String [] colour = new String[7];
        colour [2] = "Red";
        colour [3] = "Blue";
        colour [4] = "Black";
        colour [0] = "pink";
        colour [1] = "Green";
        colour [5] = "yellow";
        colour [6] = "purple";

        for (int index = 0; index < colour.length; index++ ){
            System.out.println(colour[index]);
        }

    }
}
