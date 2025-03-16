package Practice_9_FuncInterfacesLambdaStream.StreamAPI.AgregationOperation.Task1_2_3;

import java.util.*;

public class MaximumNumbers {
    public static void main(String[] args) {
        //Дано: List<Integer> numbers = Arrays.asList(4, 12, 7, 9, 15);
        //Найдите максимальное число.
        List<Integer> numbers = Arrays.asList(4, 12, 7, 9, 15);
         Optional <Integer> maxNumber = numbers.stream()
                .max(Comparator.naturalOrder());

        System.out.println(maxNumber);

        // Дано: List<Double> numbers = Arrays.asList(4.5, 2.3, 7.1, 1.9);
        //Найдите минимальное число.
        List<Double> numbers2 = Arrays.asList(4.5, 2.3, 7.1, 1.9);
        Optional<Double> minNumber = numbers2.stream()
                .min(Comparator.naturalOrder());

        System.out.println(minNumber);

        //Дано: List<Integer> numbers = Arrays.asList(3, 5, 8, 2);
        //Найдите сумму всех элементов.
        List<Integer> numbers3 = Arrays.asList(3, 5, 8, 2);
        int sumOfNumbers = numbers3.stream()
                .mapToInt(Integer::intValue)
                        .sum();

        System.out.println(sumOfNumbers);

    }
}
