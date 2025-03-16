package Practice_7.PriorityQueue.Task4;

public class Main {
    public static void main(String[] args) {
        QueueWithUpdating queue = new QueueWithUpdating();
        queue.addObject("Priority4");
        queue.addObject("Priority1");
        queue.addObject("Priority3");
        queue.addObject("Priority5");
        queue.addObject("Priority2");

        queue.printQueue();
        queue.changePriority("Priority3", "Priority0");
        queue.printQueue();
    }
}
