package Practice_7.OtherTasks.Task7;

public class Main {
    public static void main(String[] args) {
        ListOfNumbers list = new ListOfNumbers();
        list.addNumber(2);
        list.addNumber(10);
        list.addNumber(5);
        list.addNumber(87);
        list.addNumber(24);
        list.addNumber(6);

        list.printList();
        System.out.println(list.printMaxNumber());
        System.out.println(list.printMinNumber());
    }
}
