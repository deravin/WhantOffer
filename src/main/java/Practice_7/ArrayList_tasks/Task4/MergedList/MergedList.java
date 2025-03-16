package Practice_7.ArrayList_tasks.Task4.MergedList;

import java.util.ArrayList;
import java.util.HashSet;

public class MergedList {
    private ArrayList <Integer> list;

    public MergedList(){
        this.list = new ArrayList<>();
    }

    public void addElement(int number){
        list.add(number);
    }

    public void printList(){
        list.forEach(number -> System.out.print(number + " "));
        System.out.println();
    }

    public HashSet<Integer> mergeList(ArrayList<Integer> list2){
        list.addAll(list2);
        HashSet <Integer> unicList = new HashSet<>();
        unicList.addAll(list);
        return unicList;
    }
}
