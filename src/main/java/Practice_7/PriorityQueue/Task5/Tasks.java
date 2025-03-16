package Practice_7.PriorityQueue.Task5;

import java.util.PriorityQueue;

public class Tasks {
    //Напишите систему планирования задач,
    // где задачи выполняются по приоритету, а при равном приоритете – по порядку добавления.
    private PriorityQueue<String> tasks;
    public Tasks (){
        this.tasks = new PriorityQueue<>();
    }
    public void addTask(String task){
        tasks.add(task);
    }
    public void printQueue(){
        tasks.forEach(task -> System.out.print(task + " "));
        System.out.println();
    }
    public void executeTask(){
        tasks.poll();
    }

}
