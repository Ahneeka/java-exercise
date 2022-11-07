import java.util.Locale;

public class ReverseString {

    public static String reverse(String userString) {
        String reverseString = "";
        int backwardCounter = userString.length() - 1;
        while (backwardCounter != -1) {
            reverseString += userString.charAt(backwardCounter);
        }
        return reverseString;
    }

    public static String capitalJ(String userString) {
        String firstLetter = (userString.charAt(0) + "").toUpperCase();
        String otherLetter ="";
        for (int i = 1; i < userString.length(); i++)
            otherLetter += userString.charAt(i);
        return firstLetter +otherLetter.toLowerCase();
    }

}

