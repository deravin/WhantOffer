package practice_11_CodeTesting.Task9;

import org.junit.jupiter.api.BeforeEach;

public class WordCountTestSetup {
    protected WordCount wordCount;
    @BeforeEach
    public void setWordCount(){
        wordCount = new WordCount();
    }
}
