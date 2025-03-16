package Practice_9_FuncInterfacesLambdaStream.StreamAPI.BaseOperations.Task5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Дано: List<Integer> numbers = Arrays.asList(5, 1, 8, 2, 4);
        //Отсортируйте числа по убыванию.
        List<Integer> numbers = Arrays.asList(5, 1, 8, 2, 4);
        List<Integer> sortedNumbers = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(sortedNumbers);

    }
}
