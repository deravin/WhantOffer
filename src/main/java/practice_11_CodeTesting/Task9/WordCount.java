package practice_11_CodeTesting.Task9;

public class WordCount {
    public int countWords(String sentence) {
        return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
    }
}
