package practice_11.Task7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest extends FactorialTestSetup {
    /**
     * Позитивные кейсы
     * - 1! -> 1
     * - 5! -> 120
     * - 7! -> 5040
     * - 0! -> 1
     * Негативные кейсы
     * - -3 -> IllegalArgumentException
     */

    public static Stream<Arguments> values(){
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(5, 120),
                Arguments.of(7, 5040)
        );
    }

    @ParameterizedTest
    @MethodSource("values")
    public void systemCanCalculateFactorialIfNumberIsPositive(int number, int result){
        int actualResult = factorial.factorial(number);
        assertEquals(result, actualResult);
    }
    @Test
    public void systemCanNotCalculateFactorialIfNumberIsNegative (){
        assertThrows(IllegalArgumentException.class, () ->
                factorial.factorial(-6), "Factorial of negative number can not be calculated");
    }
}
