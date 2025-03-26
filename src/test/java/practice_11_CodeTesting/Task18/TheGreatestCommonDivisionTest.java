package practice_11_CodeTesting.Task18;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheGreatestCommonDivisionTest {
    /** Positive cases:
     * 24, 36 → 12
     * 101, 103 → 1
     * 0, 10 → 10
     */
    public static Stream<Arguments> values (){
        return Stream.of(
                Arguments.of(24, 36, 12),
                Arguments.of(101, 103, 1),
                Arguments.of(0, 10, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("values")
    public void systemCanFindTheGreatestCommonDivision(int x1, int x2, int result){
        TheGreatestCommonDivision theGreatestCommonDivision = new TheGreatestCommonDivision();
        int actualResult = theGreatestCommonDivision.gcd(x1,x2);
        assertEquals(actualResult, result);
    }
}
