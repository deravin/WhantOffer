package Practice_9_FuncInterfacesLambdaStream.StreamAPI.BaseOperations.Task1_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListFiltered {
    public static void main(String[] args) {
        // Дано: List<String> words = Arrays.asList("Java", "Stream", "Lambda", "Functional");
        //Оставьте только строки длиной больше 5.
        List<String> words = Arrays.asList("Java", "Stream", "Lambda", "Functional");
        List<String> resultList = words.stream()
                .filter(word -> word.length() > 5)
                .collect(Collectors.toList());

        System.out.println(resultList);

        // Дано: List<Integer> numbers = Arrays.asList(3, 7, 10, 15, 20);
        // Оставьте только числа, кратные 5.
        List<Integer> numbers = Arrays.asList(3, 7, 10, 15, 20);
        List<Integer> resultNumbers = numbers.stream()
                .filter(number -> (number % 5 == 0))
                .collect(Collectors.toList());

        System.out.println(resultNumbers);


    }
}
