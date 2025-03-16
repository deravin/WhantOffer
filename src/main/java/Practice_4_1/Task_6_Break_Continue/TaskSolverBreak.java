package Practice_4_1.Task_6_Break_Continue;

import java.util.Scanner;

public class TaskSolverBreak {
    //Напишите программу, которая запрашивает числа у пользователя
    // и выводит их сумму. Если пользователь вводит отрицательное число,
    // программа завершает выполнение (break).

    public static void printSumOfNumbers(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        while (true){
            System.out.print("Введите число ");
            number = scanner.nextInt();
            if (number < 0){
                break;
            }
            sum = sum + number;
            System.out.println("cумма чисел равна " + sum);
        }
    }

    //Создайте программу, которая выводит числа от 1 до 20, пропуская те, которые делятся на 3 (continue).
    public static void printNumbersThatDividedBy3(){
        for (int i = 1; i <= 20; i++){
            if (i % 3 == 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }

    //Реализуйте программу, которая выводит первые 10 чисел,
    // которые одновременно делятся на 2 и 5.
    // Используйте break для завершения цикла, когда будет найдено 10 чисел.

    public static void printTenNumbers(){
        int j = 0;
        for (int i = 1; i < 2147483647; i++){
            if (i % 2 == 0 && i % 5 == 0){
                System.out.print(i + " ");
                j++;
            }
            if (j == 10)
                break;
        }
    }

}
