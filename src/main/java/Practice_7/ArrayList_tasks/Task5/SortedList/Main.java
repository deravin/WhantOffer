package Practice_7.ArrayList_tasks.Task5.SortedList;

public class Main {
    public static void main(String[] args) {
        SortedList list = new SortedList();
        list.addElement(2);
        list.addElement(5);
        list.addElement(10);
        list.addElement(0);
        list.addElement(678);
        list.addElement(69);
        list.addElement(1);
        list.addElement(4);

        list.printList();
        list.sortList();
        list.printList();
    }

}
