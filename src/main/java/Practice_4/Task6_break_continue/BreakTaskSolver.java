package Practice_4.Task6_break_continue;

import java.util.Scanner;

public class BreakTaskSolver {
    //запрашивает числа у пользователя и выводит их сумму. Если пользователь вводит отрицательное число, программа завершает выполнение (break).
    public static void sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        while (true) {
            System.out.print("Введите число ");
            number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum = sum + number;
            System.out.println("Сумма чисел равна " + sum);
        }
    }

    //выводит числа от 1 до 20, пропуская те, которые делятся на 3 (continue).
    public static void printNumbersWithoutAllThatDivisibleBy3() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    //выводит первые 10 чисел, которые одновременно делятся на 2 и 5.
    public static void printNumbersThatDivisibleBy3And5() {
        int number = 0;
        for (int i = 1;; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
                number++;
            }
            if (number == 10) {
                break;
            }

        }
    }
}
