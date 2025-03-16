package Practice_7.LinkedList_tasks.Task5;

public class Main {
    public static void main(String[] args) {
        ListWithoutDuplicates list = new ListWithoutDuplicates();
        list.addElement(3);
        list.addElement(5);
        list.addElement(3);
        list.addElement(9);
        list.addElement(8);
        list.addElement(9);

        list.printList();
        list.deleteDuplicates();
        list.printList();


    }
}
