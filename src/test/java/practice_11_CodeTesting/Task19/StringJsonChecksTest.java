package practice_11_CodeTesting.Task19;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringJsonChecksTest extends StringJsonChecksTestSetup{
    /**
     * Positive cases:
     * - "{"key":"value"}" → true
     * Negative cases:
     * - "invalid json" → false
     * - null → false
     */

    @ParameterizedTest
    @ValueSource(strings ={"{\"key\":\"value\"}"} )
    public void systemCanCheckThatJsonStringHasCorrectFormat(String json){
        boolean actualResult = stringJsonChecks.isValidJson(json);
        assertTrue(actualResult);
    }
    @ParameterizedTest
    @ValueSource(strings ={"invalid json"})
    public void systemCanCheckThatJsonStringHasIncorrectFormat(String json){
        boolean actualResult = stringJsonChecks.isValidJson(json);
        assertFalse(actualResult);
    }
    @Test
    public void stringForCheckingCanNotBeEmpty(){
        boolean actualResult = stringJsonChecks.isValidJson(null);
        assertFalse(actualResult);
    }

}
