package Practice_9_FuncInterfacesLambdaStream.FuncInterfaces_Lambda.Task1;

public class Main {
    public static void main(String[] args) {
        MathOperation sum = (x,y) -> x + y;
        MathOperation substract = (x,y) -> x - y;
        MathOperation multiply = (x,y) -> x * y;
        MathOperation divide = (x,y) -> x / y;

        System.out.println(sum.apply(3,7));
        System.out.println(substract.apply(10,7));
        System.out.println(multiply.apply(10,7));
        System.out.println(divide.apply(10,2));
    }
}
