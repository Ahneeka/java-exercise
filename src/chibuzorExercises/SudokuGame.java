package chibuzorExercises;

public class SudokuGame {
    public static void main(String[] args) {
        int [][] sudoku = new int[9] [9];
        for(int i = 0; i < sudoku.length; i++ ){
            for (int counter = 0; counter < sudoku.length; counter++){
                int value = i + counter + 1;
                if (value > 9){
                    System.out.printf(" %d ", value - 9);
                }
                else {
                    System.out.printf(" %d ", value);
                }
            }
            System.out.println();
        }
    }
}
