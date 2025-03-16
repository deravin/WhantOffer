package Practice_9_FuncInterfacesLambdaStream.StreamAPI.GrouppingReduction;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Group1 {
    public static void main(String[] args) {
        //Дано: List<String> words = Arrays.asList("apple", "banana", "cherry", "avocado");
        //Разбейте слова по первой букве (используйте Collectors.groupingBy()).
        List<String> words = Arrays.asList("apple", "banana", "cherry", "avocado");
         Map<Character, List<String>> newList = words.stream()
                 .collect(Collectors.groupingBy(word ->word.charAt(0)));

        System.out.println(newList);
    }
}
