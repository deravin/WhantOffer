package Practice_4.Task1_if_else;

import java.util.Scanner;

public class IfElseTaskSolver {
    // проверка числа на положительность
    public static void checkNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число ");
        int x = scanner.nextInt();

        if ( x > 0){
            System.out.println("Число положительное");
        } else if (x < 0){
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }
    // выводит наибольшее из двух чисел
    public static void printMaximumFromTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите первое число ");
        int x = scanner.nextInt();
        System.out.print("введите второе число ");
        int y = scanner.nextInt();

        if (x > y){
            System.out.println("наибольшее число - " + x);
        } else if (x == y) {
            System.out.println("числа равны");
        } else {
            System.out.println("наибольшее число - " + y);
        }
    }
    // принимает с консоли оценку (1–5) и выводит ее значение
    public static void checkScore(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите оценку ");
        int score = scanner.nextInt();

        if (score == 2 || score == 1) {
            System.out.println("Неудовлетворительно");
        } else if (score == 3){
            System.out.println("Удовлетворительно");
        } else if (score == 4){
            System.out.println("Хорошо");
        } else if (score == 5){
            System.out.println("Отлично");
        } else {
            System.out.println("ввели некорректное число.");
        }
    }
}
