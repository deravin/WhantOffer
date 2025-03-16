package Practice_7.HashSet_tasks.Task3;

public class Main {
    public static void main(String[] args) {
        ListWithoutDuplicates list1 = new ListWithoutDuplicates();
        list1.addElements("qwe");
        list1.addElements("rttyy");
        list1.addElements("qweddd");
        list1.addElements("qwe");
        list1.addElements("u");
        list1.addElements("u");

        list1.printList();
        System.out.println(list1.convertListToSet());
    }
}
