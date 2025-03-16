package Practice_4_1.Tasks_2_Switch;

import java.util.Scanner;

public class TaskSolverSwitch {
    //вывод названия дня (например, 1 — "Понедельник")
    public static void dayName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число от 1 до 7 - ");
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Ввели неверный день");
        }
    }
    //Используя enum, создайте перечисление для планет Солнечной системы (Planet)
    /*
    "Порядковый номер: 1\nМасса относительно Земли: 0.055";
    "Порядковый номер: 2\nМасса относительно Земли: 0.815";
    "Порядковый номер: 3\nМасса относительно Земли: 1";
    "Порядковый номер: 4\nМасса относительно Земли: 0.107";
    "Порядковый номер: 5\nМасса относительно Земли: 317.8";
    "Порядковый номер: 6\nМасса относительно Земли: 95.2";
    "Порядковый номер: 7\nМасса относительно Земли: 14.5";
    "Порядковый номер: 8\nМасса относительно Земли: 17.1";
     */
    public static String planetInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите название планеты ");
        String planetName = scanner.nextLine().toUpperCase();
        String description = "";
        Planet planet = Planet.valueOf(planetName);
        scanner.close();

        switch (planet){
            case MERCURY -> description =  "Порядковый номер: 1\nМасса относительно Земли: 0.055";
            case VENUS -> description =   "Порядковый номер: 2\nМасса относительно Земли: 0.815";
            case EARTH -> description =  "Порядковый номер: 3\nМасса относительно Земли: 1";
            case MARS -> description =  "Порядковый номер: 4\nМасса относительно Земли: 0.107";
            case JUPITER -> description = "Порядковый номер: 5\nМасса относительно Земли: 317.8";
            case SATURN -> description = "Порядковый номер: 6\nМасса относительно Земли: 95.2";
            case URANUS -> description = "Порядковый номер: 7\nМасса относительно Земли: 14.5";
            case NEPTUNE ->  description = "Порядковый номер: 8\nМасса относительно Земли: 17.1";
        }
        return description;
    }

    //калькулятор с использованием switch.
    public static void calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите первое число ");
        int x = scanner.nextInt();
        System.out.print("введите второе число ");
        int y = scanner.nextInt();
        System.out.print("введите оператор ");
        scanner.nextLine();
        String operator = scanner.nextLine();
        float result = 0;

        switch (operator){
            case "+":
                System.out.println(result = x + y);
                break;
            case "-":
                System.out.println(result = x-y);
                break;
            case "*":
                System.out.println(result = x*y);
                break;
            case "/":
                if (y!=0)
                System.out.println(result = (float) x/y);
                else
                    System.out.println("на ноль делить нельзя!");
                break;
            default:
                System.out.println("введите корректный оператор");
        }

    }




}
