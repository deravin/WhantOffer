package Practice_7.PriorityQueue.Task4;

import java.util.PriorityQueue;

public class QueueWithUpdating {
    //Реализуйте PriorityQueue, в которой можно изменять приоритет уже добавленного элемента.
    private PriorityQueue<String> queue;
    public QueueWithUpdating(){
        this.queue = new PriorityQueue<>();
    }
    public void addObject(String object){
        queue.add(object);
    }
    public void printQueue(){
        queue.forEach(object -> System.out.println(object + " ") );
        System.out.println();
    }

    public void changePriority(String oldPriority, String newPtiority){
        queue.remove(oldPriority);
        queue.add(newPtiority);
    }
}
