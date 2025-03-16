package Practice_7.ArrayDeque.Task3;

public class Main {
    public static void main(String[] args) {
        Task3Queue queue = new Task3Queue();
        queue.addFirstElement(13);
        queue.addFirstElement(15);
        queue.addFirstElement(20);
        queue.addLastElement(55);
        queue.addLastElement(0);
        queue.addLastElement(2);
        queue.addFirstElement(1);
        queue.addLastElement(100);

        queue.printQueue();
        queue.pollFirstElement();
        queue.poolLastElement();
        queue.printQueue();

    }
}
