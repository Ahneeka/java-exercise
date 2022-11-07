package chapter2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.ComparingNumbers;

import static org.junit.jupiter.api.Assertions.*;


 class ComparingNumbersTest {
     ComparingNumbers myComparing;
    @BeforeEach
     void setUp(){
        myComparing = new ComparingNumbers(15);
    }
    @Test
    void checkObjectNotNull(){
        assertNotNull(myComparing);
    }
    @Test
    void numberIsGreaterThan100(){
        assertEquals(false, myComparing.numberIsGreaterThan100());
    }
    @Test
    void numberIsLessThan100(){
        assertEquals(true,myComparing.numberIsLessThan100());
    }
    @Test
    void numberEqual100(){
        assertEquals(false,myComparing.numberEqual100());
    }
    @Test
    void numberNotEqual100(){
        assertEquals(true,myComparing.numberNotEqual100());
    }
    @Test
    void squareNumberIsGreaterThan100(){
        assertEquals(true,myComparing.squareNumberIsGreaterThan100());
    }
    @Test
    void squareNumberIsLessThan100(){
        assertEquals(false,myComparing.squareNumberIsLessThan100());
    }
    @Test
    void squareNumberEqualTo100(){
        assertEquals(false,myComparing.squareNumberEqualTo100());
    }
    @Test
    void squareNumberNotEqualTo100(){
        assertEquals(true, myComparing.squareNumberNotEqualTo100());
    }
 }