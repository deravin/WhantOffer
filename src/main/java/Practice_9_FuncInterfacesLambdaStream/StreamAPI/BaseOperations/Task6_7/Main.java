package Practice_9_FuncInterfacesLambdaStream.StreamAPI.BaseOperations.Task6_7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Дано: List<String> words = Arrays.asList("banana", "apple", "cherry");
        //Отсортируйте список в алфавитном порядке.
        List<String> words = Arrays.asList("banana", "apple", "cherry");
        List<String> sortedList = words.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        System.out.println(sortedList);

        //7.Подсчет количества элементов в списке
        //Дано: List<String> names = Arrays.asList("Анна", "Борис", "Антон", "Владимир");
        //Посчитайте, сколько имен начинается на "А".
        List<String> names = Arrays.asList("Анна", "Борис", "Антон", "Владимир");
        long wordsStartedWithA = names.stream()
                .filter(name -> name.startsWith("А"))
                .count();

        System.out.println(wordsStartedWithA);

        // Дано: List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        // Получите список уникальных чисел.

        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueNumbers);





    }
}
