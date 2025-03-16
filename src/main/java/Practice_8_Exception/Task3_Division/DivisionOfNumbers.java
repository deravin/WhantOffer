package Practice_8_Exception.Task3_Division;

public class DivisionOfNumbers {
    //Безопасное деление: Реализуйте метод деления чисел с
    // обработкой ArithmeticException, если происходит деление на ноль.
    public static void division(int x, int y){
        try {
            if (y == 0){
                throw new ArithmeticException("Деление на ноль запрещено!");
            }
            double result = (double) x/y;
            System.out.println("результат: " + result);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        division(7,8);
    }
}
