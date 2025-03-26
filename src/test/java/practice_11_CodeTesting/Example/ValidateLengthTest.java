package practice_11_CodeTesting.Example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidateLengthTest extends StringProcessorTest{
    /**
     * Тесты на валидацию длинны
     * Позитивные сценарии
     * - "abba", 3 -> "abba"
     * - "abba", 4 -> "abba"
     * Negative case:
     * - "abba", 5 -> IlligalArgumentException
     * Corner cases:
     * - "abba", 0 -> "abba"
     * - "" -> ""
     * - "hello", -1 -> IlligalArgumentException
     */
    public static Stream<Arguments> stringForValidationPositiveCases(){
        return Stream.of(
                Arguments.of("abba", 3),
                Arguments.of("abba", 4),
                Arguments.of("abba", 0),
                Arguments.of("", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("stringForValidationPositiveCases")
    public void userCanValidateStringWithLengthMoreOrEqualToMinValue(String initialString, int minValue){
        String expectedResult = stringProcessor.validateLength(initialString, minValue);
        assertEquals(expectedResult, initialString);
    }

    public static Stream<Arguments> stringForValidationNegativeCases(){
        return Stream.of(
                Arguments.of("abba", 5),
                Arguments.of("hello", -1)
        );
    }
    @ParameterizedTest
    @MethodSource("stringForValidationNegativeCases")
    public void userCanNotValidateStringWithLengthLessThenMinValue(String initialString, int minValue){
        assertThrows(IllegalArgumentException.class, () -> {
                    stringProcessor.validateLength(initialString, minValue);},
            "Validation of string with length less than min value should lead to exception");
    }
}
