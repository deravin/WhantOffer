package Practice_7.ArrayDeque.Task1;

import java.util.ArrayDeque;

public class Deque {
    //Создайте ArrayDeque, добавьте 5 элементов и выведите их.
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(2);
        deque.add(4);
        deque.add(5);
        deque.add(1);
        deque.add(0);

        System.out.println(deque);
    }
}
