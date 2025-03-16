package Practice_9_FuncInterfacesLambdaStream.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::valueOf)
                .sum();

        System.out.println(sum);

        // Сгруппировать по полу

        List<String> names = Arrays.asList("Jhon:M", "Sara:F");
        Map<String, List<String>> groupedByGender = names.stream()
                .collect(Collectors.groupingBy(name -> name.split(":")[1],
                        Collectors.mapping(name -> name.split(":")[0],
                                Collectors.toList())));

        System.out.println(groupedByGender);

        // Есть список с дубликатами, необходимо вывести уникальные значения в отсортированном порядке

        List<Integer> numbers1 = Arrays.asList(3,4,3,5,6,2,1,1);

        List<Integer> uniqueSorted = numbers1.stream()
                .distinct()
                .peek(n -> System.out.println("distinct " + n))
                .sorted()
                .peek(n -> System.out.println("sorted " + n))
                .collect(Collectors.toList());

        System.out.println(uniqueSorted);
    }
}
