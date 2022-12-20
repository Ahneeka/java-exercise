import chibuzorExercises.ReverseString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {


    @Test
    public void reverseString(){
        String input  = "Adeleke";
        String output;
        output = ReverseString.reverse(input);
        assertEquals("ekeledA", output);
    }

    @Test
    public void CapitalJ(){
        String input = "jerry";
        String output = ReverseString.reverse(input);
        assertEquals("Jerry", output);
    }

    @Test
    public void SentencedSet(){
        String input = "JERRY";
        String output = ReverseString.reverse(input);
        assertEquals("Jerry", output);
    }
}