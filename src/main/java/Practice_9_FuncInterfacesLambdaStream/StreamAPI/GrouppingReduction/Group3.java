package Practice_9_FuncInterfacesLambdaStream.StreamAPI.GrouppingReduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Group3 {
    public static void main(String[] args) {
        //Дано: List<String> names = Arrays.asList("Анна", "Борис", "Владимир");
        //Преобразуйте список в одну строку "Анна, Борис, Владимир".
        List<String> names = Arrays.asList("Анна", "Борис", "Владимир");
        String namesInString = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println(namesInString);
    }
}
