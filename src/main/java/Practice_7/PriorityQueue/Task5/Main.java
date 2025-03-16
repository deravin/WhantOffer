package Practice_7.PriorityQueue.Task5;

public class Main {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        tasks.addTask("Priority0");
        tasks.addTask("Priority4");
        tasks.addTask("Priority1");
        tasks.addTask("Priority2");
        tasks.addTask("Priority5");
        tasks.addTask("Priority2");

        tasks.printQueue();
        tasks.executeTask();
        tasks.printQueue();
        tasks.executeTask();
        tasks.printQueue();
        tasks.executeTask();
        tasks.printQueue();
    }
}
