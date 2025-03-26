package practice_11_CodeTesting.Task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountVowelsClassTest extends CountVowelsClassTestSetup {
    /** Позитивные кейсы:
     * - "hello" - 2
     * - "javaca" - 3
     * - "AEIOU" - 5
     * - "my name is - Nastia!" - 7
     *  Негативные кейсы:
     *  - "qwrt" - 0
     * - "" -> 0
     * - "98989" -> 0
     * - null -> IllegalArgumentException
     */

    public static Stream<Arguments> stringOfArguments(){
        return Stream.of(
                // positive cases:
                Arguments.of("hello",2),
                Arguments.of("javaca",3),
                Arguments.of("AEIOU",5),
                Arguments.of("Hello! my name is - Nastia!",9),
                // negative cases:
                Arguments.of("qwrt",0),
                Arguments.of("",0),
                Arguments.of("98989",0)
        );
    }

    @ParameterizedTest
    @MethodSource("stringOfArguments")
    public void userCanGetCountOfVowelsFromStringIfStringIsNotNull(String string, int count){
       int actualResult = countVowelsClass.countVowels(string);
       System.out.println("String: " + string + ", Expected: " + count + ", Actual: " + actualResult);
       assertEquals(actualResult, count);
    }

    @Test
    public void userCanNotGetCountOfVowelsFromStringIfStringIsNull(){
        assertThrows(IllegalArgumentException.class, () -> {
            countVowelsClass.countVowels(null);
                }, "You can not get count of vowels if string = null.");
    }
}
