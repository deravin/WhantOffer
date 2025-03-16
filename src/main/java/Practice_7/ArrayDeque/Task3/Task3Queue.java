package Practice_7.ArrayDeque.Task3;

import java.util.ArrayDeque;

public class Task3Queue {
    //Используйте ArrayDeque как очередь:
    // добавьте элементы в начало и конец, извлеките из обоих концов.

    private ArrayDeque<Integer> queue;
    public Task3Queue(){
        this.queue = new ArrayDeque<>();
    }
    public void addFirstElement(Integer element){
        queue.addFirst(element);
    }
    public void addLastElement(Integer element){
        queue.addLast(element);
    }
    public void pollFirstElement(){
        queue.pollFirst();
    }
    public void poolLastElement(){
        queue.pollLast();
    }
    public void printQueue(){
        queue.forEach(element -> System.out.print(element + " "));
        System.out.println();
    }
}
