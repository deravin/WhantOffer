package Practice_7.LinkedHashSet_tasks.Task2;

public class Main {
    public static void main(String[] args) {
        LinkedHashSetTask2 set = new LinkedHashSetTask2();
        set.addElement(2);
        set.addElement(4);
        set.addElement(5);
        set.addElement(6);

        set.print();
        set.addElement(7);
        set.print();
        set.addElement(4);
        set.print();
    }
}
