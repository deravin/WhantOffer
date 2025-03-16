package Practice_1.Task1_2_3_4_7_8_9_10;

public class MathOperations {
    public static int add(int x, int y){
        return x + y;
    }
    public static int subtract(int x, int y) {
        return x - y;
    }
    public static int multiply(int x, int y){
        return x * y;
    }
    public static double divide(int x, int y){
        return (double) x / y;
    }

    public static int findMax(int a, int b){
        return Math.max(a,b);
    }

    public static int difference(int x, int y){
        int difference = x - y;
        return Math.abs(difference);
    }

    public static int squareArea(int side){
        return side*side;
    }
    public static int squarePerimeter(int side){
        return side*4;
    }
    public static double findHypotenuse(double a, double b){
        return Math.sqrt(a) + Math.sqrt(b);
    }
    public static double circleCircumference(double radius){
        return 2*Math.PI*radius;
    }
    public static double calculatePercentage(double total, double part){
        return (part / total) * 100;
    }
    public static double celsiusToFahrenheit(double celsius){
        return ((double) 9/5)* celsius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return ((double) 5/9)*(fahrenheit - 32);
    }



}
