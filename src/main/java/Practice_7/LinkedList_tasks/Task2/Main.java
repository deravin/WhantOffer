package Practice_7.LinkedList_tasks.Task2;

public class Main {
    public static void main(String[] args) {
        TaskQueue taskQueue = new TaskQueue();
        taskQueue.addElement("First task");
        taskQueue.addElement("Second task");
        taskQueue.addElement("Third task");


        System.out.println(taskQueue.getElement());

        taskQueue.printList();

        System.out.println(taskQueue.getElement());

        taskQueue.printList();


    }
}
