package Practice_7.LinkedList_tasks.Task2;

import java.util.LinkedList;

public class TaskQueue {
    //Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления
    private LinkedList<String> list;

    public TaskQueue(){
        this.list = new LinkedList<>();
    }

    public void addElement(String task){
        list.addLast(task);
    }

    public void printList(){
        list.forEach(task -> System.out.print(task + " "));
    }

    public String getElement(){
        return list.poll();
    }
}
