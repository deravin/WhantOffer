package Practice_7.PriorityQueue.Task3;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityObjects {
    //Используйте PriorityQueue для сортировки объектов по приоритету.
    private PriorityQueue<Integer> queue;
    public PriorityObjects(){
        this.queue = new PriorityQueue<>();
    }
    public void addOjbect(int object){
        queue.add(object);
    }
    public void sortByPriority(){
        LinkedList<Integer> priorityList = new LinkedList<>();
        PriorityQueue<Integer> copyOfqueue = new PriorityQueue<>(queue);
        while (!copyOfqueue.isEmpty()){
            priorityList.add(copyOfqueue.poll());
        }
        System.out.println(priorityList);
    }
}
