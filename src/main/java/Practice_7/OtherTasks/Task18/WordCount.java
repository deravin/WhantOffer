package Practice_7.OtherTasks.Task18;

import java.util.HashMap;

public class WordCount {
    //18. Анализ частоты слов
    //Требуется определить, сколько раз каждое слово встречается в тексте.
    private HashMap<String, Integer> wordCount;
    public WordCount(){
        this.wordCount = new HashMap<>();
    }
    public void addWord(String word){
        wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
    }
    public void printWordCount(){
        wordCount.forEach((word,value)-> System.out.println(word + " : " + value));
    }

}
