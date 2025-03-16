package Practice_9_FuncInterfacesLambdaStream.StreamAPI.ParrallelStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Поиск первого элемента в parallelStream()
        //Дано: List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        //Найдите первый элемент потока (findFirst()) в параллельном потоке.

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        Optional<Integer> firstElement = numbers.parallelStream()
                .findFirst();
        System.out.println(firstElement);

    }
}
