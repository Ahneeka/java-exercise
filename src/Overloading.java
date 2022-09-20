public class Overloading {
    public int addNumber(int num1,int num2){
        return  num1 + num2;
    }
    public void addNumber (int num1, double num2){
        System.out.printf("the answer is %d and %f", num1,num2);
    }
    public double addNumber(double num1,double num2){
        return num1 + num2;
    }
    public  void addNumber(double num1,int num2){
        System.out.printf("the answer is %f and %d",num1,num2);
    }

    public static void main(String[] args) {
        Overloading myOverloading = new Overloading();

        System.out.println(myOverloading.addNumber(5,6));
        System.out.println();

        System.out.println(myOverloading.addNumber(4.5,4.8));
        System.out.println();

        myOverloading.addNumber(5,6.3);

        myOverloading.addNumber(6.5,7);

    }
}
