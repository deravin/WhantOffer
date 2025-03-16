package Practice_7.LinkedList_tasks.Task4;


public class Main {
    public static void main(String[] args) {
        List list1 = new List();
        List list2 = new List();

        list1.addElement(1);
        list1.addElement(2);
        list1.addElement(3);
        list1.addElement(4);

        list2.addElement(10);
        list2.addElement(20);
        list2.addElement(30);
        list2.addElement(40);

        list1.deleteSecondElement();
        list1.printList();

        list2.deleteSecondElement();
        list2.printList();
    }
}
