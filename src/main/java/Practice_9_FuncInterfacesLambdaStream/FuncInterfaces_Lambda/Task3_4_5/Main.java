package Practice_9_FuncInterfacesLambdaStream.FuncInterfaces_Lambda.Task3_4_5;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println(isEven.test(7));

        // Создайте лямбду, которая принимает строку и возвращает её длину.

        Function<String, Integer> length = (String s) -> s.length();

        System.out.println(length.apply("Привет"));

        // Напишите лямбду, которая принимает строку и печатает её в консоль.

        Consumer<String> printString = (String s) -> System.out.println(s);
        printString.accept("Сегодня отличный день! 7 марта");
    }
}
