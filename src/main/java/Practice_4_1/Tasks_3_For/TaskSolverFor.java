package Practice_4_1.Tasks_3_For;

import java.util.Scanner;

public class TaskSolverFor {
    //Напишите программу, которая выводит все числа от 1 до 100, которые делятся на 3.
    public static void numbersThatDivisibleBy3(){
        for (int i = 1 ; i <= 100 ; i++){
            if (i % 3 == 0)
                System.out.print(i + " , ");
        }
    }
    //принимает с консоли число n и вычисляет сумму всех чисел от 1 до n (включительно).
    public static void sumOfNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1 ; i <= n ; i ++){
            sum = sum + i;
        }
        System.out.println(sum);
    }

    //вывести таблицу умножения для числа, введённого пользователем
    public static void multiplicationTable(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число ");
        int x = scanner.nextInt();

        for (int i = 1 ; i <= 10; i++){
            System.out.println( x + " * " + i + " = " + i*x);
        }
    }
}
