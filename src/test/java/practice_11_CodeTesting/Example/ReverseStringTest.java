package practice_11_CodeTesting.Example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Class StringProcessor, method reverse")
public class ReverseStringTest extends StringProcessorTest{
    /**
     * Тесты для переворота строки:
     * позитивный сценарий - "настя" -> "ятсан"
     * корен кейсы:
     * 1. пустая строка "" -> ""
     * 2. только одна буква "а" - "а"
     * 3. null -> IllegalArgementException
     */

    public static Stream<Arguments> validStringsToReverse() {
        return Stream.of(
                //  позитивный сценарий - "настя" -> "ятсан"
                Arguments.of("настя", "ятсан"),
                // corner case - только одна буква "а" -> "а"
                Arguments.of("f", "f"),
                // corner case: "" -> ""
                Arguments.of("",""));
    }

    @ParameterizedTest
    @MethodSource("validStringsToReverse")
    public void userCanReverseValidString(String initialString, String expectedString){
        String reversedString = stringProcessor.reverse(initialString);
        assertEquals(expectedString, reversedString,
                "String reversed incorrectly");
    }

    @Test
    public void userCannotReverseNullString(){
        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.reverse(null);
        }, "Reversing of null string should lead to IllegalArgumentException");
    }


}
