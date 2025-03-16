package Practice_7.LinkedHashSet_tasks.Task5;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class UnicActions {
    //Реализуйте механизм хранения
    // уникальных действий на сайте на основе LinkedHashSet.
    private LinkedHashSet<String> actions;
    public UnicActions(){
        this.actions = new LinkedHashSet<>();
    }
    public void addAction(String action){
        actions.add(action);
    }
    public void printList(){
        actions.forEach(action -> System.out.print(action + " "));
    }

}
