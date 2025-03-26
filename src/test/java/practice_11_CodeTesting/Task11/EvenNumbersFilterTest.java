package practice_11_CodeTesting.Task11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenNumbersFilterTest {
    /**
     * Positive cases:
     * - [1, 2, 3, 4, 5, 6] -> [2, 4, 6]
     * - [-9, -8, -7, -6, -5, -4, 0, 7, 6] -> [-8, -6, -4, 6]
     * Negative cases:
     * - [7, 5, 3, 11, -7] -> []
     * - [] -> []
     */
    public static Stream<Arguments> values (){
        return Stream.of(
                // positive cases
                Arguments.of(List.of(1, 2, 3, 4, 5, 6), List.of(2, 4, 6)),
                Arguments.of(List.of(-9, -8, -7, -6, -5, -4, 0, 7, 6), List.of(-8, -6, -4, 0, 6)),
                // negative cases
                Arguments.of(List.of(7, 5, 3, 11, -7), List.of()),
                Arguments.of(List.of(), List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("values")
    public void systemCanFilterEvenNumberFromList(List<Integer> numbers, List<Integer> filteredValues){
        EvenNumbersFilter evenNumbersFilter = new EvenNumbersFilter();
        List<Integer> filteredNumbers = evenNumbersFilter.filterEvenNumbers(numbers);
        assertEquals(filteredValues, filteredNumbers);
    }

}
