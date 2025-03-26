package Practice_12_Debug;
// Код должен удалять элементы списка, но выбрасывает ConcurrentModificationException.

import java.util.*;

public class DebugTask10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){
            if (iterator.next().startsWith("A")){
                iterator.remove();
            }
        }
    }
}