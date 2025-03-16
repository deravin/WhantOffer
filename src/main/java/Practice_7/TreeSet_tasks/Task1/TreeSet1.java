package Practice_7.TreeSet_tasks.Task1;

import java.util.TreeSet;

public class TreeSet1 {
    //Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        set.forEach(element -> System.out.print(element + " "));
    }
}
