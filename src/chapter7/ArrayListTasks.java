package chapter7;

import java.util.ArrayList;

public class ArrayListTasks {
    public static void main(String[] args) {
        ArrayList<String>  strings = new ArrayList<>();
        //int[] scores = new int[5];
        strings.add("G-String");
        strings.add("E-String");

        strings.remove(1);
        System.out.println(strings.size());

        for(String string: strings){
            System.out.println(strings);
        }
    }
}
