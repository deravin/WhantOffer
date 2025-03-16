package Practice_7.ArrayDeque.Task2;

import java.util.ArrayDeque;

public class Stack {
    //Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.
    private ArrayDeque<String> stack;
    public Stack(){
        this.stack = new ArrayDeque<>();
    }
    public void addElement(String element){
        stack.add(element);
    }
    public void getLastElement(){
        String lastElement = stack.pollLast();
        System.out.println(lastElement);
    }
    public void printDeque(){
        System.out.println(stack);
    }
}
