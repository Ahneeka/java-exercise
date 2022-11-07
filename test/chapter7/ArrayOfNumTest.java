package chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfNumTest {
    @Test
    void sumArray(){
       assertEquals(10,ArrayOfNum.getsum(new int[]{1,2,3,4}));
    }
    @Test
    void minimum(){
        assertEquals(1,ArrayOfNum.getminimum(new int[]{1,2,3,4}));
    }
    @Test
    void maximum(){
        assertEquals(4,ArrayOfNum.getmaximum(new int[]{1,2,3,4}));
    }
    @Test
    void subtraction(){
       assertEquals(10, ArrayOfNum.getsubtraction(new int[]{1,2,3,4}) );
    }


}