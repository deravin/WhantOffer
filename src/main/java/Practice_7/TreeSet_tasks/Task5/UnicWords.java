package Practice_7.TreeSet_tasks.Task5;

import java.util.TreeSet;

public class UnicWords {
    //Используйте TreeSet для хранения уникальных слов из текста в отсортированном порядке.
    private TreeSet<String> words;
    public UnicWords(){
        this.words = new TreeSet<>();
    }
    public void addWords(String word){
        words.add(word);
    }
    public void printSet(){
        words.forEach(word -> System.out.print(word + " "));
    }
}
