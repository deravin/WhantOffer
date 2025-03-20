package practice_11.Task1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckingIsNumberEvenTest extends CheckingIsNumberEvenTestSetup{
    /** Позитивные кейсы:
     * - 4 -> true
     * - 7 -> false
     * - -6 -> true
     * - 0 -> true
     */

    @ParameterizedTest
    @ValueSource(ints = {4, -6, 0})
    public void checkThatCheckingIsNumberEvenMethodReturnTrueIfNumberIsEven(int number){
        boolean actualResult = checkingIsNumberEven.isEven(number);
        assertTrue(actualResult);
    }

    @Test
    public void checkThatCheckingIsNumberEvenMethodReturnFalseIfNumberIsNotEven(){
        boolean actualResult = checkingIsNumberEven.isEven(7);
        assertFalse(actualResult);
    }

}
