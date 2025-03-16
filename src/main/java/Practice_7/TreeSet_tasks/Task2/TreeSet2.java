package Practice_7.TreeSet_tasks.Task2;

import java.util.List;
import java.util.TreeSet;

public class TreeSet2 {
    //Напишите метод, который добавляет числа в TreeSet, но не позволяет добавить дубликаты.
    private TreeSet<Integer> set;
    public TreeSet2(){
        this.set = new TreeSet<>();
    }
    public void addUnicNumber(int number){
        if (!set.contains(number)){
            set.add(number);
        }
    }
    public void printSet(){
        set.forEach(element -> System.out.print(element + " "));
    }
}
