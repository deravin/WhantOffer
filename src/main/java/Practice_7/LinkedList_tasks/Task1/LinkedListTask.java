package Practice_7.LinkedList_tasks.Task1;

import java.util.LinkedList;

public class LinkedListTask {
    //Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.
    private LinkedList<Integer> list;
    public LinkedListTask(){
        this.list = new LinkedList<>();
    }
    public void addElement(int number){
        list.add(number);
    }
    public void printList(){
        list.forEach(element -> System.out.print(element + " "));
    }
}
