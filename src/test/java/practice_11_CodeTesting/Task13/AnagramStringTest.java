package practice_11_CodeTesting.Task13;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnagramStringTest extends AnagramStringTestSetup{
    /**
     * Positive cases:
     * - "listen", "silent" -> true
     * - "1 2.3","3.2 1" -> true
     * Negative cases:
     * - "java", "python" → false
     * - null → false
     */

    public static Stream<Arguments> trueValues (){
        return Stream.of(
                Arguments.of("listen","silent"),
                Arguments.of("1 2.3", "3.2 1")
        );
    }
    public static Stream<Arguments> falseValues (){
        return Stream.of(
                Arguments.of("java", "python"),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("trueValues")
    public void systemReturnTrueIfStringsIsAnagrams(String str1, String str2){
        boolean actualResult = anagramString.isAnagram(str1, str2);
        assertTrue(actualResult);
    }
    @ParameterizedTest
    @MethodSource("falseValues")
    public void systemReturnFalseIfStringsIsNotAnagrams(String str1, String str2){
        boolean actualResult = anagramString.isAnagram(str1, str2);
        assertFalse(actualResult);
    }
}
