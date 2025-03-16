package Practice_7.OtherTasks.Task14;

import java.util.HashMap;

public class TextWithUnicWords {
    //14. Уникальные слова в тексте
    //Дан текст, нужно сохранить все уникальные слова и определить их количество.
    private HashMap<String, Integer> textWithUnicWords;
    public TextWithUnicWords(){
        this.textWithUnicWords = new HashMap<>();
    }
    public void addWord(String word){
        textWithUnicWords.put(word, textWithUnicWords.getOrDefault(word, 0)+1);
    }

    public void printWordsList(){
        textWithUnicWords.forEach((word, count)-> System.out.println(word + " : " + count));
    }
}
