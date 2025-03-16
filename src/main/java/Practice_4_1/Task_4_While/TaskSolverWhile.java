package Practice_4_1.Task_4_While;

import java.util.Scanner;

public class TaskSolverWhile {
    // принимает с консоли число и выводит его факториал, используя while.
    public static int factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int number = scanner.nextInt();
        int factorial = 1;
        int i = 1;

        while (i <= number){
            factorial = factorial*i;
            i++;
        }
        return factorial;
    }

    // выводит все чётные числа от 1 до введённого пользователем числа.
    public static void evenNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число ");
        int number = scanner.nextInt();
        int i = 1;
        while (i <= number){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
            i++;
        }
        scanner.close();
    }

    // принимает с консоли положительное число и выводит обратный отсчёт от этого числа до 1.
    public static void countFromNumberTo1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число ");
        int number = scanner.nextInt();
        while (0 < number){
            System.out.print(number + " ");
            number--;
        }
    }
}
