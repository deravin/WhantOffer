package Practice_7.HashSet_tasks.Task4;

import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Set set = new Set();
        set.addElement(1);
        set.addElement(2);
        set.addElement(3);
        set.addElement(4);

        HashSet<Integer> set2 = new HashSet<>(List.of(1,2,3,4));

        System.out.println(set.isSetContainsElementsFromAnotherSet(set2));

    }
}
