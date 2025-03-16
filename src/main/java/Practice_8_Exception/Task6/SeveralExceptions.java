package Practice_8_Exception.Task6;

public class SeveralExceptions {
    //Работа с несколькими catch: Напишите метод, который вызывает несколько исключений
    // (NullPointerException, ArithmeticException, NumberFormatException) и обрабатывает их разными catch.
    public static void workWithData(int x, String number2){
        try {
            if (number2 == null){
                throw new NullPointerException("Второе число не задано");
            }
            int number = Integer.parseInt(number2);
            int result = x/number;
        } catch (NullPointerException e){
            System.out.println("Второе число не задано");
        } catch (ArithmeticException e){
            System.out.println("Ошибка! Деление на ноль!");
        } catch (NumberFormatException e) {
            System.out.println("Формат второго числа не верный");
        }
    }

    public static void main(String[] args) {
        workWithData(5,null);
        workWithData(5, "0");
        workWithData(7,"df");
    }
}
