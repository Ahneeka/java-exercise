package Chapter4;

public class Factorial {
    public int getFactorial(int number){
        int result = -1;
        for (int i = number - 1; i > 0; i--){
            result = result * i;
        }
        return result;
    }
}
