package practice_11_CodeTesting.Task4;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaxNumberFinderTest extends MaxNumberFinderTestSetup{
    /**
     * Positive cases:
     * - [3, 5, 7, 2] -> 7
     * - [4] -> 4
     * - [-4,-3,-10,0,-10] -> 0
     * Negativs case:
     * - [] -> NoSuchElementException
     */
    public static Stream<Arguments> stringsForTest (){
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 7),
                Arguments.of(new int[]{4}, 4),
                Arguments.of(new int[]{-4,-3,-10,0,-10}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("stringsForTest")
    public void userCanFindMaximumNumberFromArrayIfArrayIsNotEmpty(int[] numbers, int maxNumber){
        int actualResult = maxNumberFinder.findMax(numbers);
        assertEquals(maxNumber, actualResult);
    }

    @Test
    public void userCanNotFindMaximumNumberFromArrayIfArrayNotEmpty(){
        assertThrows(NoSuchElementException.class, () -> maxNumberFinder.findMax(new int[]{}), "Array can not be empty");
    }
}
