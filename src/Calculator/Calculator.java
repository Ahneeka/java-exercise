package Calculator;

public class Calculator {
    public int sumNumbers(int num1, int num2){
        int sum;
        sum = num1 + num2;
        return sum;
    }
// Method overloading is when u have method with the same naming but different data type like line 4 and 10
    public double sumNumbers(double num1, double num2){
        double sum;
        sum = num1 + num2;
        return sum;
    }

    public int subtractNumbers(int num1, int num2){
        int minus;
        minus = num1 - num2;
        return minus;
    }
    public int divideNumbers(int num1, int num2){
        int division;
        division = num1 / num2;
        return division;
    }
    public int multipleNumbers(int num1, int num2){
        int multiplication;
        multiplication = num1 * num2;
        return multiplication;
    }
    public int squareNumbers(int num1){
        int square;
        square = num1 * num1;
        return square;
    }
    public int pi(int num1){
        int pi;
        pi = (int) (Math.PI * num1);
        return pi;
    }
    public int modulus(int num){
        int module;
        module = (num / 2 );
        return module;
    }
}
