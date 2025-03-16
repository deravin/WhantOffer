package Practice_7.ArrayList_tasks.Task5.SortedList;

import java.util.ArrayList;

public class SortedList_1 {
    // Напишите метод, который принимает ArrayList<Integer>
    // и возвращает новый список с числами в отсортированном порядке
    // без использования Collections.sort().
    private ArrayList<Integer> list1;

    public SortedList_1(){
        this.list1 = new ArrayList<>();
    }

    public void addElement(int element){
        list1.add(element);
    }

    public void printList(){
        list1.forEach(element -> System.out.print(element + " "));
        System.out.println();
    }

    public void sortList() {
        int i;
        for (i = 0; i < list1.size() - 1; i++) {
            for (int j = 0; j < list1.size() - i - 1; j++) {
                if (list1.get(j) > list1.get(j + 1)) {
                    int bigNumber = list1.get(j);
                    list1.set(j, list1.get(j + 1));
                    list1.set((j + 1), bigNumber);
                }
            }
        }
    }
}
