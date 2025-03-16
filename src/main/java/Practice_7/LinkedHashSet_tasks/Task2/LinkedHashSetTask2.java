package Practice_7.LinkedHashSet_tasks.Task2;

import java.util.LinkedHashSet;

public class LinkedHashSetTask2 {
    //Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.
    private LinkedHashSet<Integer> set;
    public LinkedHashSetTask2(){
        this.set = new LinkedHashSet<>();
    }
    public void addElement(int element){
        set.add(element);
    }
    public void print(){
        set.forEach(element -> System.out.print(element + " "));
        System.out.println();
    }
}
