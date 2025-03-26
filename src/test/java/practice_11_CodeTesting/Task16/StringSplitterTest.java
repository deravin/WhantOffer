package practice_11_CodeTesting.Task16;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringSplitterTest {
    /**
     * Positive cases:
     * "Java,Python,C++", "," -> ["Java", "Python", "C++"]
     * "", "," -> [""]
     * "word", "," → ["word"]
     */

    public static Stream<Arguments> values(){
        return Stream.of(
                Arguments.of("Java,Python,C++", ",", new String[] {"Java", "Python", "C++"}),
                Arguments.of("", ",", new String[] {""}),
                Arguments.of("word", ",", new String[] {"word"})
        );
    }

    @ParameterizedTest
    @MethodSource("values")
    public void userCanSplitString(String string,String delimiter, String[] array){
        StringSplitter stringSplitter = new StringSplitter();
        String[] actualResult = stringSplitter.splitString(string, delimiter);
        assertArrayEquals(actualResult,array);
    }
}
