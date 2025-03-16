package Practice_7.ArrayList_tasks.Task5.SortedList;

import java.util.ArrayList;

public class SortedList {
    // Напишите метод, который принимает ArrayList<Integer> и
    // возвращает новый список с числами в отсортированном порядке
    // без использования Collections.sort().

    private ArrayList <Integer> list;

    public SortedList(){
        this.list = new ArrayList<>();
    }
    public void addElement(int element){
        list.add(element);
    }
    public void printList(){
        list.forEach(element -> System.out.print(element + " "));
        System.out.println();
    }
    public void sortList() {
        // цикл проходит по неотсортированному массиву
        for (int j = 0; j < (list.size() - 2); j++) {
            // цикл перемещает самое большое число в конец
            for (int i = 0; i < (list.size() - 1); i++) {
                if (list.get(i) > list.get(i + 1)) {
                    int minNumber;
                    minNumber = list.get(i + 1);
                    list.set((i + 1), list.get(i));
                    list.set(i, minNumber);
                }
            }
        }
    }
}
