package practice_11_CodeTesting.Example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsPalindromTest extends StringProcessorTest {
    /**
     * Тесты для проверки является ли палиндромом:
     * позитивные тесты:
     * - четное кол-во: "abba" -> true
     * - нечетное кол-во: "hah" -> true
     * corner cases:
     * - "j" -> true
     * - "" -> true
     * - null -> IllegalArgumentException
     * негативные кейсы:
     * - "john" -> false
     */

    @ParameterizedTest
    @ValueSource(strings = {"abba", "hah", "a", ""})
    public void userCanCheckIfValidStringIsPalindrome(String initialString){
        boolean actualResult = stringProcessor.isPalindrom(initialString);
        assertTrue(actualResult);
    }
    @Test
    public void userCanCheckIfValidStringIsNotPalindrome(){
        String initialString = "john";
        boolean  actualResult = stringProcessor.isPalindrom(initialString);
        assertFalse(actualResult);
    }
    @Test
    public void userCannotCheckIfValidStringNullString(){
        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.reverse(null);
        }, "Checking if null string is palindrom should lead to IllegalArgumentException");
    }
}
