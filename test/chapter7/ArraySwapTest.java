package chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySwapTest {
    @Test
    void swapLetters(){
        String [] letters = {"a","b"};
        String [] expected = {"b","a"};
        assertArrayEquals(expected,ArraySwap.swapLetters(letters));
    }

}