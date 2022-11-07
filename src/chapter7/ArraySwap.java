package chapter7;

public class ArraySwap {

    public static String[] swapLetters(String[] letters) {
//        String [] swapLetters = new String[letters.length];
//         for (int arrayCounter = 1; arrayCounter <= letters.length; arrayCounter++) {
//            swapLetters[letters.length - arrayCounter] = letters[arrayCounter - 1];
//        }
        return new String[]{letters[1], letters[0] };

    }
}
