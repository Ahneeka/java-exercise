package tdd;

import chapter2.ArithmeticsCal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticsCalTest {
    @Test
    void squareOfNum1(){
        ArithmeticsCal myArithmetic = new ArithmeticsCal();
        assertEquals(16,myArithmetic.squareOfNum1(4));
    }
    @Test
    void squareOfNum2(){
        ArithmeticsCal myArithmetic = new ArithmeticsCal();
       assertEquals(9,myArithmetic.squareOfNum2(3));
    }
    @Test
    void sumTwoNum(){
        ArithmeticsCal myArithmetic = new ArithmeticsCal();
        assertEquals(4,myArithmetic.sumTwoNum(2,2));
    }
    @Test
    void differenceOfTwoNum(){
        ArithmeticsCal myArithmetic = new ArithmeticsCal();
        assertEquals(3, myArithmetic.differenceOfTwoNum(6,3));
    }
}