package Practice_7.HashSet_tasks.Task3;

import java.util.HashSet;
import java.util.LinkedList;

public class ListWithoutDuplicates {
    //Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.
    private LinkedList<String> stringList;
    public ListWithoutDuplicates(){
        this.stringList = new LinkedList<>();
    }
    public void addElements(String element){
        stringList.add(element);
    }
    public void printList(){
        stringList.forEach(element -> System.out.print(element + " "));
        System.out.println();
    }
    public HashSet<String> convertListToSet(){
        HashSet<String> set = new HashSet<>(this.stringList);
        return  set;
    }

}
