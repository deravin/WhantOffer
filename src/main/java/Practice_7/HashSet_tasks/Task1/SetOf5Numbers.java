package Practice_7.HashSet_tasks.Task1;

import java.util.HashSet;
import java.util.Set;

public class SetOf5Numbers {
    //HashSet из 5 чисел и выведите его содержимое
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Set.of(2,3,4,5,6));
        set.forEach(element -> System.out.print(element + " "));



    }
}
