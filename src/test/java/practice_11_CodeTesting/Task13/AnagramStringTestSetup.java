package practice_11_CodeTesting.Task13;

import org.junit.jupiter.api.BeforeEach;

public class AnagramStringTestSetup {
    protected AnagramString anagramString;
    @BeforeEach
    public void setAnagramString(){
        anagramString = new AnagramString();
    }
}
