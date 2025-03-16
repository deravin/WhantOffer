package Practice_9_FuncInterfacesLambdaStream.FuncInterfaces_Lambda.Example;

public class MainForMath {
    public static void main(String[] args) {
        MathOperations sum = (x,y) -> x+y;
        MathOperations substract = (x,y)-> x-y;
        MathOperations multiply = (x,y)-> x*y;
        MathOperations divide = (x,y)-> x/y;

        System.out.println(sum.apply(2,3));
        System.out.println(substract.apply(20,3));
        System.out.println(multiply.apply(12,1));
        System.out.println(divide.apply(6,3));

    }
}
