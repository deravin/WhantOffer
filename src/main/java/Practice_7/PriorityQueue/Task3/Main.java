package Practice_7.PriorityQueue.Task3;

public class Main {
    public static void main(String[] args) {
        PriorityObjects priorityQueue =  new PriorityObjects();
        priorityQueue.addOjbect(2);
        priorityQueue.addOjbect(5);
        priorityQueue.addOjbect(1);
        priorityQueue.addOjbect(9);
        priorityQueue.addOjbect(0);

        priorityQueue.sortByPriority();
    }
}
