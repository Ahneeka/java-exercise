package Calculator;

public class CalculatorDriver {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println("The answer is: "+ myCalculator.sumNumbers(2,4) );
        System.out.println("The answer is: "+ myCalculator.sumNumbers(2.5,4.3) );

        System.out.println("The answer is: "+ myCalculator.subtractNumbers(6,3));

        System.out.println("The answer is: "+ myCalculator.divideNumbers(4,2));

        System.out.println("The answer is: "+ myCalculator.multipleNumbers(4,2));

        System.out.println("The answer is: "+ myCalculator.squareNumbers(2));

        System.out.println("The answer is: "+ myCalculator.pi(2));

        System.out.println("The answer is: "+ myCalculator.modulus(6));
    }
}
