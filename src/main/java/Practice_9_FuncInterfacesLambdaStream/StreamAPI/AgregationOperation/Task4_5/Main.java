package Practice_9_FuncInterfacesLambdaStream.StreamAPI.AgregationOperation.Task4_5;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Дано: List<String> names = Arrays.asList("Алексей", "Антон", "Борис", "Анна");
        //Найдите первое имя, начинающееся на "Б".
        List<String> names = Arrays.asList("Алексей", "Антон", "Борис", "Анна");
        Optional<String> nameStartWithB = names.stream()
                .filter(name -> name.startsWith("Б"))
                .findFirst();

        System.out.println(nameStartWithB);

        // Дано: List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
        //Проверьте, есть ли хотя бы одно четное число (anyMatch()).
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9, 10);
        boolean doesContainsEvenNumber = numbers.stream()
                .anyMatch(number -> number % 2 == 0);

        System.out.println(doesContainsEvenNumber);
    }
}
