package TasksFromInterview.SortingWithComporator;

import java.util.Comparator;
import java.util.Objects;

public class SortByNmae implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.age,o2.age);
    }
}

