package practice_11.Task9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WordCountTest extends WordCountTestSetup{
    /**
     * Позитивные кейсы:
     * - "word" -> 1
     * - "Hello, my name is Nastia! -> 5
     * - Негативные кейсы:
     * - "" -> 0
     * - null -> IllegalArgumentException
     */

    public static Stream<Arguments> value(){
        return Stream.of(
                // positive cases
                Arguments.of("word",1),
                Arguments.of("Hello, my name is Nastia!",5),
                // negative case
                Arguments.of("",0)
        );
    }
    @ParameterizedTest
    @MethodSource("value")
    public void systemCanCountWordsFromSentence(String sentence, int count){
        int actualResult = wordCount.countWords(sentence);
        assertEquals(count, actualResult);
    }
    @Test
    public void systemShowExceptionIfSentenceIsNull(){
        assertThrows(NullPointerException.class,() ->
                wordCount.countWords(null),
                "Sentence can't be empty"
                );
    }
}



















