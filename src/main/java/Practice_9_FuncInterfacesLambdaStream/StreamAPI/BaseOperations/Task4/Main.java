package Practice_9_FuncInterfacesLambdaStream.StreamAPI.BaseOperations.Task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Дано: List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        //Получите List<Integer>, содержащий квадраты этих чисел.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squareOfNumbers = numbers.stream()
                .map(number -> number*number)
                .collect(Collectors.toList());

        System.out.println(squareOfNumbers);
    }
}
