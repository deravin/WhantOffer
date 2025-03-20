package practice_11.Task5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearCheckTest {
    /**
     * Позитивные кейсы:
     * - 1999 -> false
     * - 2020 -> true
     * - 2000 -> true
     * - 1900 -> false
     * Негативные кейсы:
     * - 0 -> false
     */
    public static Stream<Arguments> values (){
        return Stream.of(
                Arguments.of(1999, false),
                Arguments.of(2020, true),
                Arguments.of(2000, true),
                Arguments.of(1900, false),
                // negative case
                Arguments.of(0, false),
                Arguments.of(-1890, false)
        );
    }

    @ParameterizedTest
    @MethodSource("values")
    public void userCanCheckIsYearLeap(int year, boolean value){
        LeapYearCheck leapYearCheck = new LeapYearCheck();
        boolean actualResult = leapYearCheck.isLeapYear(year);
        assertEquals(value, actualResult);
    }
}
