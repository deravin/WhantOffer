package practice_11_CodeTesting.Task12;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedByLengthList {
    public List<String> sortByLength(List<String> words) {
        return words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }

}
