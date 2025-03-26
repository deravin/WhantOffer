package practice_11_CodeTesting.Task14;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AverageNumberTest extends AverageNumberTestSetup {
    /**
     * Positive cases:
     * - [1, 2, 3, 4, 5] -> 3.0
     * - [10] -> 10.0
     * - [0] -> 0
     * Negative cases:
     * - [] -> Exception
     */
    public static Stream<Arguments> values (){
        return Stream.of(
                Arguments.of(new int[] {1, 2, 3, 4, 5}, 3.0),
                Arguments.of(new int[] {10}, 10.0),
                Arguments.of(new int[] {0}, 0.0)
        );
    }
    @ParameterizedTest
    @MethodSource("values")
    public void userCanGetAverageNumberIfListIsNotEmpty(int[] numbers, double averageNumberTest){
        double actualResult = averageNumber.findAverage(numbers);
        assertEquals(averageNumberTest, actualResult);
    }
    @Test
    public void listOfNumbersCanNotBeEmpty(){
        assertThrows(NullPointerException.class,()->
                averageNumber.findAverage(null),
                "List of numbers can't be empty");
    }
}
