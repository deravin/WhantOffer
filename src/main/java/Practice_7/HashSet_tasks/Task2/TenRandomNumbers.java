package Practice_7.HashSet_tasks.Task2;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class TenRandomNumbers {
    public static void main(String[] args) {
        //Добавьте в HashSet 10 случайных чисел. Проверьте, содержит ли он заданное число.
        HashSet<Integer> tenRandomNumbers = new HashSet<>();

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (tenRandomNumbers.size()<10){
            tenRandomNumbers.add(random.nextInt(100));
        }

        tenRandomNumbers.forEach(element -> System.out.print(element + " "));

        System.out.println("введите число ");
        int userNumber = scanner.nextInt();
        if (tenRandomNumbers.contains(userNumber)){
            System.out.println("число есть в списке");
        } else {
            System.out.println("числа в списке нет");
        }

    }
}
