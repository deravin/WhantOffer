package practice_11_CodeTesting.Task8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondMaxNumberTest extends SecondMaxNumberTestSetup{
    /**
     * Positive cases:
     * - {1,4,5,9,109,0,65} -> 65
     * - {-4, -7, -897, -8, 6, -6} -> -4
     * - {4,4,4,4,4} -> 4
     * Negative cases:
     * - {9} -> IllegalArgumentException
     * - {} -> IllegalArgumentException
     */

    public static Stream<Arguments> values (){
         return Stream.of(
                Arguments.of(new int[] {1,4,5,9,109,0,65},65),
                Arguments.of(new int[] {-4, -7, -897, -8, 6, -6}, -4),
                Arguments.of(new int[] {4,4,4,4,4}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("values")
    public void systemShowsSecondMaxValueForCorrectArrays (int[] numbers, int secondMaxValue){
        int actualResult = secondMaxNumber.findSecondMax(numbers);
        assertEquals(secondMaxValue, actualResult);
    }

    @Test
    public void systemShowsExceptionIfArrayContainsOneElement(){
        assertThrows(IllegalArgumentException.class,()->
                secondMaxNumber.findSecondMax(new int[] {0}),
                "Cannot find second max number if array contains only 1 element");
    }
    @Test
    public void systemShowsExceptionIfArrayDoesNotContainsElement(){
        assertThrows(IllegalArgumentException.class,()->
                        secondMaxNumber.findSecondMax(new int[] {}),
                "Cannot find second max number if array does nor contains elements");
    }

}












