package Practice_7.LinkedList_tasks.Task5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class ListWithoutDuplicates {
    // Реализуйте метод, который находит и удаляет все дубликаты в LinkedList.
    private LinkedList<Integer> list;
    public ListWithoutDuplicates(){
        this.list = new LinkedList<>();
    }
    public void addElement(int x){
        list.add(x);
    }
    public void printList(){
        list.forEach(element -> System.out.print(element + " "));
        System.out.println();
    }

    public LinkedList<Integer> deleteDuplicates(){
        HashSet<Integer> listWithoutDuplicates = new HashSet<>(list);
        list.clear();
        list.addAll(listWithoutDuplicates);
        return list;
    }

}
