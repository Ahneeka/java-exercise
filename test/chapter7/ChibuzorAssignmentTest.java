package chapter7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChibuzorAssignmentTest {
    @Test
    void LargestNumber(){
        int [] numbers = {3,45,6,89,0,9};
        int largest = ChibuzoAssignment.largestNumber(numbers);
        assertEquals(89,largest );
    }

    @Test
    void ReverseNumbers(){
        int [] numbers = {1,2,3,4,5,6};
        int[] reverse = ChibuzoAssignment.reverseNumbers(numbers);
        int[] expected = {6, 5, 4, 3, 2, 1};
        assertArrayEquals(expected, reverse);

    }
    @Test
    void OccurenceNumber(){
        int [] numbers = {1,4,3,2,6};
        assertTrue(ChibuzoAssignment.occurenceNumber(numbers, 9));
    }
    @Test
    void OddNumbers(){
        int [] numbers = {2,4,5,6,7};
        int [] expected = {4,6};
        assertArrayEquals(expected, ChibuzoAssignment.oddNumber(numbers));
    }
    @Test
    void EvenNumbers(){
        int [] numbers = {4,6,3,1,5};
        int [] expected = {4, 3, 5};
        assertArrayEquals(expected,ChibuzoAssignment.evenNumber(numbers));
    }
    @Test
    void TotalNumbers(){
        int [] numbers = {4,2,3,6,3};
        int total = ChibuzoAssignment.totalNumbers(numbers);
        assertEquals(18,total);
    }
    @Test
    void sumTwoLargest(){
        int [] numbers = {4,10,20,7};
        int largest = ChibuzoAssignment.sumTwoLargest(numbers);
        assertEquals(30,largest);
    }





}