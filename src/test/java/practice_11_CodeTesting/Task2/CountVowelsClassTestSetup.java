package practice_11_CodeTesting.Task2;

import org.junit.jupiter.api.BeforeEach;

public class CountVowelsClassTestSetup {
    protected CountVowelsClass countVowelsClass;
    @BeforeEach
    public void setCountVowelsClass(){
        countVowelsClass = new CountVowelsClass();
    }
}
