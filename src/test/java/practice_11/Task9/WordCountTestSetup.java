package practice_11.Task9;

import org.junit.jupiter.api.BeforeEach;

public class WordCountTestSetup {
    protected WordCount wordCount;
    @BeforeEach
    public void setWordCount(){
        wordCount = new WordCount();
    }
}
