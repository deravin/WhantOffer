package practice_11.Task20;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArraysDuplicateChecksTest extends ArraysDuplicateChecksTestSetup {
    /**
     * Positive cases:
     * [1, 2, 2, 3] → true
     * Negative cases:
     * [1, 2, 3, 4, 5] → false
     * [] → false
     */
    public static Stream<Arguments> positiveValues(){
        return Stream.of(
                Arguments.of(new int[] {1, 2, 2, 3})
        );
    }
    @ParameterizedTest
    @MethodSource("positiveValues")
    public void systemReturnTrueIfListContainsDuplicates(int[] numbers){
        boolean actualResult = arraysDuplicateChecks.hasDuplicates(numbers);
        assertTrue(actualResult);
    }
    public static Stream<Arguments> negativeValues(){
        return Stream.of(
                Arguments.of(new int[] {1, 2, 3, 4, 5}),
                Arguments.of(new int[] {})
        );
    }
    @ParameterizedTest
    @MethodSource("negativeValues")
    public void systemReturnFalseIfListDoesNotContainDuplicates(int[] numbers){
        boolean actualResult = arraysDuplicateChecks.hasDuplicates(numbers);
        assertFalse(actualResult);
    }

}
