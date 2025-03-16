package Practice_4.Task3_for;

import java.util.Scanner;

public class ForTaskSolver {
    //выводит все числа от 1 до 100, которые делятся на 3.
    public static void printNumbersThatDivisibleBy3(){
        for (int i = 1; i <= 100 ; i++){
            if (i % 3 == 0)
                System.out.print(i + " , ");
        }
    }
    //принимает с консоли число n и вычисляет сумму всех чисел от 1 до n (включительно).
    public static int sumOfAllNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= number; i++){
            sum = sum + i;
        }
        return sum;
    }
    //выводит таблицу умножения для числа, введённого пользователем.
    public static void printMultiplicationTable (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число ");
        int number = scanner.nextInt();
        int multiplication = 0;
        for (int i = 1; i <= 10; i++){
            multiplication = number*i;
            System.out.println( number + " * " + i + " = " + multiplication);
        }
    }
}
