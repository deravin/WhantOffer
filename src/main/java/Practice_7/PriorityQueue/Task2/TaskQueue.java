package Practice_7.PriorityQueue.Task2;

import java.util.PriorityQueue;

public class TaskQueue {
    //Реализуйте очередь задач с приоритетами.
    // Добавьте несколько задач и извлеките их по приоритету.

    private PriorityQueue<String> tasks;
    public TaskQueue(){
        this.tasks = new PriorityQueue<>();
    }
    public void addTask(String task){
        tasks.add(task);
    }
    public void removeMostPriorityTask(){
        System.out.println(tasks.poll());
    }
}
