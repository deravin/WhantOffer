package Practice_7.TreeSet_tasks.Task3;

import java.util.List;
import java.util.TreeSet;

public class Task3 {
    // Найдите ближайшее большее и меньшее число к заданному в TreeSet.
    TreeSet<Integer> set;
    public Task3(int x, int o, int z, int y, int r){
        this.set = new TreeSet<>(List.of(x,o,z,y,r));
    }
    public void printSet(){
        set.forEach(element -> System.out.print(element + " "));
        System.out.println();
    }
    public void minAndMaxNumber(int number){
        System.out.println("большее число - " + set.higher(number));
        System.out.println("меньшее число - " + set.lower(number));
    }
}
