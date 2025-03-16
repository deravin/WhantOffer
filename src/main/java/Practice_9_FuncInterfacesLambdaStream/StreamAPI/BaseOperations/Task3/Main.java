package Practice_9_FuncInterfacesLambdaStream.StreamAPI.BaseOperations.Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Дано: List<String> words = Arrays.asList("apple", "banana", "cherry");
        // Преобразуйте List<String> в List<Integer> (длины строк).
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<Integer> stringLength = words.stream()
                .map(word -> word.length())
                .collect(Collectors.toList());

        System.out.println(stringLength);

    }
}
