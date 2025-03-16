package Practice_3.Task2_MathConstants;

public class MathConstants {
    static final double PI = 3.14159;
    final double E = 2.71828;

    static double circleArea(double radius){
        return  PI*Math.pow(radius,2);
    }

    static double circumference(double radius){
        return  2*PI*radius;
    }
}
