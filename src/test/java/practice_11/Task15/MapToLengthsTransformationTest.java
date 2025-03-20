package practice_11.Task15;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapToLengthsTransformationTest {
    /**
     * Positive:
     * - [ "Java", "C++", "Go", "3426" ] → [ 4, 3, 2, 4 ]
     * Negative:
     * - [] -> []
     */
    public static Stream<Arguments> values(){
        return Stream.of(
                Arguments.of(List.of("Java", "C++", "Go", "3426"), List.of(4, 3, 2, 4)),
                Arguments.of(List.of(), List.of())
        );
    }
    @ParameterizedTest
    @MethodSource("values")
    public void userCanTransformMapToLengths(List<String> strings, List<Integer> lengths){
        MapToLengthsTransformation mapToLengthsTransformation = new MapToLengthsTransformation();
        List<Integer> atualResult = mapToLengthsTransformation.mapToLengths(strings);
        assertEquals(atualResult,lengths);
    }
}
