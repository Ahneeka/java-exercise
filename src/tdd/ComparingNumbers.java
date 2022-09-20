package tdd;

public class ComparingNumbers {

    private final int num;

    public ComparingNumbers(int num) {
        this.num = num;
    }

    public boolean numberIsGreaterThan100() {
        if(num > 100){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean numberIsLessThan100() {
        if(num < 100){
            return true;
        }
        else{
            return false;
        }

    }

    public boolean numberEqual100() {
        if(num ==100){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean numberNotEqual100() {
        if(num != 100){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean squareNumberIsGreaterThan100() {
        int squareNumber = num *num;
        if(squareNumber > 100){
            return true;
        }
        else {
            return false;
        }

    }

    public boolean squareNumberIsLessThan100() {
        int squareNumber = num *num;
        if(squareNumber < 100){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean squareNumberEqualTo100() {
        int squareNumber = num * num;
        if (squareNumber == 100){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean squareNumberNotEqualTo100() {
        int squareNumber = num * num;
        if(squareNumber != 100){
            return true;
        }
        else {
            return false;
        }
    }
}


