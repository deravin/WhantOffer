package practice_11_CodeTesting.Task17;

import org.junit.jupiter.api.BeforeEach;

public class PasswordCheckTestSetup {
    protected PasswordCheck passwordCheck;
    @BeforeEach
    public void setPasswordCheck(){
        passwordCheck = new PasswordCheck();
    }
}
