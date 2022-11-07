package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxArrayTest {
    MinMaxArray myMinMaxarray;

    @BeforeEach
    void BeforeEachTest() {
        myMinMaxarray = new MinMaxArray();
    }


        @Test
        void getMinimumTest () {
            MinMaxArray minMaxArray = new MinMaxArray();
            int[] numbers = {8, 56, 73, 4, 7, 9};
            assertEquals(4, minMaxArray.getMinimum(numbers));
        }
        @Test
        void getMaxinumTest () {
            MinMaxArray minMaxArray = new MinMaxArray();
            int[] numbers = {5, 7, 2, 18, 10};
            assertEquals(18, minMaxArray.getMaxinum(numbers));
        }

}