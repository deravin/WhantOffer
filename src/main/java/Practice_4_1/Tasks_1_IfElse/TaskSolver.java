package Practice_4_1.Tasks_1_IfElse;

import java.util.Scanner;

public class TaskSolver {
    // Проверка числа на положительность
    public static void isNumberPositive(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число ");
        int x = scanner.nextInt();

        if (x > 0) {
            System.out.println("Число положительное");
        } else if (x < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }

    //которая принимает два числа и выводит наибольшее из них
    public static int theBigestNumberIs(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("введиет первое число ");
        int x = scanner.nextInt();
        System.out.print("введите второе число ");
        int y = scanner.nextInt();

        return (x > y)? x : y;
    }

    //выводит значение оценки
    public static void checkScore(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите оценку ");
        int s = scanner.nextInt();
        if (s == 5)
            System.out.println("Отлично");
        else if (s == 4 )
            System.out.println("Хорошо");
        else if (s == 3)
            System.out.println("Удовлетворительно");
        else if (s == 2 || s == 1)
            System.out.println("Неудовлетворительно");
        else
            System.out.println("некорректная оценка");
    }


}
