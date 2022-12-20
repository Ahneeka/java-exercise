package spaceAsterisks;

public class SpaceAsterisks {
    public static void main(String[] args) {
        int[][] table = new int[10][10];

        table [3][3] = 1;

        table[3][5] = 1;
        table[2][4] = 1;
        table[1][3] = 1;
        table[2][2] = 1;
        table[4][4] = 1;
        table[5][5] = 1;



        for (int i = 0; i < table.length ; i++) {
            for (int j = 0; j < table[i].length ; j++) {
                String toprint = " ";
                if( table[i][j] == 0){
                    toprint = "-";
                }else{
                    toprint = "*";
                }
                System.out.print(" "+toprint);
              //  System.out.print(" " + (table[i][j] == 0 ? " " : "#") + " "); // Using ternary operator
            }
            System.out.println();
        }
    }
}
