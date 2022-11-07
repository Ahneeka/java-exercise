package chapter2;

public class DiameterCode {
    public static void main(String[] args) {

        int x = calculateDiameter(7);
        System.out.println(x);

        double y = calculateCircumference(15);
        System.out.println(y);

        double z = calculateArea(20);
        System.out.println(z);
    }

    public static int calculateDiameter(int radius) {
        int diameter = 2 * radius;
        return diameter;
    }
    public static double calculateCircumference(double radius){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }
    public static double calculateArea(double radius){
        double area = Math.PI * radius * radius;
        return area;
    }
}

