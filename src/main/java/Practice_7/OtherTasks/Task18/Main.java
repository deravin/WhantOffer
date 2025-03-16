package Practice_7.OtherTasks.Task18;

public class Main {
    public static void main(String[] args) {
        WordCount text = new WordCount();
        text.addWord("Java");
        text.addWord("Hello");
        text.addWord("World");
        text.addWord("Java");
        text.addWord("World");

        text.printWordCount();
    }
}
