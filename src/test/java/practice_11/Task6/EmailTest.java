package practice_11.Task6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class EmailTest {
    /**
     * позитивные кейсы:
     * - "test@example.com" -> true
     * - "bad@.com" -> false
     * - "no-at-symbol" ->false
     * негативные кейсы:
     * - null -> NullPointerException
     */
    @ParameterizedTest
    @ValueSource(strings = "test@example.com")
    public void systemCanValidateCorrectEmail(String testedEmail){
        Email email = new Email();
        boolean actualResult = email.isValidEmail(testedEmail);
        assertTrue(actualResult);
    }
    @ParameterizedTest
    @ValueSource(strings = {"bad@.com", "no-at-symbol", ""})
    public void systemCanValidateIncorrectEmail(String testedEmail){
        Email email = new Email();
        boolean actualResult = email.isValidEmail(testedEmail);
        assertFalse(actualResult);
    }

   @Test
    public void systemCanNotValidateNullEmail(){
        Email email = new Email();
        assertThrows(IllegalArgumentException.class,()->
                email.isValidEmail(null),
                "Null email cannot be validated"
                );
   }

}
