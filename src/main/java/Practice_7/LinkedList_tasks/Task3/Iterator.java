package Practice_7.LinkedList_tasks.Task3;

import java.util.LinkedList;
import java.util.ListIterator;

public class Iterator {
    // Используйте ListIterator для прохода по LinkedList в обоих направлениях.
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ListIterator<Integer> iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()){
            System.out.print(iterator.previous() + " ");
        }

        System.out.println();

        iterator = list.listIterator(0);
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

    }
}
