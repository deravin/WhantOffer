package Practice_9_FuncInterfacesLambdaStream.StreamAPI.GrouppingReduction;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Group5 {
    public static void main(String[] args) {
        //Дано: List<String> words = Arrays.asList("apple", "banana", "cherry");
        //Создайте Map<String, Integer>, где ключ – слово, а значение – его длина.
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        Map<String, Integer> newMap = words.stream()
                .collect(Collectors.toMap(w -> w, String::length));
        System.out.println(newMap);
    }
}
