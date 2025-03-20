package practice_11.Task15;

import java.util.List;
import java.util.stream.Collectors;

public class MapToLengthsTransformation {
    public List<Integer> mapToLengths(List<String> words) {
        return words.stream().map(String::length).collect(Collectors.toList());
    }
}
