package Practice_4.TaskFromVideo.Solvers;

import java.util.Random;
import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void findNumber (){

        Scanner scanner = new Scanner(System.in);
        int random = new Random().nextInt(7);

        int number;

        do {
            System.out.print("угадай число ");
            number = scanner.nextInt();
        } while (number != random);
        System.out.println("молодец, красава");
    }

    public static void negativeDigit(){
        Scanner scanner = new Scanner(System.in);
        int number;
        int min = 2147483647;
        do {
            System.out.print("введите число ");
            number = scanner.nextInt();
            if (number < min && number >= 0)
                min = number;
        } while (number >= 0);
        System.out.println("минимальное число " + min);
        scanner.close();
    }

    public static void authorization(){
        Scanner scanner = new Scanner(System.in);

        String login;
        String password;

        do {
            System.out.print("введите логин ");
            login = scanner.nextLine();
            System.out.print("введите пароль ");
            password = scanner.nextLine();
        } while (!login.equals("admin") || !password.equals("123"));

        System.out.println("доступ разрешен");



    }

    public static void main(String[] args) {
     // findNumber();
     //   negativeDigit();
        authorization();
    }
}
