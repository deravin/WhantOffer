package practice_11.Task10;

import org.junit.jupiter.api.BeforeEach;

public class PhoneNumberValidatorTestSetup {
    protected PhoneNumberValidator phoneNumberValidator;
    @BeforeEach
    public void setPhoneNumberValidator(){
        phoneNumberValidator = new PhoneNumberValidator();
    }
}
