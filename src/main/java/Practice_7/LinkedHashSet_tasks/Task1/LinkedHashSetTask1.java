package Practice_7.LinkedHashSet_tasks.Task1;

import java.util.LinkedHashSet;

public class LinkedHashSetTask1 {
    public static void main(String[] args) {
        //Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("String1");
        set.add("String2");
        set.add("String3");
        set.add("String4");
        set.add("String5");

        set.forEach(lement -> System.out.print(lement + " "));
    }
}
