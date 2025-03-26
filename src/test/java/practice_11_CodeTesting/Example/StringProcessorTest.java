package practice_11_CodeTesting.Example;

import org.junit.jupiter.api.BeforeEach;

public class StringProcessorTest {
    protected StringProcessor stringProcessor;
    @BeforeEach
    public void setupTest(){
        stringProcessor = new StringProcessor();
    }
}
