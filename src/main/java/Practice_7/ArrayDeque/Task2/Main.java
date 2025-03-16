package Practice_7.ArrayDeque.Task2;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.addElement("Element8");
        stack.addElement("Element4");
        stack.addElement("Element2");
        stack.addElement("Element5");
        stack.addElement("Element9");

        stack.printDeque();
        stack.getLastElement();
        stack.printDeque();
        stack.getLastElement();
    }
}
