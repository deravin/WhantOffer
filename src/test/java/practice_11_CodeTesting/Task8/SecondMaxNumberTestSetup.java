package practice_11_CodeTesting.Task8;

import org.junit.jupiter.api.BeforeEach;

public class SecondMaxNumberTestSetup {
    protected SecondMaxNumber secondMaxNumber;
    @BeforeEach
    public void setSecondMaxNumber(){
        secondMaxNumber = new SecondMaxNumber();
    }
}
