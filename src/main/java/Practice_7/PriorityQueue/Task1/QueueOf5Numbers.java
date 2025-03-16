package Practice_7.PriorityQueue.Task1;

import java.util.PriorityQueue;

public class QueueOf5Numbers {
    //Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(1);
        pq.add(15);
        pq.add(6);
        pq.add(9);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
