package Practice_9_FuncInterfacesLambdaStream.StreamAPI.ParrallelStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WorkWithDatas {
    public static void main(String[] args) {
        // 1.Использование parallelStream() для обработки списка чисел
        //Дано: List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        //Посчитайте сумму чисел параллельно.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        int sum = numbers.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        // 2.Вывод элементов параллельного потока
        //Дано: List<String> words = Arrays.asList("one", "two", "three", "four");
        //Выведите элементы потока, используя parallelStream().

        List<String> words = Arrays.asList("one", "two", "three", "four");
        words.parallelStream().forEach(System.out::println);

        // 3.Применение forEachOrdered() в параллельном потоке
        //Дано: List<String> words = Arrays.asList("alpha", "beta", "gamma");
        //Выведите элементы, сохраняя порядок.

        List<String> words2 = Arrays.asList("alpha", "beta", "gamma");
        words2.parallelStream().forEachOrdered(System.out::println);



    }
}
