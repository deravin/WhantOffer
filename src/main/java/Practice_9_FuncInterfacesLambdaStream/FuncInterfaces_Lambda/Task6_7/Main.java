package Practice_9_FuncInterfacesLambdaStream.FuncInterfaces_Lambda.Task6_7;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Создайте два Predicate, один проверяет, что число больше 10, другой – что оно чётное. Объедините их (or, and).
        Predicate<Integer> isMoreThanTen = x -> x > 10;
        Predicate<Integer> isEven = y -> y % 2 == 0;

        Predicate<Integer> isMoreThanTenAndEven = isMoreThanTen.and(isEven);
        Predicate<Integer> isMoreThanTenOrEven = isMoreThanTen.or(isEven);

        System.out.println(isMoreThanTenAndEven.test(8));
        System.out.println(isMoreThanTenOrEven.test(3));

        // Напишите BiFunction<String, Integer, String>, который принимает имя и возраст, а возвращает строку "Имя: ..., Возраст: ..."

        BiFunction<String, Integer, String> returnString = (name, age) -> "Имя: " + name + ", Возраст: " + age;

        System.out.println(returnString.apply("Настя", 33));






    }
}
