package practice_11_CodeTesting.Task17;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordCheckTest extends PasswordCheckTestSetup{
    /** Positive cases:
     * - "Password1" → true
     * Negative cases:
     * - "pass" → false
     * - null → false
     */
    @ParameterizedTest
    @ValueSource(strings = "Password1")
    public void userCanInputCorrectPassword(String password){
        boolean actualResult = passwordCheck.isValidPassword(password);
        assertTrue(actualResult);
    }
    @ParameterizedTest
    @ValueSource(strings = {"pass"})
    public void userCanNotInputIncorrectPassword(String password){
        boolean actualResult = passwordCheck.isValidPassword(password);
        assertFalse(actualResult);
    }
    @Test
    public void passwordInputCanNotBeEmpty(){
        boolean actualResult = passwordCheck.isValidPassword(null);
        assertFalse(actualResult);
    }


}
