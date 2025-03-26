package practice_11_CodeTesting.Task10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneNumberValidatorTest extends PhoneNumberValidatorTestSetup {
    /**
     * Positive cases:
     * - "+1 1234567890" -> true
     * Negative cases:
     * - "12345" -> false
     * - "invalid" -> false
     * - "+79989" -> false
     * - "+79888889898989809" -> false
     * - null -> NullPointerException
     */

    @ParameterizedTest
    @ValueSource(strings = {"+1 1234567890"})
    public void userCanEnterCorrectNumber(String phone) {
        boolean actualResult = phoneNumberValidator.isValidPhoneNumber(phone);
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {"12345", "invalid", "+79989", "+79888889898989809"})
    public void userCanNotEnterIncorrectNumber(String phone) {
        boolean actualResult = phoneNumberValidator.isValidPhoneNumber(phone);
        assertFalse(actualResult);
    }

    @Test
    public void phoneNumberCanNotBeEmpty(){
        assertThrows(NullPointerException.class,
                ()-> phoneNumberValidator.isValidPhoneNumber(null),
                "Phone number can not be null");
    }
}
