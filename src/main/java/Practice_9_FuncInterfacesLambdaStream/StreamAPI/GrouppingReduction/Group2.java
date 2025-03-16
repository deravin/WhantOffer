package Practice_9_FuncInterfacesLambdaStream.StreamAPI.GrouppingReduction;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Group2 {
    public static void main(String[] args) {
        // Дано: List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 7, 8);
        //Разделите числа на четные и нечетные.
        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 7, 8);
        Map<String, List<Integer>> sortedList = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Четные": " Нечетные"));
        System.out.println(sortedList);
    }
}
