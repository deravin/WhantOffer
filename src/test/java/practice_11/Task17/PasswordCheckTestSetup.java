package practice_11.Task17;

import org.junit.jupiter.api.BeforeEach;

public class PasswordCheckTestSetup {
    protected PasswordCheck passwordCheck;
    @BeforeEach
    public void setPasswordCheck(){
        passwordCheck = new PasswordCheck();
    }
}
