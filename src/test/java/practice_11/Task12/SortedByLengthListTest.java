package practice_11.Task12;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortedByLengthListTest {
    /**
     * Positive cases:
     * - [ "Java", "C", "Python" ] -> [ "C", "Java", "Python" ]
     * - [ "aa", "bb", "cc" ] -> [ "aa", "bb", "cc" ]
     * - [ "+=-@#.", "  _  ", "765" ] -> [ ""765","  _  ", "+=-@#.""]
     * Negative cases:
     * - [] -> []
     */
    public static Stream<Arguments> values (){
        return Stream.of(
                // positive cases
                Arguments.of(List.of("Java", "C", "Python"), List.of("C", "Java", "Python")),
                Arguments.of(List.of("aa", "bb", "cc"), List.of("aa", "bb", "cc")),
                Arguments.of(List.of("+=-@#.", "  _  ", "765"), List.of("765","  _  ", "+=-@#.")),
                // negative cases
                Arguments.of(List.of(), List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("values")
    public void systemCanSortedListByWordsLength(List<String> words, List<String> filteredList){
        SortedByLengthList sortedByLengthList = new SortedByLengthList();
        List<String> atcualResult = sortedByLengthList.sortByLength(words);
        assertEquals(atcualResult, filteredList);
    }
}
