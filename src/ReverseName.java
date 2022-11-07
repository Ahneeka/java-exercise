public class ReverseName {
    public static void main(String[] args) {
        System.out.println("reverse array of name");

        String [] array= {"o","l","a","l","e","k","a","n"};
        int index;
        for(index = array.length-1; index >= 0; index--){
            System.out.print(" "+array[index]);
        }
    }
}
