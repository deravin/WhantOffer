package Practice_7.ArrayList_tasks.Task4.MergedList;

import java.util.ArrayList;
import java.util.HashSet;

public class List {
    private ArrayList<Integer> list1;

    public List(){
        this.list1 = new ArrayList<>();
    }

    public void addElement(int element){
        list1.add(element);
    }

    public void printList(){
        list1.forEach(element -> System.out.print(element + " "));
        System.out.println();
    }

    public HashSet<Integer> mergedList(ArrayList<Integer> list2){
        list1.addAll(list2);
        printList();
        HashSet <Integer> unicList = new HashSet<>(list1);
        return unicList;
    }
}
