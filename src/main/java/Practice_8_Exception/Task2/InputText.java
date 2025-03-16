package Practice_8_Exception.Task2;

import java.util.Scanner;

public class InputText {
    //Проверка ввода: Создайте собственное исключение InvalidInputException,
    // которое выбрасывается при вводе некорректного значения (например, отрицательного числа).
    public static void checkTextCorrection(int number) throws InvalidInputException {
        if (number < 0) {
            throw new InvalidInputException("Введено неверное число");
        } else {
            System.out.println("Да ты красава");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("введите число ");
            InputText.checkTextCorrection(scanner.nextInt());
        } catch (InvalidInputException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("ввели не число");
        }
        finally {
            scanner.close();
        }

    }
}
