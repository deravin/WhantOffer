package Practice_4.Task4_while;

import java.util.Scanner;

public class WhileTaskSolver {
    //принимает с консоли число и выводит его факториал
    public static int factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число ");
        int number = scanner.nextInt();
        int factorial = 1;
        int i = 1;
        while ( i <= number){
            factorial = factorial * i;
            i++;
        }
        return factorial;
    }
    //выводит все чётные числа от 1 до введённого пользователем числа.
    public static void printAllEvenNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число ");
        int number = scanner.nextInt();
        int i = 1;
        while (i <= number){
            if (i % 2 == 0){
                System.out.print(i + " , ");
            }
            i++;
        }
    }
    //принимает с консоли положительное число и выводит обратный отсчёт от этого числа до 1.
    public static void printCountDown() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число ");
        int number = scanner.nextInt();
        int i = 0;
        while (i < number){
            System.out.print(number + " , ");
            number--;
        }
    }
}
