package Practice_7.LinkedHashSet_tasks.Task4;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;


public class CrossLinkedHashSet {
    //Напишите метод, который находит пересечение двух LinkedHashSet.
    public static void main(String[] args) {
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>(List.of(1,2,3,4,11,8,7));
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>(List.of(0,9,8,7,11,12,1));

        System.out.println(showCrossForTwoLists(set1,set2));
    }
    public static LinkedList<Integer> showCrossForTwoLists(LinkedHashSet<Integer> set1, LinkedHashSet<Integer> set2){
        set1.retainAll(set2);
        LinkedList<Integer> crossList = new LinkedList<>(set1);
        return crossList;
    }
}
