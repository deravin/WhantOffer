package Practice_9_FuncInterfacesLambdaStream.StreamAPI.GrouppingReduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Group4 {
    public static void main(String[] args) {
        // Дано: List<Integer> numbers = Arrays.asList(4, 8, 10, 6);
        // Найдите среднее значение (Collectors.averagingInt()).
        List<Integer> numbers = Arrays.asList(4, 8, 10, 6, 5);
        double average = numbers.stream()
                .collect(Collectors.averagingInt(num -> num));

        System.out.println(average);

    }
}
