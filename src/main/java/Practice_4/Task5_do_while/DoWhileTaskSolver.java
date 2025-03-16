package Practice_4.Task5_do_while;

import java.util.Scanner;

public class DoWhileTaskSolver {
    //запрашивает у пользователя число и продолжает запрашивать, пока введённое число не станет положительным.
    public static void askPositiveNumber(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.print("Введите число ");
            number = scanner.nextInt();
        } while (number >= 0);
    }
    //запрашивает у пользователя пароль, пока он не введёт верный (заданный заранее).
    public static void askPassword(String pass){
        Scanner scanner = new Scanner(System.in);
        String password;
        do {
            System.out.print("введите пароль ");
            password = scanner.nextLine();
        } while (!password.equals(pass));
    }
    //выводит числа от 1 до 10, но использует цикл do-while.
    public static void printNumbers(){
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i<=10);
    }
}
