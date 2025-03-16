package Practice_7.LinkedHashSet_tasks.Task3;

import java.util.LinkedHashSet;

public class Cash {
    private LinkedHashSet<String> cash;
    public Cash(){
        this.cash = new LinkedHashSet<>();
    }
    public void addElement(String element){
        cash.add(element);
    }
    public void printSet(){
        cash.forEach(element -> System.out.print(element + " "));
    }
}
