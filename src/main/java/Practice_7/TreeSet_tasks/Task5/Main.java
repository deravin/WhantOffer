package Practice_7.TreeSet_tasks.Task5;

public class Main {
    public static void main(String[] args) {
        UnicWords unicWords = new UnicWords();
        unicWords.addWords("mom");
        unicWords.addWords("bob");
        unicWords.addWords("kjhg");
        unicWords.addWords("tree");
        unicWords.addWords("mom");
        unicWords.addWords("bob");
        unicWords.addWords("www");

        unicWords.printSet();

    }
}
