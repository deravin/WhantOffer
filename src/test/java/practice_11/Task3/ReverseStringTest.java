package practice_11.Task3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {
    /**
     * Позитивные кейсы:
     * - "Привет, это Настя!" -> "!ятсаН отэ ,тевирП"
     * - "123456000=+" -> "+=000654321"
     * Негативные кейсы:
     * - null -> null
     * - "" -> ""
     */

    public static Stream<Arguments> arguments(){
        return Stream.of(
                // позитивные кейсы
                Arguments.of("Привет, это Настя!","!ятсаН отэ ,тевирП"),
                Arguments.of("123456000=+","+=000654321"),
                // негативные кейсы
                Arguments.of("",""),
                Arguments.of(null,null)
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    public void userCanReverseString (String input, String reversed){
        ReverseString reverseString = new ReverseString();
        String actualResult = reverseString.reverse(input);
        assertEquals(reversed, actualResult);
    }

}
