import chapter2.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator myCalculator;
    @BeforeEach
    void BeforeEachTest(){
        myCalculator = new Calculator();
    }
    @Test
    void testObjectExist() {
        Calculator myCalculator = new Calculator();
        assertNotNull(myCalculator);
    }
    @Test
    void addTwoNumbers(){
        assertEquals(50,myCalculator.addTwoNumbers(20,30));
    }

    @Test
    void multiplyTwoNumbers(){
        assertEquals(30,myCalculator.multiplyTwoNumbers(5,6));
    }

    @Test
    void divideTwoNumbers(){
        assertEquals(30,myCalculator.divideTwoNumbers(20,10));
    }



    }
