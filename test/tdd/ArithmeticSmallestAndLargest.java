package tdd;

public class ArithmeticSmallestAndLargest {
    public int AddThreeNum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int sumDivision(int num1) {
        return num1/3;
    }

    public int multiplication(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public int largestNumber(int num1, int num2, int num3) {

        int largest;
        largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest){
            largest = num3;
        }

        return largest;
    }

    public int smallest(int num1, int num2, int num3) {

        int smallest;
        smallest = num1;
        if (num2 < smallest){
            smallest = num2;
        }
        if (num3 < smallest ){
            smallest = num3;
        }
        return smallest;
    }
}
