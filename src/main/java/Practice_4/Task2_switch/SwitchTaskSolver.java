package Practice_4.Task2_switch;
import java.util.Scanner;

import static Practice_4.Task2_switch.Planet.*;

public class SwitchTaskSolver {
    // принимает с консоли день недели (число от 1 до 7) и выводит название дня (например, 1 — "Понедельник").
    public static void printDayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число ");
        int day = scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("некорректное число");
        }
    }
    // Выводит порядковый номер планеты от Солнца и примерное значение её массы относительно Земли.
    public static String printPlanetNumberAndMass(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите планету: ");
        String planetInput = scanner.nextLine().toUpperCase();
        String descriprion = "";
        Planet planet = Planet.valueOf(planetInput);

        switch (planet){
            case MERCURY -> descriprion = "Порядковый номер: 1\nМасса относительно Земли: 0.055";
            case VENUS -> descriprion = "Порядковый номер: 2\nМасса относительно Земли: 0.815";
            case EARTH -> descriprion = "Порядковый номер: 3\nМасса относительно Земли: 1";
            case MARS -> descriprion = "Порядковый номер: 4\nМасса относительно Земли: 0.107";
            case JUPITER -> descriprion = "Порядковый номер: 5\nМасса относительно Земли: 317.8";
            case SATURN -> descriprion = "Порядковый номер: 6\nМасса относительно Земли: 95.2";
            case URANUS -> descriprion = "Порядковый номер: 7\nМасса относительно Земли: 14.5";
            case NEPTUNE -> descriprion = "Порядковый номер: 8\nМасса относительно Земли: 17.1";
        }
        return descriprion;
}
         // калькулятор с использованием switch.
    public static double calculator(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число ");
        int x = scanner.nextInt();

        System.out.print("Введите второе число ");
        int y = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Введите оператор ");
        String operator = scanner.nextLine();

        double result = 0;

        switch (operator){
            case "+":
                result = x+y;
               break;
            case "-":
                result = x-y;
                break;
            case "*":
                result = x*y;
                break;
            case "/":
                result = (double) x/y;
                break;
            default:
                System.out.println("неверный оператор, попробуй еще раз");
        }
        return result;
    }
}
