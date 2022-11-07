package chapter5;

public class ChristmasSong {
    public static void main(String[] args) {
        for(int i =1; i <= 12; i++){
            System.out.println(getDay(i)+ "of christmas my true love said to me");
            System.out.println(getlyrics(i));
        }
    }


    public static String getDay(int day){
        return switch (day) {
            case 1 -> ("on the first day");
            case 2 -> ("on the second day");
            case 3 -> ("on the third day");
            case 4 -> ("on the forth day");
            case 5 -> ("on the fifth day");
            case 6 -> ("on the sixth day");
            case 7 -> ("on the seventh day");
            case 8 -> ("on the eighth day");
            case 9 -> ("on the ninth day");
            case 10 -> ("on the tenth day");
            case 11 -> ("on the eleventh day");
            case 12 -> ("on the twelfth day");
            default -> "";
        };
    }

    private static String getlyrics (int day) {
        String lyrics = "";
        switch (day){
            case 12:
                lyrics += "Twelve drummers drumming\n";
            case  11:
                lyrics += "Eleven piper piping\n";
            case 10:
                lyrics += "Ten lords a-leaping\n";
            case 9:
                lyrics += "Nine ladies dancing\n";
            case 8:
                lyrics += "Eight maid a-milking\n";
            case 7:
                lyrics += "Seven swans a-swimming\n";
            case 6:
                lyrics += "Six geese a-laying\n";
            case 5:
                lyrics += "Five golden rings\n";
            case 4:
                lyrics += "Four calling birds\n";
            case 3:
                lyrics += "Three french hens\n";
            case 2:
                lyrics += "Two turtle doves\n";
            case 1:
                lyrics += "And a partridge in a pear tree\n";
            default:
                lyrics += "";
        }
        return lyrics;
    }

}
