package Practice_7.LinkedList_tasks.Task4;

import java.util.LinkedList;

public class List {
    //Напишите метод, который удаляет каждый второй элемент из LinkedList.
    private LinkedList<Integer> list;
    public List(){
        this.list = new LinkedList<>();
    }
    public void addElement(int e){
        list.add(e);
    }
    public void printList(){
        list.forEach(element -> System.out.print(element + " "));
        System.out.println();
    }

    public void deleteSecondElement(){
        list.remove(1);
    }
}
