package Practice_7.ArrayList_tasks.Task4.MergedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List lis1 = new List();
        lis1.addElement(1);
        lis1.addElement(2);
        lis1.addElement(3);
        lis1.addElement(4);
        lis1.addElement(5);
        lis1.addElement(6);
        lis1.addElement(6);

        lis1.printList();

        ArrayList <Integer> list2 = new ArrayList<>();
        list2.add(33);
        list2.add(3);
        list2.add(1);
        list2.add(5);
        list2.add(98);

        System.out.println(list2);

        System.out.println(lis1.mergedList(list2));

    }
}
