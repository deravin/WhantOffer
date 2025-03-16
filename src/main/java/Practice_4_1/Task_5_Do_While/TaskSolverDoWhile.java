package Practice_4_1.Task_5_Do_While;

import java.util.Scanner;

public class TaskSolverDoWhile {
    // запрашивает у пользователя число и продолжает запрашивать,
    // пока введённое число не станет положительным.
    public static void askForPositiveNumber(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("введите число ");
        } while (scanner.nextInt() >= 0);
    }

    //которая запрашивает у пользователя пароль, пока он не введёт верный (заданный заранее).

    public static void checkPassword(String password){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("введите пароль ");
        } while (!scanner.nextLine().equals(password));
    }
    //  выводит числа от 1 до 10, но использует цикл do-while.
    public static void printNumbersFrom10to1(){
        int number = 10;
        do {
            System.out.print(number + " ");
            number--;
        } while (number > 0);
    }

}
