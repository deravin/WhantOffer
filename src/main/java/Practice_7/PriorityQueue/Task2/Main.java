package Practice_7.PriorityQueue.Task2;

public class Main {
    public static void main(String[] args) {
        TaskQueue tasks = new TaskQueue();
        tasks.addTask("Priority0");
        tasks.addTask("Priority3");
        tasks.addTask("Priority2");
        tasks.addTask("Priority5");
        tasks.addTask("Priority1");

        tasks.removeMostPriorityTask();
        tasks.removeMostPriorityTask();
        tasks.removeMostPriorityTask();
        tasks.removeMostPriorityTask();
        tasks.removeMostPriorityTask();

    }
}
