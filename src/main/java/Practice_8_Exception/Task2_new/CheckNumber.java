package Practice_8_Exception.Task2_new;

import java.util.Scanner;

public class CheckNumber {
    // Проверка ввода: Создайте собственное исключение InvalidInputException,
    // которое выбрасывается при вводе некорректного значения (например, отрицательного числа).
    public static void checkNumber(int number) throws InvalidInputException{
        if (number < 0){
            throw new InvalidInputException("Введено неверное число!");
        } else {
            System.out.println("Молодец!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("введите число ");
            checkNumber(scanner.nextInt());
        } catch (InvalidInputException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("Введено не число!");
        } finally {
            scanner.close();
        }
    }

}
