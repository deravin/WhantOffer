package ReCheck;

import java.util.Scanner;

public class IfElseWhileSwitch {
    public static void main(String[] args) {
        //Напишите программу, которая принимает с консоли число и проверяет:
        //Если число больше 0, выведите "Число положительное".
        //Если меньше 0 — "Число отрицательное".
        //Если равно 0 — "Число равно нулю".

      /**  Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int number = scanner.nextInt();
        if(number > 0)
            System.out.println("Число положительное");
        else if (number < 0)
            System.out.println("Число отричательное");
        else
            System.out.println("Число равно нулю");
       */

        /** Создайте программу, которая принимает два числа и выводит наибольшее из них.
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите число 1 ");
        int number1 = scanner1.nextInt();
        System.out.print("Введите число 2 ");
        int number2 = scanner1.nextInt();

        int maximum = (number1 > number2)? number1 : number2;
        System.out.println(maximum);
*/
        // Программа принимает число от 1 до 5 и выводит текстовое описание оценки:
        //5 — "Отлично"
        //4 — "Хорошо"
        //3 — "Удовлетворительно"
        //2 или 1 — "Неудовлетворительно"
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int number = scanner.nextInt();

        switch (number){
            case 5, 6, 7, 9:
                System.out.println("Отлично");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            default:
                System.out.println("Неудовлетворительно");
        }


    }
}
